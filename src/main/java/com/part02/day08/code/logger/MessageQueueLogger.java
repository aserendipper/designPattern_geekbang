package com.part02.day08.code.logger;

import java.io.IOException;
import java.util.logging.Level;

/**
 * @author aserendipper
 * @date 2023/6/20
 * @desc 抽象类的子类：输出日志到消息队列(比如kafka)
 */
public class MessageQueueLogger extends Logger {
    
    private MessageQueueClient msgQueueClient;

    public MessageQueueLogger(String name, boolean enabled, Level minPermittedLevel, MessageQueueClient msgQueueClient) {
        super(name, enabled, minPermittedLevel);
        this.msgQueueClient = msgQueueClient;
    }

    @Override
    protected void doLog(Level level, String message) throws IOException {
        //格式化level和message，输出到消息中间件
        msgQueueClient.send();
    }
}
