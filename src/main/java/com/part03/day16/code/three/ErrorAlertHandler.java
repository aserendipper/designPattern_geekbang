package com.part03.day16.code.three;

import com.part03.day16.code.one.AlertRule;
import com.part03.day16.code.one.NOTIFICATION_LEVEL;
import com.part03.day16.code.one.Notification;

/**
 * @author aserendipper
 * @date 2023/7/2
 * @desc
 */
public class ErrorAlertHandler extends AlertHandler {

    public ErrorAlertHandler(AlertRule rule,
        Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        if (apiStatInfo.getErrorCount() > rule.getMatchedRule(apiStatInfo.getApi()).getMaxErrorCount()) {
            notification.notify(NOTIFICATION_LEVEL.URGENCY, "...");
        }
    }
}
