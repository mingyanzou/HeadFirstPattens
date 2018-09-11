package com.yuchen.pattens.QueueCommand;

public class HambergCommand implements Command {

    Cooker cooker;

    public HambergCommand(Cooker cooker) {
        this.cooker = cooker;
    }

    @Override
    public void execute() {
        new Thread(cooker).start();
    }
}
