package com.part05.day40.code.two;

import com.part03.day26.code.one.MetricsStorage;
import com.part03.day26.code.one.RedisMetricsStorage;
import com.part05.day39.code.one.Aggregator;
import com.part05.day39.code.one.ConsoleViewer;
import com.part05.day39.code.one.StatViewer;
import com.part05.day40.code.one.ScheduledReporter;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * @author aserendipper
 * @date 2023/7/28
 * @desc
 */
public class ConsoleReporter extends ScheduledReporter {
    
    private ScheduledExecutorService executor;

    public ConsoleReporter() {
        super(new RedisMetricsStorage(), new Aggregator(), new ConsoleViewer());
    }

    public ConsoleReporter(MetricsStorage metricsStorage, Aggregator aggregator, StatViewer viewer) {
        super(metricsStorage, aggregator, viewer);
        this.executor = Executors.newSingleThreadScheduledExecutor();
    }


    public void startRepeatedReport(long periodInSeconds, long durationInseconds) {
        // 省略代码
    }
}
