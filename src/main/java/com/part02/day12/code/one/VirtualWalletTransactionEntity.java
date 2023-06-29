package com.part02.day12.code.one;

import java.math.BigDecimal;

/**
 * @author aserendipper
 * @date 2023/6/27
 * @desc
 */
public class VirtualWalletTransactionEntity {
    private BigDecimal amount;
    private Long createTime;
    private Long fromWalletId;
    private Long toWalletId;
    private Status status;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getFromWalletId() {
        return fromWalletId;
    }

    public void setFromWalletId(Long fromWalletId) {
        this.fromWalletId = fromWalletId;
    }

    public Long getToWalletId() {
        return toWalletId;
    }

    public void setToWalletId(Long toWalletId) {
        this.toWalletId = toWalletId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
