package com.part07.day48.code.three;

import com.part02.day11.code.one.UserVo;
import com.part03.day26.code.one.RequestInfo;
import com.part05.day40.code.three.MetricsCollector;
import com.part07.day48.code.one.UserController;

/**
 * @author aserendipper
 * @date 2023/8/8
 * @desc
 */
public class UserControllerProxy extends UserController {
    private MetricsCollector metricsCollector;

    public UserControllerProxy() {
        this.metricsCollector = new MetricsCollector();
    }

    @Override
    public UserVo login(String telephone, String password) {
        long startTimeStamp = System.currentTimeMillis();
        
        UserVo userVo = super.login(telephone, password);
        
        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimeStamp;
        metricsCollector.recordRequest(new RequestInfo("login", responseTime, startTimeStamp));
        
        return userVo;
    }

    @Override
    public UserVo register(String telephone, String password) {
        long startTimeStamp = System.currentTimeMillis();
        
        UserVo userVo = super.register(telephone, password);
        
        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimeStamp;
        metricsCollector.recordRequest(new RequestInfo("register", responseTime, startTimeStamp));
        return userVo;
    }
}
