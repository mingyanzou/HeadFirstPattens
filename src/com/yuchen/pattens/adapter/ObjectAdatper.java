package com.yuchen.pattens.adapter;

public class ObjectAdatper {
    Adapter adapter;

    public ObjectAdatper(Adapter adapter) {
        this.adapter = adapter;
    }

    public void execute() {
        adapter.execute();
    }
}
