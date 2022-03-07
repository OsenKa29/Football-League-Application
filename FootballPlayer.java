package com.Classing;

public class FootballPlayer extends Player{



    FootballPlayer(String name, int age, double height,int weight, int number, String position) {
        super(name, age, height, weight, number, position);
    }



    @Override
    public void printPlayer() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Height: " + getHeight());
        System.out.println("Number: " + getNumber());
        System.out.println("Position: " + getPosition());
        System.out.println();
    }
}


//lastly I was trying to make goalkeeper but those methods were for football so
