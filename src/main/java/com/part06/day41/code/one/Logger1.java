package com.part06.day41.code.one;

import java.io.File;
import java.io.FileWriter;

/**
 * @author aserendipper
 * @date 2023/7/29
 * @desc
 */
public class Logger1 {
    private FileWriter writer;
    
    public Logger1() {
        File file = new File("log.txt");
        try {
            writer = new FileWriter(file, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void log(String message) {
        try {
            // 对象级别的锁，如果是多个类实例，那么就会有多个锁，无法保证线程安全
            synchronized (this) {
                writer.write(message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
