package com.part03.day26.code.one;

import java.util.List;
import java.util.Map;

/**
 * @author aserendipper
 * @date 2023/7/15
 * @desc
 */
public interface MetricsStorage {
    void saveRequestInfo(RequestInfo requestInfo);
    List<RequestInfo> getRequestInfos(String apiName, long startTimestamp, long endTimestamp);
    Map<String, List<RequestInfo>> getRequestInfos(long startTimestamp, long endTimestamp);
}
