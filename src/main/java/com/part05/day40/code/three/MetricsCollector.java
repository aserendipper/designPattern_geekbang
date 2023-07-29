package com.part05.day40.code.three;

import com.part03.day26.code.one.MetricsStorage;
import com.part03.day26.code.one.RedisMetricsStorage;
import com.part03.day26.code.one.RequestInfo;

import java.util.concurrent.Executors;

/**
 * @author aserendipper
 * @date 2023/7/28
 * @desc
 */
public class MetricsCollector {
    private static final int DEFAULT_STORAGE_THREAD_POOL_SIZE = 20;
    private MetricsStorage metricsStorage;
    private EventBus eventBus;
    
    public MetricsCollector() {
        this(new RedisMetricsStorage());
    }

    public MetricsCollector(MetricsStorage metricsStorage) {
        this(metricsStorage, DEFAULT_STORAGE_THREAD_POOL_SIZE);
    }

    public MetricsCollector(MetricsStorage metricsStorage, int threadNumToSaveData) {
        this.metricsStorage = metricsStorage;
        this.eventBus = new EventBus(Executors.newFixedThreadPool(threadNumToSaveData));
        this.eventBus.register(new EventListener());
    }
    
    public void recordRequest(RequestInfo register) {
        if (register == null || register.getApiName() == null) {
            return;
        }
        eventBus.post(register);
    }
    
    
}
