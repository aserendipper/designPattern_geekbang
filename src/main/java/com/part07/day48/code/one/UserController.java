package com.part07.day48.code.one;

import com.part02.day11.code.one.UserVo;
import com.part05.day40.code.three.MetricsCollector;
import com.part03.day26.code.one.RequestInfo;

/**
 * @author aserendipper
 * @date 2023/8/8
 * @desc
 */
public class UserController {
    // ...省略其他属性和方法...
    // 依赖注入
    private MetricsCollector metricsCollector;
    
    public UserVo login(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();
        // ... 省略login逻辑...
        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        metricsCollector.recordRequest(new RequestInfo("login", responseTime, startTimestamp));
        // 返回UserVo数据
        return null;
    }
    
    public UserVo register(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();
        // ... 省略register逻辑...
        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        metricsCollector.recordRequest(new RequestInfo("register", responseTime, startTimestamp));
        // 返回UserVo数据
        return null;
    }
}
