package com.part05.day40.code.two;

import com.part03.day26.code.one.RequestInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aserendipper
 * @date 2023/7/28
 * @desc
 */
public class PerfCounterTest {
    public static void main(String[] args) {
        ConsoleReporter consoleReporter = new ConsoleReporter();
        consoleReporter.startRepeatedReport(60, 60);
        
        List<String> emailToAddresses = new ArrayList<>();
        emailToAddresses.add("123@136.com");
        EmailReporter emailReporter = new EmailReporter(emailToAddresses);
        emailReporter.startDailyReport();
        
        MetricsCollector metricsCollector = new MetricsCollector();
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
