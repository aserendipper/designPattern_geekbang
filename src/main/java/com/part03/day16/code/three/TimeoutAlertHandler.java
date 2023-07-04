package com.part03.day16.code.three;

import com.part03.day16.code.one.AlertRule;
import com.part03.day16.code.one.NOTIFICATION_LEVEL;
import com.part03.day16.code.one.Notification;

/**
 * @author aserendipper
 * @date 2023/7/2
 * @desc 改动二：添加新的告警处理类
 */
public class TimeoutAlertHandler extends AlertHandler {


    public TimeoutAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        long timeoutCount = apiStatInfo.getTimeoutCount();
        long timeoutTps = timeoutCount / apiStatInfo.getDurationOfSeconds();
        if (timeoutTps > rule.getMatchedRule(apiStatInfo.getApi()).getMaxTimeoutTps()) {
            notification.notify(NOTIFICATION_LEVEL.URGENCY, "...");
        }
    }
}
