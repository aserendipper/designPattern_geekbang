package com.part05.day40.code.two;

import com.part03.day26.code.one.MetricsStorage;
import com.part03.day26.code.one.RedisMetricsStorage;
import com.part05.day39.code.one.Aggregator;
import com.part05.day39.code.one.EmailViewer;
import com.part05.day39.code.one.StatViewer;
import com.part05.day40.code.one.ScheduledReporter;

import java.util.List;

/**
 * @author aserendipper
 * @date 2023/7/28
 * @desc
 */
public class EmailReporter extends ScheduledReporter {
    private static final Long DAY_HOURS_IN_SECONDS = 86400L;
    
    public EmailReporter(List<String> emailToAddresses) {
        super(new RedisMetricsStorage(), new Aggregator(), new EmailViewer(emailToAddresses));
    }
    public EmailReporter(MetricsStorage metricsStorage, Aggregator aggregator, StatViewer viewer) {
        super(metricsStorage, aggregator, viewer);
    }

    public void startDailyReport() {
        // 省略其他代码...
    }
}
