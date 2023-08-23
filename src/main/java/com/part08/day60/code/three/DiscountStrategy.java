package com.part08.day60.code.three;

import com.part08.day60.code.two.Order;

public interface DiscountStrategy {
    double calDiscount(Order order);
}
