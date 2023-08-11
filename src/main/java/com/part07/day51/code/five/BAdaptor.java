package com.part07.day51.code.five;

/**
 * @author aserendipper
 * @date 2023/8/11
 * @desc
 */
public class BAdaptor implements IA {
    private B b;

    public BAdaptor(B b) {
        this.b = b;
    }

    @Override
    public void fa() {
        b.fb();
    }
    
    public void test() {
        
    }
}
