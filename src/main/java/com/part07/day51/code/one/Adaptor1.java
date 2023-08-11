package com.part07.day51.code.one;

/**
 * @author aserendipper
 * @date 2023/8/11
 * @desc
 */
public class Adaptor1 implements ITarget {
    private Adaptee adaptee;
    
    public Adaptor1(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    @Override
    public void f1() {
        adaptee.fa();
    }

    @Override
    public void f2() {
        // ...重新实现f2()
    }

    @Override
    public void fc() {
        adaptee.fc();
    }
}
