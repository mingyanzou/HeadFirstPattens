package com.yuchen.pattens.builder;

public class People {
    private String name;
    private int age;
    private int weight;
    private int height;

    private People(PeopleBuilder peopleBuilder) {
        this.name = peopleBuilder.name;
        this.age = peopleBuilder.age;
        this.weight = peopleBuilder.weight;
        this.height = peopleBuilder.height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static class PeopleBuilder {
        private String name;
        private int age;
        private int weight;
        private int height;

        public PeopleBuilder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public PeopleBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public PeopleBuilder setHeight(int height) {
            this.height = height;
            return this;
        }

        public People Build() {
            return new People(this);
        }
    }
}
