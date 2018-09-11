package com.yuchen.pattens.QueueCommand;

import java.util.LinkedList;
import java.util.Queue;

public class Mwaiter {

    private Queue<Command> queue = new LinkedList<>();

    public void order(Command command) {
        queue.offer(command);
    }

    public void start() {
        System.out.println("queue size:" + queue.size());
        for (int i = 0; i < queue.size(); i++) {
            Command command = queue.poll();
            command.execute();
        }
    }
}
