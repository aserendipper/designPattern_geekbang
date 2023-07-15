package com.part03.day26.code.one;

import java.util.List;
import java.util.Map;

/**
 * @author aserendipper
 * @date 2023/7/15
 * @desc
 */
public class RedisMetricsStorage implements MetricsStorage {

    @Override
    public void saveRequestInfo(RequestInfo requestInfo) {
        
    }

    @Override
    public List<RequestInfo> getRequestInfos(String apiName, long startTimestamp, long endTimestamp) {
        return null;
    }

    @Override
    public Map<String, List<RequestInfo>> getRequestInfos(long startTimestamp, long endTimestamp) {
        return null;
    }
}
