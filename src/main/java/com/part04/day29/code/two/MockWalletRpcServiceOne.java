package com.part04.day29.code.two;

import com.part04.day29.code.one.WalletRpcService;

/**
 * @author aserendipper
 * @date 2023/7/18
 * @desc
 */
public class MockWalletRpcServiceOne extends WalletRpcService {
    @Override
    public String moveMoney(String id, long buyerId, long sellerId, Double amount) {
        return "123456";
    }
}
