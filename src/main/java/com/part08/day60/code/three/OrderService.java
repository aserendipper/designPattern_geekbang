package com.part08.day60.code.three;

import com.part08.day60.code.two.Order;
import com.part08.day60.code.two.OrderType;

public class OrderService {
    /**
     * 策略模式
     */
    public double discount(Order order) {
        OrderType type = order.getOrderType();
        DiscountStrategy discountStrategy = DiscountStrategyFactory.getDiscountStrategy(type);
        return discountStrategy.calDiscount(order);
    }
}
