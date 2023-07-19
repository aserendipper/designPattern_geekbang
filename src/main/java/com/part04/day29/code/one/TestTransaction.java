package com.part04.day29.code.one;

import static org.junit.Assert.assertTrue;

import com.part04.day29.code.one.Transaction;
import org.junit.Test;

/**
 * @author aserendipper
 * @date 2023/7/18
 * @desc
 */
public class TestTransaction {
    @Test
    public void testExecute() {
        long buyerId = 1L;
        long sellerId = 2L;
        long productId = 1L;
        String orderId = "12";
        double amount = 100.0;
        Transaction transaction = new Transaction(null, buyerId, sellerId, productId, orderId, amount);
        boolean executedResult = transaction.execute();
        assertTrue(executedResult);
    }
}
