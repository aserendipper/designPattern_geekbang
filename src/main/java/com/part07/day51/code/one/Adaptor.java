package com.part07.day51.code.one;

/**
 * @author aserendipper
 * @date 2023/8/11
 * @desc
 */
public class Adaptor extends Adaptee implements ITarget {
    @Override
    public void f1() {
        super.fa();
    }

    @Override
    public void f2() {
        // ...重新实现f2()
    }
    
}
