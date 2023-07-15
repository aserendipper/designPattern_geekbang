package com.part03.day26.code.one;

/**
 * @author aserendipper
 * @date 2023/7/15
 * @desc
 */
public class Demo {

    public static void main(String[] args) {
        MetricsStorage metricsStorage = new RedisMetricsStorage();
        MetricsCollector metricsCollector = new MetricsCollector(metricsStorage);
        ConsoleReporter consoleReporter = new ConsoleReporter(metricsStorage);
        metricsCollector.recordRequest(new RequestInfo("register", 123, 10234));
        metricsCollector.recordRequest(new RequestInfo("register", 223, 10234));
        metricsCollector.recordRequest(new RequestInfo("register", 323, 10234));
        metricsCollector.recordRequest(new RequestInfo("login", 23, 10234));
        metricsCollector.recordRequest(new RequestInfo("login", 123, 10234));
        metricsCollector.recordRequest(new RequestInfo("login", 223, 10234));
        metricsCollector.recordRequest(new RequestInfo("login", 323, 10234));
        consoleReporter.startRepeatedReport(60, 60);
    }
}
