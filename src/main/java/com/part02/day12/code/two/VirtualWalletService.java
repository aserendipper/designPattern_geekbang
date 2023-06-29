package com.part02.day12.code.two;

import com.part02.day12.code.one.VirtualWalletEntity;
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
    
    public VirtualWallet getVirtualWallet(Long walletId) {
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        VirtualWallet wallet = convert(walletEntity);
        return wallet;
    }

    private VirtualWallet convert(VirtualWalletEntity walletEntity) {
        return new VirtualWallet(walletEntity.getId());
    }
    
    public BigDecimal getBalance(Long walletId) {
        return walletRepo.getBalance(walletId);
    }
    
    public void debit(Long walletId, BigDecimal amount) {
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        VirtualWallet wallet = convert(walletEntity);
        wallet.debit(amount);
        walletRepo.updateBalance(walletId, wallet.getBalance());
    }
    
    public void credit(Long walletId, BigDecimal amount) {
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        VirtualWallet wallet = convert(walletEntity);
        wallet.credit(amount);
        walletRepo.updateBalance(walletId, wallet.getBalance());
    }
    
    public void transfer(Long fromWalletId, Long toWalletId, BigDecimal amount) {
        // 跟之前一样
    }
}
