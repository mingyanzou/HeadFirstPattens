package com.yuchen.pattens.composite;

import java.util.Observer;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
