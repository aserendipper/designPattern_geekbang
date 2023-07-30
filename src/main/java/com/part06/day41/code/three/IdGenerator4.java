package com.part06.day41.code.three;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author aserendipper
 * @date 2023/7/29
 * @desc 静态内部类
 */
public class IdGenerator4 {
    private AtomicLong id = new AtomicLong(0);
    
    private IdGenerator4() {
        
    }
    
    private static class SingletonHolder {
        private static final IdGenerator4 instance = new IdGenerator4();
    }
    
    public static IdGenerator4 getInstance() {
        return SingletonHolder.instance;
    }
    
    public long getId() {
        return id.incrementAndGet();
    }
}
