package com.part06.day41.code.three;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author aserendipper
 * @date 2023/7/29
 * @desc 双重检测
 */
public class IdGenerator3 {
    private AtomicLong id = new AtomicLong(0);
    /**
     * volatile关键字确保：防止instance未完全初始化就被其他线程访问到
     */
    private static volatile IdGenerator3 instance;
    
    private IdGenerator3() {
        
    }
    
    public static IdGenerator3 getInstance() {
        if (instance == null) {
            synchronized (IdGenerator3.class) {
                if (instance == null) {
                    instance = new IdGenerator3();
                }
            }
        }
        return instance;
    }
    
    public long getId() {
        return id.incrementAndGet();
    }
}
