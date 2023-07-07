package com.part03.day19.code.three;

/**
 * @author aserendipper
 * @date 2023/7/6
 * @desc 非依赖注入方式
 */
public class Notification {
    private MessageSender messageSender;
    
    public Notification() {
        this.messageSender = new MessageSender();
    }
    
    public void sendMessage(String cellphone, String message) {
        messageSender.send(cellphone, message);
    }
    
}
