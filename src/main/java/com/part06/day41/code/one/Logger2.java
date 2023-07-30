package com.part06.day41.code.one;

import java.io.File;
import java.io.FileWriter;

/**
 * @author aserendipper
 * @date 2023/7/29
 * @desc
 */
public class Logger2 {
    private FileWriter writer;
    
    public Logger2() {
        File file = new File("log.txt");
        try {
            writer = new FileWriter(file, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void log(String message) {
        try {
            // 类级别的锁，保证了线程安全
            synchronized (Logger2.class) {
                writer.write(message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
