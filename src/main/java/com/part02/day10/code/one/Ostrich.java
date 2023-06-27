package com.part02.day10.code.one;

/**
 * @author aserendipper
 * @date 2023/6/26
 * @desc 鸵鸟
 */
public class Ostrich extends AbstractBird {
    //...省略其他属性和方法...
    @Override
    public void fly() {
        //...
        throw new UnsupportedOperationException("I can't fly.");
    }
}
