package com.part08.day57.code.two;

import com.google.common.eventbus.Subscribe;

/**
 * @author aserendipper
 * @date 2023/8/18
 * @desc
 */
public class RegPromotionObserver {

    @Subscribe
    public void handleRegSuccess(Long userId) {
        System.out.println("RegPromotionObserver is notified");
    }
}
