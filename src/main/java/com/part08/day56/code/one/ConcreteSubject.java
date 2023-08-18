package com.part08.day56.code.one;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aserendipper
 * @date 2023/8/18
 * @desc
 */
public class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
