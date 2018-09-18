package com.yuchen.pattens.composite;

public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist:" + duck + "just quack");
    }
}
