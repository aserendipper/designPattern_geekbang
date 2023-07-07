package com.part03.day19.code.two;

/**
 * @author aserendipper
 * @date 2023/7/6
 * @desc
 */
public abstract class TestCase {
    public void run() {
        if (doTest()) {
            System.out.println("Test succeed.");
        } else {
            System.out.println("Test failed.");
        }
    }
    
    public abstract boolean doTest();
}
