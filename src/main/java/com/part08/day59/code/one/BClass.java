package com.part08.day59.code.one;

/**
 * @author aserendipper
 * @date 2023/8/20
 * @desc
 */
public class BClass {
    public void process(ICallback callback) {
        System.out.println("BClass process start...");
        callback.methodToCallback();
        System.out.println("BClass process end...");
    }
}
