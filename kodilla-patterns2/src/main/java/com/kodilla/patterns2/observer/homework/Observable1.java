package com.kodilla.patterns2.observer.homework;

public interface Observable1 {
    void registerObserver(Observer1 observer);
    void notifyObservers();
    void removeObserver(Observer1 observer);
}
