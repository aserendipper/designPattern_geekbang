package com.part05.day39.code.one;

import com.part03.day26.code.one.MetricsCollector;
import com.part03.day26.code.one.MetricsStorage;
import com.part03.day26.code.one.RedisMetricsStorage;
import com.part03.day26.code.one.RequestInfo;

/**
 * @author aserendipper
 * @date 2023/7/26
 * @desc
 */
public class PerfCounterTest {
    public static void main(String[] args) {
        MetricsStorage metricsStorage = new RedisMetricsStorage();
        Aggregator aggregator = new Aggregator();
        
        // 定时触发统计并将结果显示到终端
        ConsoleViewer consoleViewer = new ConsoleViewer();
        ConsoleReporter consoleReporter = new ConsoleReporter(metricsStorage, aggregator, consoleViewer);
        consoleReporter.startRepeatedReport(60, 60);
        
        // 定时触发统计并将结果显示到邮件
        EmailViewer emailViewer = new EmailViewer();
        emailViewer.addToAddress("123@163.com");
        EmailReporter emailReporter = new EmailReporter(metricsStorage, aggregator, emailViewer);
        emailReporter.startDailyReport();
        
        // 收集接口访问数据
        MetricsCollector metricsCollector = new MetricsCollector(metricsStorage);
        metricsCollector.recordRequest(new RequestInfo("register", 123, 10234));
        metricsCollector.recordRequest(new RequestInfo("register", 223, 11234));
        metricsCollector.recordRequest(new RequestInfo("register", 323, 12234));
        metricsCollector.recordRequest(new RequestInfo("login", 23, 1234));
        metricsCollector.recordRequest(new RequestInfo("login", 123, 1234));
        
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
