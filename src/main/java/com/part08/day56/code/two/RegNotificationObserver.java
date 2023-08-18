package com.part08.day56.code.two;

/**
 * @author aserendipper
 * @date 2023/8/18
 * @desc
 */
public class RegNotificationObserver implements RegObserver {

    @Override
    public void handleRegSuccess(long userId) {
        System.out.println("RegNotificationObserver is notified");
    }
}
