package com.yuchen.pattens.composite;

public class QuackCounter implements Quackable {

    private Quackable duck;
    private static int numberOfQuacks;
    Observable observable;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
        observable = new Observable(this);
    }


    @Override
    public void quack() {
        duck.quack();
        notifyObservers();
        numberOfQuacks++;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
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
