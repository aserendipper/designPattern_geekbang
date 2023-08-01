package com.part06.day43.code.two;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author aserendipper
 * @date 2023/7/31
 * @desc
 */
public class IdGenerator {
    private AtomicLong id = new AtomicLong(0);
    private static IdGenerator instance;
    private static SharedObjectStorage storage = new FileSharedObjectStorage();
    private static DistributedLock lock = new DistributedLock();
    
    private IdGenerator() {
    }
    
    public synchronized static IdGenerator getInstance(){
        if (instance == null) {
            lock.lock();
            instance = storage.load(IdGenerator.class);
        }
        return instance;
    }
    
    public synchronized void freeInstance() {
        storage.save(this, IdGenerator.class);
        instance = null;
        lock.unlock();
    }
    
    public Long getId() {
        return id.incrementAndGet();
    }
    
}
