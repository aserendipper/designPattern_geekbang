package com.part03.day16.code.three;

import com.part03.day16.code.one.AlertRule;
import com.part03.day16.code.one.Notification;

/**
 * @author aserendipper
 * @date 2023/7/2
 * @desc
 */
public abstract class AlertHandler {
    protected AlertRule    rule;
    protected Notification notification;
    
    public AlertHandler(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }
    
    public abstract void check(ApiStatInfo apiStatInfo);
}
