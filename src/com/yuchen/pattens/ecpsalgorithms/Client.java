package com.yuchen.pattens.ecpsalgorithms;

public class Client {
    public static void main(String args[]){
        CaffeineBeverage caffeineBeverage = new Tea();
        caffeineBeverage.prepareBeverage();

        CaffeineBeverage caffeineBeverage1 = new Coffee();
        caffeineBeverage1.prepareBeverage();
    }
}
