package com.thanhnd.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

// Observable
public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        for (var observer : observers)
            observer.update();
    }
}
