package com.part06.day42.code.one;

/**
 * @author aserendipper
 * @date 2023/7/30
 * @desc
 */
public class Singleton2 {
    private static Singleton2 instance = null;
    
    private final int paramA;
    private final int paramB;

    public Singleton2() {
        this.paramA = Config.PARAM_A;
        this.paramB = Config.PARAM_B;
    }
    
    public synchronized static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
