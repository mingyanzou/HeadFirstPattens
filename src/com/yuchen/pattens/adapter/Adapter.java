package com.yuchen.pattens.adapter;

public class Adapter extends Adaptee implements Target {
    @Override
    public void execute() {
        super.specialExecute();
    }
}
