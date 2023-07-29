package com.part05.day40.code.two;

import com.part03.day26.code.one.MetricsStorage;
import com.part03.day26.code.one.RedisMetricsStorage;
import com.part03.day26.code.one.RequestInfo;

/**
 * @author aserendipper
 * @date 2023/7/27
 * @desc
 */
public class MetricsCollector {
    private MetricsStorage metricsStorage;

    public MetricsCollector() {
        this.metricsStorage = new RedisMetricsStorage();
    }

    public MetricsCollector(MetricsStorage metricsStorage) {
        this.metricsStorage = metricsStorage;
    }

    public void recordRequest(RequestInfo register) {
        // 省略代码
    }
}
