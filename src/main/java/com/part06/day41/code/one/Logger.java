package com.part06.day41.code.one;

import java.io.File;
import java.io.FileWriter;

/**
 * @author aserendipper
 * @date 2023/7/29
 * @desc
 */
public class Logger {
    private FileWriter writer;
    
    public Logger() {
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
}
