package com.part06.day41.code.two;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author aserendipper
 * @date 2023/7/29
 * @desc
 */
public class IdGenerator {
    private AtomicLong id = new AtomicLong(0);
    private static final IdGenerator instance = new IdGenerator();
    
    private IdGenerator() {
        
    }
    
    public static IdGenerator getInstance() {
        return instance;
    }
    
    public long getId() {
        return id.incrementAndGet();
    }
}
