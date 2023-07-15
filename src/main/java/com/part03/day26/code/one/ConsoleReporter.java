package com.part03.day26.code.one;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author aserendipper
 * @date 2023/7/15
 * @desc
 */
public class ConsoleReporter {
    private MetricsStorage metricsStorage;
    private ScheduledExecutorService executor;

    public ConsoleReporter(MetricsStorage metricsStorage) {
        this.metricsStorage = metricsStorage;
        executor = Executors.newSingleThreadScheduledExecutor();
    }
    
    public void startRepeatedReport(long periodInSeconds, long durationInSeconds) {
        executor.scheduleAtFixedRate(() -> {
            // 1.从数据库中取出数据
            long durationInMills = durationInSeconds * 1000;
            long endTimeInMills = System.currentTimeMillis();
            long startTimeInMills = endTimeInMills - durationInMills;
            Map<String, List<RequestInfo>> requestInfos = metricsStorage.getRequestInfos(startTimeInMills, endTimeInMills);
            // 2.根据原始数据计算统计数据
            Map<String, RequestStat> stats = new HashMap<>();
            for (Entry<String, List<RequestInfo>> entry : requestInfos.entrySet()) {
                String apiName = entry.getKey();
                List<RequestInfo> requestInfoList = entry.getValue();
                RequestStat requestStat = Aggregator.aggregate(requestInfoList, durationInMills);
                stats.put(apiName, requestStat);
            }
            // 3.将统计数据显示到终端
            System.out.println("Time Span: [" + startTimeInMills + ", " + endTimeInMills + "]");
            System.out.println(stats);
        }, 0, periodInSeconds, TimeUnit.SECONDS);
    }
}
