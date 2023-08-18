package com.part08.day56.code.one;

/**
 * @author aserendipper
 * @date 2023/8/18
 * @desc
 */
public class Demo {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.registerObserver(new ConcreteObserverOne());
        subject.registerObserver(new ConcreteObserverTwo());
        subject.notifyObservers();
    }
}
