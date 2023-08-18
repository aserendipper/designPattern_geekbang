package com.part08.day56.code.one;

/**
 * @author aserendipper
 * @date 2023/8/18
 * @desc
 */
public class ConcreteObserverOne implements Observer {

    @Override
    public void update() {
        System.out.println("ConcreteObserverOne is notified");
    }
}
