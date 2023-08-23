package com.part08.day60.code.three;

import com.part08.day60.code.two.Order;

public class NormalDiscountStrategy implements DiscountStrategy {

    @Override
    public double calDiscount(Order order) {
        return 0.0;
    }

}
