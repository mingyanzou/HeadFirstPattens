package com.yuchen.pattens.ecpsalgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping Coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();
        if (answer.equalsIgnoreCase("Y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;
        System.out.print("Would you like milk and sugar with coffee！（Y/N）");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            answer = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (answer == null) {
            return "N";
        }
        return answer;
    }
}
