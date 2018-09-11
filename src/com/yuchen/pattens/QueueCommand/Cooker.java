package com.yuchen.pattens.QueueCommand;

import java.util.Random;

public class Cooker implements Runnable {
    public String name;
    public int tableNo;
    public String food;

    public Cooker(String food, int tableNo, String name) {
        this.food = food;
        this.tableNo = tableNo;
        this.name = name;
    }

    private void cook(String something) {
        System.out.println(name + " is cooking " + something);
    }

    @Override
    public void run() {
        int time = new Random().nextInt(20);
        cook(food);
        try{
            Thread.sleep(time);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(food + " is cooked completely");
    }
}
