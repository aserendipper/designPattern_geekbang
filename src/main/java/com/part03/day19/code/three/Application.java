package com.part03.day19.code.three;

/**
 * @author aserendipper
 * @date 2023/7/6
 * @desc
 */
public class Application {

    public static void main(String[] args) {
        // 非依赖注入方式
        Notification notification = new Notification();
        
        // 依赖注入方式
        MessageSender messageSender = new MessageSender();
        Notification1 notification1 = new Notification1(messageSender);
    }
}
