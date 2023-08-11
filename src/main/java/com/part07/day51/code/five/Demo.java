package com.part07.day51.code.five;

/**
 * @author aserendipper
 * @date 2023/8/11
 * @desc
 */
public class Demo {
    private IA a;

    public Demo(IA a) {
        this.a = a;
    }
    
    // ...
    
    public void test() {
        // 使用方法
        Demo demo = new Demo(new A());
        Demo demo1 = new Demo(new BAdaptor(new B()));
    }
}
