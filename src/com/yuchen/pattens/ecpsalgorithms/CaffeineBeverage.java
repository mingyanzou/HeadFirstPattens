package com.yuchen.pattens.ecpsalgorithms;

public abstract class CaffeineBeverage {

    final void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    abstract void brew();

    abstract void addCondiments();
}
