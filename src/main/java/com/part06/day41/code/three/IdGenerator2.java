package com.part06.day41.code.three;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author aserendipper
 * @date 2023/7/29
 * @desc 懒汉式单例
 */
public class IdGenerator2 {
    private AtomicLong id = new AtomicLong(0);
    private static IdGenerator2 instance;
    
    private IdGenerator2() {
        
    }
    
    public static synchronized IdGenerator2 getInstance() {
        if (instance == null) {
            instance = new IdGenerator2();
        }
        return instance;
    }
    
    public long getId() {
        return id.incrementAndGet();
    }
}
