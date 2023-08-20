package com.part08.day58.code.one;

/**
 * @author aserendipper
 * @date 2023/8/20
 * @desc
 */
public abstract class AbstractClass {
    public final void templateMethod() {
        method1();
        method2();
    }

    protected abstract void method1();

    protected abstract void method2();
}
