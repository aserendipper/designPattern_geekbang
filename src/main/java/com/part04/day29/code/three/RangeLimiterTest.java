package com.part04.day29.code.three;

import static org.junit.Assert.assertTrue;

/**
 * @author aserendipper
 * @date 2023/7/19
 * @desc
 */
public class RangeLimiterTest {
    @org.junit.Test
    public void testMove_betweenRange() {
        RangeLimiter limiter = new RangeLimiter();
        assertTrue(limiter.move(1));
        assertTrue(limiter.move(3));
        assertTrue(limiter.move(-5));
    }

    @org.junit.Test
    public void testMove_exceedRange() {
        RangeLimiter limiter = new RangeLimiter();
        assertTrue(limiter.move(6));
    }
}
