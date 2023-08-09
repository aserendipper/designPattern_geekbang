package com.part07.day49.code.two;

/**
 * @author aserendipper
 * @date 2023/8/9
 * @desc
 */
public abstract class Car {
    protected Engine engine;
    
    public Car(Engine engine) {
        this.engine = engine;
    }
    
    public abstract void drive();
}
