package com.part06.day43.code.three;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author aserendipper
 * @date 2023/7/31
 * @desc
 */
public class Logger {
    private static final ConcurrentHashMap<String, Logger> instances = new ConcurrentHashMap<>();
    
    private Logger() {
    }
    
    public static Logger getInstance(String loggerName) {
        instances.putIfAbsent(loggerName, new Logger());
        return instances.get(loggerName);
    }
    
    public void log() {
        
    }
}
