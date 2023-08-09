package com.part07.day49.code.two;

/**
 * @author aserendipper
 * @date 2023/8/9
 * @desc
 */
public class BossCar extends RefinedCar {
    public BossCar(Engine engine) {
        super(engine);
    }

    @Override
    public String getBrand() {
        return "Boss";
    }
}
