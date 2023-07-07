package com.part03.day19.code.four;


/**
 * @author aserendipper
 * @date 2023/7/6
 * @desc 依赖注入方式
 */
public class Notification {
    private MessageSender messageSender;
    
    public Notification(MessageSender messageSender) {
        this.messageSender = messageSender;
    }
    
    public void sendMessage(String cellphone, String message) {
        messageSender.send(cellphone, message);
    }
    
}
