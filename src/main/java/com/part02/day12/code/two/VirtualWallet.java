package com.part02.day12.code.two;

import java.math.BigDecimal;

/**
 * @author aserendipper
 * @date 2023/6/27
 * @desc domain 领域模型
 */
public class VirtualWallet {
    private Long id;
    private Long createTime = System.currentTimeMillis();
    private BigDecimal balance = BigDecimal.ZERO;
    private boolean isAllowedOverdraft = true;
    private BigDecimal overdraftAmount = BigDecimal.ZERO;
    private BigDecimal frozenAmount = BigDecimal.ZERO;
    
    public VirtualWallet(Long preAllocatedId) {
        this.id = preAllocatedId;
    }
    
    public BigDecimal getBalance() {
        return this.balance;
    }
    
    public void debit(BigDecimal amount) {
        if (this.balance.compareTo(amount) < 0) {
            throw new RuntimeException("余额不足");
        }
        this.balance.subtract(amount);
    }
    
    public void credit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new RuntimeException("金额不能为负");
        }
        this.balance.add(amount);
    }
    
    public void freeze(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new RuntimeException("金额不能为负");
        }
        if (amount.compareTo(this.balance.add(this.overdraftAmount).subtract(this.frozenAmount)) > 0) {
            throw new RuntimeException("冻结金额超过可用金额");
        }
        this.frozenAmount.add(amount);
    }
    
    public BigDecimal getAvailableBalance() {
        return this.balance.add(this.overdraftAmount).subtract(this.frozenAmount);
    }
}
