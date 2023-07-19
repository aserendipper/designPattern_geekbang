package com.part04.day29.code.one;

/**
 * @author aserendipper
 * @date 2023/7/18
 * @desc
 */
public class Transaction {
    private String id;
    private long buyerId;
    private long sellerId;
    private long productId;
    private String orderId;
    private long createTimestamp;
    private Double amount;
    private Status status;
    private String walletTransactionId;

    public Transaction(String preAssignedId, long buyerId, long sellerId, long productId, String orderId, double amount) {
        if (preAssignedId != null && !preAssignedId.isEmpty()) {
            this.id = preAssignedId;
        } else {
            this.id = IdGenerator.generateTransactionId();
        }
        if (!this.id.startsWith("t_")) {
            this.id = "t_" + preAssignedId;
        }
        this.buyerId = buyerId;
        this.sellerId = sellerId;
        this.productId = productId;
        this.orderId = orderId;
        this.amount = amount;
        this.status = Status.TO_BE_EXECUTED;
        this.createTimestamp = System.currentTimeMillis();
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
            isLocked = RedisDistributedLock.lockTransction(id);
            if (!isLocked) {
                this.status = Status.EXECUTED_FAILED;
                return false;
            }
            if (status == Status.EXECUTED) {
                return true;
            }
            long executionInvokedTimestamp = System.currentTimeMillis();
            if (executionInvokedTimestamp - createTimestamp > 14 * 24 * 3600 * 1000) {
                this.status = Status.EXPIRED;
                return false;
            }
            WalletRpcService walletRpcService = new WalletRpcService();
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
                RedisDistributedLock.unlock(id);
            }
        }
    }
}
