package com.part04.day29.code.two;

import com.part04.day29.code.one.IdGenerator;
import com.part04.day29.code.one.RedisDistributedLock;
import com.part04.day29.code.one.Status;
import com.part04.day29.code.one.WalletRpcService;

/**
 * @author aserendipper
 * @date 2023/7/18
 * @desc
 */
public class Transaction {
    private String id;
    private long   buyerId;
    private long   sellerId;
    private long   productId;
    private String orderId;
    private long createTimestamp;
    private Double amount;
    private Status status;
    private String walletTransactionId;

    private WalletRpcService walletRpcService;
    
    private TransactionLock lock;

    public void setCreateTimestamp(long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public void setWalletRpcService(WalletRpcService walletRpcService) {
        this.walletRpcService = walletRpcService;
    }

    public void setLock(TransactionLock lock) {
        this.lock = lock;
    }

    public Status getStatus() {
        return status;
    }

    public Transaction(String preAssignedId, long buyerId, long sellerId, long productId, String orderId, double amount) {
        this.buyerId = buyerId;
        this.sellerId = sellerId;
        this.productId = productId;
        this.orderId = orderId;
        this.amount = amount;
        this.status = Status.TO_BE_EXECUTED;
        this.createTimestamp = System.currentTimeMillis();
    }
    
    protected void fillTransactionId(String preAssignedId) {
        if (preAssignedId != null && !preAssignedId.isEmpty()) {
            this.id = preAssignedId;
        } else {
            this.id = IdGenerator.generateTransactionId();
        }
        if (!this.id.startsWith("t_")) {
            this.id = "t_" + preAssignedId;
        }
    }
    
    public boolean execute() {
        if (buyerId == 0 || sellerId == 0 || amount < 0.0) {
            this.status = Status.EXECUTED_FAILED;
            return false;
        }
        if (status == Status.EXECUTED) {
            return true;
        }
        boolean isLocked = false;
        try {
            isLocked = lock.lock(id);
            if (!isLocked) {
                this.status = Status.EXECUTED_FAILED;
                return false;
            }
            if (status == Status.EXECUTED) {
                return true;
            }
            if (isExpired()) {
                this.status = Status.EXPIRED;
                return false;
            }
            String walletTransactionId = walletRpcService.moveMoney(id, buyerId, sellerId, amount);
            if (walletTransactionId != null) {
                this.walletTransactionId = walletTransactionId;
                this.status = Status.EXECUTED;
                return true;
            } else {
                this.status = Status.EXECUTED_FAILED;
                return false;
            }
        } finally {
            if (isLocked) {
                lock.unlock(id);
            }
        }
    }
    
    protected boolean isExpired() {
        long executionInvokedTimestamp = System.currentTimeMillis();
        return executionInvokedTimestamp - createTimestamp > 14 * 24 * 3600 * 1000;
    }
}
