package com.part08.day57.code.one;

import com.part08.day56.code.two.RegObserver;

/**
 * @author aserendipper
 * @date 2023/8/18
 * @desc 异步非阻塞第一种实现方式
 */
public class RegPromotionObserver implements RegObserver {
    @Override
    public void handleRegSuccess(long userId) {
        Thread thread = new Thread(() -> System.out.println("给用户" + userId + "发送注册成功消息"));
        thread.start();
    }
}
