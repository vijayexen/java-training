package com.javatraining.staticusage;

public class Player {
    String name;
//    static variable
    static int playerCount = 0;

    //  No arg constructor
    Player(String name) {
        System.out.println("Player " + name + " joined!");
        this.name = name;
        playerCount++;
    }
}

// type name
// int, float, double, byte, boolean
// varName