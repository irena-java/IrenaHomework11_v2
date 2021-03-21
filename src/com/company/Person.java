package com.company;

public class Person {
    private String name;
    private String surName;
    private int age;
    private double weight;
    private double growth;

    public Person(String name, String surName, int age, double weight, double growth) {
        if (!(name.contains(" ") || surName.contains(" ")
                || age < 0 || age > 130
                || weight < 2.0 || weight > 600.0
                || growth < 20.0 || growth > 300.0
                || weight < 5.0 && growth > 80.0
                || weight > 100.0 && growth < 50.0)) {
            this.name = name;
            this.surName = surName;
            this.age = age;
            this.weight = weight;
            this.growth = growth;
        }
    }

    public Person(String name, String surName, int age) {
        if (!(name.contains(" ") || surName.contains(" ")
                || age < 0 || age > 130)) {
            this.name = name;
            this.surName = surName;
            this.age = age;
        }
    }

    public Person(String name, String surName) {
        if (!(name.contains(" ") || surName.contains(" "))) {
            this.name = name;
            this.surName = surName;
        }

    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getGrowth() {
        return growth;
    }

    @Override
    public String toString() {
        return surName + " " + name +
                ", возраст:" + age + " лет (года)" +
                ", вес: " + weight + " кг." +
                ", рост: " + growth + " см.\n";
    }
}
