package com.part03.day19.code.four;

/**
 * @author aserendipper
 * @date 2023/7/6
 * @desc 站内信发送类
 */
public class InboxSender implements MessageSender {

    @Override
    public void send(String cellphone, String message) {
        System.out.println("Send message to " + cellphone + ": " + message);
    }
}
