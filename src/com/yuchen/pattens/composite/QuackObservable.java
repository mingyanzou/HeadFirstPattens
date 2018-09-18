package com.yuchen.pattens.composite;


public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
