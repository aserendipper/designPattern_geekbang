package com.part02.day12.code.one;

import java.math.BigDecimal;

/**
 * @author aserendipper
 * @date 2023/6/27
 * @desc
 */
public class VirtualWalletService {
    /**
     * 通过构造函数或者IOC框架注入
     */
    private VirtualWalletRepository walletRepo;
    private VirtualWalletTransactionRepository transactionRepo;

    /**
     * 查询余额
     * @param walletId 钱包ID
     * @return VirtualWalletBo
     */
    public VirtualWalletBo getVirtualWallet(Long walletId) {
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        VirtualWalletBo walletBo = convert(walletEntity);
        return walletBo;
    }

    /**
     * 转换
     * @param walletEntity 钱包实体
     * @return VirtualWalletBo
     */
    private VirtualWalletBo convert(VirtualWalletEntity walletEntity) {
        return new VirtualWalletBo();
    }

    /**
     * 获取余额
     * @param walletId 钱包ID
     * @return 余额
     */
    public BigDecimal getBalance(Long walletId) {
        return walletRepo.getBalance(walletId);
    }

    /**
     * 减少余额
     * @param walletId 钱包ID
     * @param amount 金额
     * @throws Exception 异常
     */
    public void debit(Long walletId, BigDecimal amount) throws Exception {
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        BigDecimal balance = walletEntity.getBalance();
        if (balance.compareTo(amount) < 0) {
            throw new Exception("...");
        }
        walletRepo.updateBalance(walletId, balance.subtract(amount));
    }

    /**
     * 增加余额
     * @param walletId 钱包ID
     * @param amount 金额
     * @throws Exception 异常
     */
    public void credit(Long walletId, BigDecimal amount) throws Exception {
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        BigDecimal balance = walletEntity.getBalance();
        walletRepo.updateBalance(walletId, balance.add(amount));
    }

    /**
     * 转账
     * @param fromWalletId from
     * @param toWalletId to 
     * @param amount 金额
     * @throws Exception 异常
     */
    public void transfer(Long fromWalletId, Long toWalletId, BigDecimal amount) throws Exception {
        VirtualWalletTransactionEntity transactionEntity = new VirtualWalletTransactionEntity();
        transactionEntity.setAmount(amount);
        transactionEntity.setCreateTime(System.currentTimeMillis());
        transactionEntity.setFromWalletId(fromWalletId);
        transactionEntity.setToWalletId(toWalletId);
        transactionEntity.setStatus(Status.TO_BE_EXECUTED);
        Long tranactionId = transactionRepo.saveTransaction(transactionEntity);
        try {
            debit(fromWalletId, amount);
            credit(toWalletId, amount);
        } catch (Exception e) {
            transactionRepo.updateStatus(tranactionId, Status.CLOSED);
            throw e;
        }
        transactionRepo.updateStatus(tranactionId, Status.EXECUTED);
    }
}
