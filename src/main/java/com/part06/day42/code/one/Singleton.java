package com.part06.day42.code.one;

/**
 * @author aserendipper
 * @date 2023/7/30
 * @desc
 */
public class Singleton {
    private static Singleton instance = null;
    
    private final int paramA;
    private final int paramB;

    public Singleton(int paramA, int paramB) {
        this.paramA = paramA;
        this.paramB = paramB;
    }
    
    public static Singleton getInstance() throws Exception {
        if (instance == null) {
            throw new Exception();
        }
        return instance;
    }
    
    public static synchronized Singleton init(int paramA, int paramB) throws Exception {
        if (instance != null) {
            throw new Exception("instance has been initialized");
        }
        instance = new Singleton(paramA, paramB);
        return instance;
    }
    
    // 调用时，先调用init方法，再调用getInstance方法
    //Singleton.init(10, 50);
    //Singleton singleton = Singleton.getInstance();
}
