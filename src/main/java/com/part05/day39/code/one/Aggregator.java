package com.part05.day39.code.one;

import com.part03.day26.code.one.RequestInfo;
import com.part03.day26.code.one.RequestStat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author aserendipper
 * @date 2023/7/15
 * @desc
 */
public class Aggregator {
    
    public Map<String, RequestStat> aggregate(Map<String, List<RequestInfo>> requestInfos, long durationInMillis) {
        Map<String, RequestStat> requestStats = new HashMap<>();
        for (Map.Entry<String, List<RequestInfo>> entry : requestInfos.entrySet()) {
            String apiName = entry.getKey();
            List<RequestInfo> requestInfoList = entry.getValue();
            RequestStat requestStat = doAggregate(requestInfoList, durationInMillis);
            requestStats.put(apiName, requestStat);
        }
        return requestStats;
    }
    
    public RequestStat doAggregate(List<RequestInfo> requestInfos, long durationInMillis) {
        List<Double> respTimes = new ArrayList<>();
        for (RequestInfo requestInfo : requestInfos) {
            double respTime = requestInfo.getResponseTime();
            respTimes.add(respTime);
        }
        
        RequestStat requestStat = new RequestStat();
        requestStat.setMaxResponseTime(max(respTimes));
        requestStat.setMinResponseTime(min(respTimes));
        requestStat.setAvgResponseTime(avg(respTimes));
        requestStat.setP999ResponseTime(percentile999(respTimes));
        requestStat.setP99ResponseTime(percentile99(respTimes));
        requestStat.setCount(respTimes.size());
        requestStat.setTps((long)tps(respTimes.size(), durationInMillis/1000));
        return requestStat;
    }
    
    private double max(List<Double> dataset) {
        // TODO
        return 0;
    }

    private double min(List<Double> dataset) {
        // TODO
        return 0;
    }

    private double avg(List<Double> dataset) {
        // TODO
        return 0;
    }

    private double tps(int count, long durationInMillis) {
        // TODO
        return 0;
    }
    
    private double percentile999(List<Double> dataset) {
        // TODO
        return 0;
    }
    
    private double percentile99(List<Double> dataset) {
        // TODO
        return 0;
    }
    
    private double percentile(List<Double> dataset, double ratio) {
        // TODO
        return 0;
    }
    
}
