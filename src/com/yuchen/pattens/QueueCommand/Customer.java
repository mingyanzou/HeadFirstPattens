package com.yuchen.pattens.QueueCommand;

public class Customer {

    public static void main(String args[]) {
        Cooker cooker = new Cooker("炸鸡", 1, "zidong");
        Cooker cooker2 = new Cooker("汉堡", 2, "yufeng");

        FriedChickenCommand friedChickenCommand = new FriedChickenCommand(cooker);
        HambergCommand hambergCommand = new HambergCommand(cooker2);
        Mwaiter mwaiter = new Mwaiter();

        mwaiter.order(friedChickenCommand);
        mwaiter.order(hambergCommand);
        mwaiter.start();
    }


}
