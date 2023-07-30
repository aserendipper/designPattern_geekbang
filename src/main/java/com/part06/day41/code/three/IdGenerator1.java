package com.part06.day41.code.three;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author aserendipper
 * @date 2023/7/29
 * @desc 饿汉式单例
 */
public class IdGenerator1 {
    private AtomicLong id = new AtomicLong(0);
    private static final IdGenerator1 instance = new IdGenerator1();
    
    private IdGenerator1() {
        
    }
    
    public static IdGenerator1 getInstance() {
        return instance;
    }
    
    public long getId() {
        return id.incrementAndGet();
    }
}
