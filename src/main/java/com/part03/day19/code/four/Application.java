package com.part03.day19.code.four;

/**
 * @author aserendipper
 * @date 2023/7/6
 * @desc
 */
public class Application {

    public static void main(String[] args) {
        MessageSender messageSender = new SmsSender();
        Notification notification = new Notification(messageSender);
    }
}
