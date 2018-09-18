package com.yuchen.pattens.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    private ArrayList<Quackable> quackables = new ArrayList<>();

    public void add(Quackable quackable) {
        quackables.add(quackable);
    }

    @Override
    public void quack() {
        Iterator iterator = quackables.iterator();
        while (iterator.hasNext()) {
            Quackable quackable = (Quackable) iterator.next();
            quackable.quack();
        }
    }
}
