package com.part08.day57.code.four;

import com.part08.day57.code.three.Subscribe;

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
