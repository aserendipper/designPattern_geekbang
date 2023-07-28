package com.part05.day39.code.one;

import com.part03.day26.code.one.MetricsStorage;
import com.part03.day26.code.one.RequestInfo;
import com.part03.day26.code.one.RequestStat;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author aserendipper
 * @date 2023/7/26
 * @desc
 */
public class ConsoleReporter {
    private MetricsStorage metricsStorage;
    private Aggregator aggregator;
    private StatViewer viewer;
    private ScheduledExecutorService executor;

    public ConsoleReporter(MetricsStorage metricsStorage, Aggregator aggregator, StatViewer viewer) {
        this.metricsStorage = metricsStorage;
        this.aggregator = aggregator;
        this.viewer = viewer;
        this.executor = Executors.newSingleThreadScheduledExecutor();
    }
    
    public void startRepeatedReport(long periodInSeconds, long durationInseconds) {
        executor.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                long durationInMillis = durationInseconds * 1000;
                long endTimeInMillis = System.currentTimeMillis();
                long startTimeInMillis = endTimeInMillis - durationInMillis;
                Map<String, List<RequestInfo>> requestInfos = metricsStorage.getRequestInfos(startTimeInMillis, endTimeInMillis);
                Map<String, RequestStat> requestStat = aggregator.aggregate(requestInfos, durationInMillis);
                viewer.output(requestStat, startTimeInMillis, endTimeInMillis);
            }
        }, 0, periodInSeconds, TimeUnit.SECONDS);
    }
}
