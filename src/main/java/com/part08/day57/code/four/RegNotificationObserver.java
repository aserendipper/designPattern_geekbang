package com.part08.day57.code.four;

import com.part08.day57.code.three.Subscribe;

/**
 * @author aserendipper
 * @date 2023/8/18
 * @desc
 */
public class RegNotificationObserver {

    @Subscribe
    public void handleRegSuccess(Integer userId) {
        System.out.println("RegNotificationObserver is notified");
    }
}
