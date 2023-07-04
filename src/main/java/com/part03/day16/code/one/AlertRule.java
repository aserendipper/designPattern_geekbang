package com.part03.day16.code.one;

/**
 * @author aserendipper
 * @date 2023/7/2
 * @desc
 */
public class AlertRule {
    private long maxTps;
    private long maxErrorCount;
    private long maxTimeoutTps;
    
    public AlertRule() {
        this.maxTps = 100;
        this.maxErrorCount = 10;
        this.maxTimeoutTps = 10;
    }
    
    public AlertRule(long maxTps, long maxErrorCount, long maxTimeoutTps) {
        this.maxTps = maxTps;
        this.maxErrorCount = maxErrorCount;
        this.maxTimeoutTps = maxTimeoutTps;
    }
    
    public AlertRule getMatchedRule(String api) {
        return new AlertRule(100, 10, 10);
    }
    
    public long getMaxTps() {
        return maxTps;
    }
    
    public long getMaxErrorCount() {
        return maxErrorCount;
    }
    
    public long getMaxTimeoutTps() {
        return maxTimeoutTps;
    }
}
