package com.part03.day18.code.five;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author aserendipper
 * @date 2023/7/6
 * @desc
 */
public class ScheduledUpdater {
    private final ScheduledExecutorService executorService;
    private final long initialDelayInSeconds;
    private final long periodInSeconds;
    private Updater updater;

    public ScheduledUpdater(ScheduledExecutorService executorService, long initialDelayInSeconds, long periodInSeconds) {
        this.executorService = executorService;
        this.initialDelayInSeconds = initialDelayInSeconds;
        this.periodInSeconds = periodInSeconds;
    }
    
    public void run() {
        executorService.scheduleAtFixedRate(() -> {
            updater.update();
        }, initialDelayInSeconds, periodInSeconds, TimeUnit.SECONDS);
    }
    
}
