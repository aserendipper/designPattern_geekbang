package com.part03.day16.code.one;

/**
 * @author aserendipper
 * @date 2023/7/2
 * @desc
 */
public class Alert {
    private AlertRule rule;
    private Notification notification;
    
    public Alert(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }
    
    public void check(String api, long requestCount, long errorCount, long durationOfSeconds) {
        long tps = requestCount / durationOfSeconds;
        if (tps > rule.getMatchedRule(api).getMaxTps()) {
            notification.notify(NOTIFICATION_LEVEL.URGENCY, "...");
            // 省略其他代码
        }
        if (errorCount > rule.getMatchedRule(api).getMaxErrorCount()) {
            notification.notify(NOTIFICATION_LEVEL.SEVERE, "...");
        }
    }
}
