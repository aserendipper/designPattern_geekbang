package com.part08.day62.code.one;

/**
 * @author aserendipper
 * @date 2023/8/26
 * @desc
 */
public class Application {

    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }
}
