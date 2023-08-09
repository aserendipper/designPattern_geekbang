package com.part07.day49.code.two;

/**
 * @author aserendipper
 * @date 2023/8/9
 * @desc
 */
public class Test {
    public static void main(String[] args) {
        Engine engine = new HybridEngine();
        Car car = new BossCar(engine);
        car.drive();
    }
}
