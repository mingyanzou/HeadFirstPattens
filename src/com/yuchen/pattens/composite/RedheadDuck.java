package com.yuchen.pattens.composite;

public class RedheadDuck implements Quackable{

    Observable observable;

    public RedheadDuck(){
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Red head Duck quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
