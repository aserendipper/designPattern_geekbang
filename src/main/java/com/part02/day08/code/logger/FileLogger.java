package com.part02.day08.code.logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.logging.Level;

/**
 * @author aserendipper
 * @date 2023/6/20
 * @desc 抽象类的子类：输出日志到文件
 */
public class FileLogger extends Logger {
    private Writer fileWriter;

    public FileLogger(String name, boolean enabled, Level minPermittedLevel, String filepath) throws IOException {
        super(name, enabled, minPermittedLevel);
        this.fileWriter = new FileWriter(filepath);
    }

    @Override
    protected void doLog(Level level, String message) throws IOException {
        //格式化level和message，输出到日志文件
        fileWriter.write("...");
    }
}
