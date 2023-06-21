package com.part02.day08.code.logger;

import java.io.IOException;
import java.util.logging.Level;

/**
 * @author aserendipper
 * @date 2023/6/20
 * @desc 抽象类
 */
public abstract class Logger {
    private String name;
    private boolean enabled;
    private Level minPermittedLevel;
    
    public Logger(String name, boolean enabled, Level minPermittedLevel) {
        this.name = name;
        this.enabled = enabled;
        this.minPermittedLevel = minPermittedLevel;
    }
    
    public void log(Level level, String message) throws IOException {
        boolean loggable = enabled && (minPermittedLevel.intValue() <= level.intValue());
        if (!loggable) {
            return;
        }
        doLog(level, message);
    }
    
    protected abstract void doLog(Level level, String message) throws IOException;
}
