package com.Classing;

public abstract class Player {

    private String name = null;
    private int age;
    private double height;
    private int weight;
    private int number;
    private String position = null;
    boolean inATeam = false;
        

    public Player(String name, int age, double height,int weight, int number, String position) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.number = number;
        this.position = position;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getNumber() {
        return number;
    }

    public String getPosition() {
        return position;
    }

    public abstract  void printPlayer();
}
