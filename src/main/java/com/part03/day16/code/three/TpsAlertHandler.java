package com.part03.day16.code.three;

import com.part03.day16.code.one.AlertRule;
import com.part03.day16.code.one.NOTIFICATION_LEVEL;
import com.part03.day16.code.one.Notification;

/**
 * @author aserendipper
 * @date 2023/7/2
 * @desc
 */
public class TpsAlertHandler extends AlertHandler {

    public TpsAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        long tps = apiStatInfo.getRequestCount() / apiStatInfo.getDurationOfSeconds();
        if (tps > rule.getMatchedRule(apiStatInfo.getApi()).getMaxTps()) {
            notification.notify(NOTIFICATION_LEVEL.URGENCY, "...");
        }
    }
}
