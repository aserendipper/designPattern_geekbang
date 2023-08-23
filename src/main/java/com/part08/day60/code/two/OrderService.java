package com.part08.day60.code.two;

public class OrderService {
    /**
     * if-else
     */
    public double discount(Order order) {
        double discount = 0.0;
        OrderType type = order.getOrderType();
        if (type.equals(OrderType.NORMAL)) {
            // ...
        } else if (type.equals(OrderType.GROUPON)) {
            // ...
        } else if (type.equals(OrderType.PROMOTION)) {
            // ...
        } 
        return discount;
    }
}
