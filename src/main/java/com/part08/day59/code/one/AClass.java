package com.part08.day59.code.one;

/**
 * @author aserendipper
 * @date 2023/8/20
 * @desc
 */
public class AClass {
    public static void main(String[] args) {
        BClass b = new BClass();
        b.process(new ICallback() {
            @Override
            public void methodToCallback() {
                System.out.println("Call back me.");
            }
        });
    }
}
