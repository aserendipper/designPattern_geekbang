package com.part06.day43.code.one;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author aserendipper
 * @date 2023/7/31
 * @desc
 */
public class IdGenerator {
    private AtomicLong id = new AtomicLong(0);
    
    private static final ConcurrentHashMap<Long, IdGenerator> instances = new ConcurrentHashMap<>();
    
    private IdGenerator() {
    }
    
    public static IdGenerator getInstance(){
        Long currentThreadId = Thread.currentThread().getId();
        instances.putIfAbsent(currentThreadId, new IdGenerator());
        return instances.get(currentThreadId);
    }
    
    public Long getId() {
        return id.incrementAndGet();
    }
    
}
