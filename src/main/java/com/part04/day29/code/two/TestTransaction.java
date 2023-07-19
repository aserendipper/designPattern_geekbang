package com.part04.day29.code.two;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.part04.day29.code.one.Status;
import org.junit.Test;

/**
 * @author aserendipper
 * @date 2023/7/18
 * @desc
 */
public class TestTransaction {

    /**
     * 通过mock的方式来把rpc服务的调用解耦出来，这样就可以在测试中控制rpc服务的返回值，从而测试不同的业务逻辑
     */
    @Test
    public void testExecute() {
        long buyerId = 1L;
        long sellerId = 2L;
        long productId = 1L;
        String orderId = "12";
        double amount = 100.0;
        Transaction transaction = new Transaction(null, buyerId, sellerId, productId, orderId, amount);
        transaction.setWalletRpcService(new MockWalletRpcServiceOne());
        boolean executedResult = transaction.execute();
        assertTrue(executedResult);
        assertEquals(Status.EXECUTED, transaction.getStatus());
    }

    /**
     * 通过mock的方式来把lock锁的实现解耦出来，这样就可以在测试中控制lock锁的返回值，从而测试不同的业务逻辑
     */
    @Test
    public void testExecute1() {
        long buyerId = 1L;
        long sellerId = 2L;
        long productId = 1L;
        String orderId = "12";
        double amount = 100.0;
        TransactionLock lock = new TransactionLock();
        Transaction transaction = new Transaction(null, buyerId, sellerId, productId, orderId, amount);
        transaction.setWalletRpcService(new MockWalletRpcServiceOne());
        transaction.setLock(lock);
        boolean executedResult = transaction.execute();
        assertTrue(executedResult);
        assertEquals(Status.EXECUTED, transaction.getStatus());
    }

    /**
     * 通过set方法来mock数据
     */
    @Test
    public void testExecute3_1() {
        long buyerId = 1L;
        long sellerId = 2L;
        long productId = 1L;
        String orderId = "12";
        double amount = 100.0;
        Transaction transaction = new Transaction(null, buyerId, sellerId, productId, orderId, amount);
        transaction.setCreateTimestamp(System.currentTimeMillis() - 14 * 24 * 3600 * 1000L);
        boolean executedResult = transaction.execute();
        assertTrue(executedResult);
        assertEquals(Status.EXECUTED, transaction.getStatus());
    }

    /**
     * 当Transaction并未提供setCreateTimestamp方法时，可以通过匿名内部类的方式来mock数据
     */
    @Test
    public void testExecute3_2() {
        long buyerId = 1L;
        long sellerId = 2L;
        long productId = 1L;
        String orderId = "12";
        double amount = 100.0;
        Transaction transaction = new Transaction(null, buyerId, sellerId, productId, orderId, amount){
            @Override
            protected boolean isExpired() {
                return true;
            }
        };
        boolean executedResult = transaction.execute();
        assertTrue(executedResult);
        assertEquals(Status.EXECUTED, transaction.getStatus());
    }
}
