package com.part07.day49.code.two;

/**
 * @author aserendipper
 * @date 2023/8/9
 * @desc
 */
public abstract class RefinedCar extends Car {
    public RefinedCar(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        engine.start();
        System.out.println("drive " + getBrand() + " car...");
    }
    
    public abstract String getBrand();
}
