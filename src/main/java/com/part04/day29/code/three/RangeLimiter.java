package com.part04.day29.code.three;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author aserendipper
 * @date 2023/7/19
 * @desc
 */
public class RangeLimiter {
    private static AtomicInteger position = new AtomicInteger(0);
    public static final int MAX_PERMITS = 5;
    public static final int MIN_PERMITS = -5;
    
    public boolean move(int delta) {
        int currentPos = position.addAndGet(delta);
        return currentPos <= MAX_PERMITS && currentPos >= MIN_PERMITS;
    }
}
