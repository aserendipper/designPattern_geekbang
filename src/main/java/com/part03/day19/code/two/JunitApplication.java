package com.part03.day19.code.two;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aserendipper
 * @date 2023/7/6
 * @desc
 */
public class JunitApplication {
    private static final List<TestCase> testCases = new ArrayList<>();
    
    public static void register(TestCase testCase) {
        testCases.add(testCase);
    }

    public static void main(String[] args) {
        for (TestCase testCase : testCases) {
            testCase.run();
        }
    }
}
