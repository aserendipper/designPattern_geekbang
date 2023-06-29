package com.part02.day12.code.one;

import java.math.BigDecimal;

/**
 * @author aserendipper
 * @date 2023/6/27
 * @desc
 */
public class VirtualWalletController {

    /**
     * 通过构造函数或者IOC框架注入
     */
    private VirtualWalletService virtualWalletService;

    /**
     * 查询余额
     * @param walletId 钱包ID
     * @return VirtualWalletBo
     */
    public Long getBalance(Long walletId) {
        return virtualWalletService.getBalance(walletId).longValue();
    }

    /**
     * 出账
     * @param walletId 钱包ID
     * @param amount 金额
     * @throws Exception 异常
     */
    public void debit(Long walletId, BigDecimal amount) throws Exception {
        virtualWalletService.debit(walletId, amount);
    }

    /**
     * 入账
     * @param walletId 钱包ID
     * @param amount 金额
     * @throws Exception 异常
     */
    public void credit(Long walletId, BigDecimal amount) throws Exception {
        virtualWalletService.credit(walletId, amount);
    }

    /**
     * 转账
     * @param fromWalletId 钱包ID
     * @param toWalletId 钱包ID
     * @param amount 金额
     * @throws Exception 异常
     */
    public void transfer(Long fromWalletId, Long toWalletId, BigDecimal amount) throws Exception {
        virtualWalletService.transfer(fromWalletId, toWalletId, amount);
    }
}
