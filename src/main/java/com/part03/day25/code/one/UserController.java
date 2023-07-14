package com.part03.day25.code.one;

import java.util.concurrent.TimeUnit;

/**
 * @author aserendipper
 * @date 2023/7/14
 * @desc
 */
public class UserController {
    private Metrics metrics = new Metrics();

    public UserController() {
        metrics.startRepeatedReport(60, TimeUnit.SECONDS);
    }

    public void registry() {
        long startTimestamp = System.currentTimeMillis();
        metrics.recordTimestamps("register", startTimestamp);
        System.out.println("注册成功");
        long respTime = System.currentTimeMillis() - startTimestamp;
        metrics.recordResponseTime("register", respTime);
    }
    
    public void login() {
        long startTimestamp = System.currentTimeMillis();
        metrics.recordTimestamps("login", startTimestamp);
        System.out.println("登录成功");
        long respTime = System.currentTimeMillis() - startTimestamp;
        metrics.recordResponseTime("login", respTime);
    }
    
}
