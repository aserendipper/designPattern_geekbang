package com.part02.day12.code.two;

import com.part02.day12.code.one.VirtualWalletEntity;
import java.math.BigDecimal;

/**
 * @author aserendipper
 * @date 2023/6/27
 * @desc
 */
public class VirtualWalletRepository {

    public VirtualWalletEntity getWalletEntity(Long walletId) {
        return new VirtualWalletEntity();
    }

    public BigDecimal getBalance(Long walletId) {
        return new BigDecimal(0);
    }

    public void updateBalance(Long walletId, BigDecimal subtract) {
        
    }
}
