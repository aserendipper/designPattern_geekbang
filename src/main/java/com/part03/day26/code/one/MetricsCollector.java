package com.part03.day26.code.one;

/**
 * @author aserendipper
 * @date 2023/7/15
 * @desc
 */
public class MetricsCollector {
    private MetricsStorage metricsStorage;

    /**
     * 依赖注入
     * @param metricsStorage 存储
     */
    public MetricsCollector(MetricsStorage metricsStorage) {
        this.metricsStorage = metricsStorage;
    }

    /**
     * 用一个函数代替了最小原型中的两个函数
     * @param requestInfo 请求信息
     */
    public void recordRequest(RequestInfo requestInfo) {
        if (requestInfo == null || requestInfo.getApiName() == null || requestInfo.getApiName().isEmpty()) {
            return;
        }
        metricsStorage.saveRequestInfo(requestInfo);
    }
}
