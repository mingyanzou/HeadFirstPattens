package com.yuchen.pattens.builder;

public class Client {
    public static void main(String args[]) {
        People people = new People.PeopleBuilder("xiaoming", 23).setHeight(120).setHeight(45).Build();

        System.out.println("Name:" + people.getName() + " age:" + people.getAge() + " height:" + people.getHeight());
    }
}
