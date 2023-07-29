package com.part05.day40.code.one;

import com.part03.day26.code.one.MetricsStorage;
import com.part03.day26.code.one.RequestInfo;
import com.part03.day26.code.one.RequestStat;
import com.part05.day39.code.one.Aggregator;
import com.part05.day39.code.one.StatViewer;

import java.util.List;
import java.util.Map;

/**
 * @author aserendipper
 * @date 2023/7/27
 * @desc
 */
public abstract class ScheduledReporter {
    private MetricsStorage metricsStorage;
    private Aggregator aggregator;
    private StatViewer viewer;

    public ScheduledReporter(MetricsStorage metricsStorage, Aggregator aggregator, StatViewer viewer) {
        this.metricsStorage = metricsStorage;
        this.aggregator = aggregator;
        this.viewer = viewer;
    }
    
    protected void doStatAndReport(long startTimeInMillis, long endTimeInMillis) {
        long durationInMillis = endTimeInMillis - startTimeInMillis;
        // 从数据库中拉取数据
        // 根据给定的时间区间，从数据库中拉取数据
        Map<String, List<RequestInfo>> requestInfos = metricsStorage.getRequestInfos(startTimeInMillis, endTimeInMillis);
        // 根据原始数据，计算得到统计数据
         Map<String, RequestStat> requestStats = aggregator.aggregate(requestInfos, durationInMillis);
        // 将统计数据显示到终端（命令行或邮件）
         viewer.output(requestStats, startTimeInMillis, endTimeInMillis);
    }
}
