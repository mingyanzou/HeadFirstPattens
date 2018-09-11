package com.yuchen.pattens.command;

public class SimpleRemoteControl {

    private Command slot;

    public void setCommand(Command command) {
        slot = command;
    }

    public void btnPressed() {
        slot.execute();
    }
}
