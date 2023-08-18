package com.part08.day56.code.one;

/**
 * @author aserendipper
 * @date 2023/8/18
 * @desc
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
