package com.part06.day42.code.one;

/**
 * @author aserendipper
 * @date 2023/7/30
 * @desc
 */
public class Singleton1 {
    private static Singleton1 instance = null;
    
    private final int paramA;
    private final int paramB;

    public Singleton1(int paramA, int paramB) {
        this.paramA = paramA;
        this.paramB = paramB;
    }

    /**
     * 第二次调用时，不会再进入if语句，直接返回instance
     */
    public synchronized static Singleton1 getInstance(int paramA, int paramB) {
        if (instance == null) {
            instance = new Singleton1(paramA, paramB);
        }
        return instance;
    }
}
