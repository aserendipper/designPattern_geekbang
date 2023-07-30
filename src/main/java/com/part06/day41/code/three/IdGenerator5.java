package com.part06.day41.code.three;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author aserendipper
 * @date 2023/7/29
 * @desc 枚举
 */
public enum IdGenerator5 {
    INSTANCE;
    private AtomicLong id = new AtomicLong(0);
    
    
    public long getId() {
        return id.incrementAndGet();
    }
}
