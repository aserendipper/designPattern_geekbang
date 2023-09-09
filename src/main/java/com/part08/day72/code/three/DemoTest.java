package com.part08.day72.code.three;

import java.util.HashMap;
import java.util.Map;

public class DemoTest {
    public static void main(String[] args) {
        String rule = "key1 > 100 && key2 < 30 || key3 < 100 || key4 == 88";
        AlertRuleInterpreter interpreter = new AlertRuleInterpreter(rule);
        Map<String, Long> stats = new HashMap<>();
        stats.put("key1", 101l);
        stats.put("key2", 121l);
        stats.put("key3", 99l);
        stats.put("key4", 88l);
        boolean alert = interpreter.interpreter(stats);
        System.out.println(alert);
    }
}
