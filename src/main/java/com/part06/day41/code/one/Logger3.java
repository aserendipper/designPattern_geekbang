package com.part06.day41.code.one;

import java.io.File;
import java.io.FileWriter;

/**
 * @author aserendipper
 * @date 2023/7/29
 * @desc
 */
public class Logger3 {
    private FileWriter writer;
    /**
     * 单例模式，保证了线程安全
     */
    private static final Logger3 instance = new Logger3();
    
    public Logger3() {
        File file = new File("log.txt");
        try {
            writer = new FileWriter(file, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void log(String message) {
        try {
            writer.write(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static Logger3 getInstance() {
        return instance;
    }
}
