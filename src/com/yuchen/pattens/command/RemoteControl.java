package com.yuchen.pattens.command;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    int size = 8;

    public RemoteControl(){
        onCommands = new Command[size];
        offCommands = new Command[size];
    }
    Command noCommand = new NoCommand();

}
