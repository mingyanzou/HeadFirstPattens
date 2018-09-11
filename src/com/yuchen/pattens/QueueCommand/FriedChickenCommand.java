package com.yuchen.pattens.QueueCommand;

public class FriedChickenCommand implements Command {
    Cooker cooker;

    public FriedChickenCommand(Cooker cooker) {
        this.cooker = cooker;
    }

    @Override
    public void execute() {
        new Thread(cooker).start();
    }
}
