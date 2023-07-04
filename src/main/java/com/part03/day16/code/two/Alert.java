package com.part03.day16.code.two;

import com.part03.day16.code.one.AlertRule;
import com.part03.day16.code.one.NOTIFICATION_LEVEL;
import com.part03.day16.code.one.Notification;

/**
 * @author aserendipper
 * @date 2023/7/2
 * @desc
 */
public class Alert {
    private AlertRule    rule;
    private Notification notification;
    
    public Alert(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }

    /**
     * 改动一：添加timeoutCount参数
     */
    public void check(String api, long requestCount, long errorCount, long timeoutCount, long durationOfSeconds) {
        long tps = requestCount / durationOfSeconds;
        if (tps > rule.getMatchedRule(api).getMaxTps()) {
            notification.notify(NOTIFICATION_LEVEL.URGENCY, "...");
            // 省略其他代码
        }
        if (errorCount > rule.getMatchedRule(api).getMaxErrorCount()) {
            notification.notify(NOTIFICATION_LEVEL.SEVERE, "...");
        }
        //改动二：添加timeoutCount判断逻辑
        long timeoutTps = timeoutCount / durationOfSeconds;
        if (timeoutTps > rule.getMatchedRule(api).getMaxTimeoutTps()) {
            notification.notify(NOTIFICATION_LEVEL.SEVERE, "...");
        }
    }
}
