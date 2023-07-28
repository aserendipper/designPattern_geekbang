package com.part05.day39.code.one;

import com.part03.day26.code.one.MetricsStorage;
import com.part03.day26.code.one.RequestInfo;
import com.part03.day26.code.one.RequestStat;

import java.util.*;

/**
 * @author aserendipper
 * @date 2023/7/26
 * @desc
 */
public class EmailReporter {
    private static final Long DAY_HOURS_IN_SECONDS = 86400L;
    private MetricsStorage metricsStorage;
    private Aggregator aggregator;
    private StatViewer viewer;
    
    public EmailReporter(MetricsStorage metricsStorage, Aggregator aggregator, StatViewer viewer) {
        this.metricsStorage = metricsStorage;
        this.aggregator = aggregator;
        this.viewer = viewer;
    }
    
    public void startDailyReport() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date firstTime = calendar.getTime();
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                long durationInMillis = DAY_HOURS_IN_SECONDS * 1000;
                long endTimeInMillis = System.currentTimeMillis();
                long startTimeInMillis = endTimeInMillis - durationInMillis;
                Map<String, List<RequestInfo>> requestInfos = metricsStorage.getRequestInfos(startTimeInMillis, endTimeInMillis);
                Map<String, RequestStat> requestStat = aggregator.aggregate(requestInfos, durationInMillis);
                viewer.output(requestStat, startTimeInMillis, endTimeInMillis);
            }
        }, firstTime, DAY_HOURS_IN_SECONDS * 1000);
    }
}
