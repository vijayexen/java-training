package com.javatraining.staticusage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StaticUsage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Player> playerList = new ArrayList<>();
        Player[] players = new Player[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter player name: ");
            String name = scanner.next();
            Player player = new Player(name);
            System.out.println(Player.playerCount);
            players[i] = player;
            System.out.println(Player.playerCount);
        }
        System.out.println("After all " + Player.playerCount);
        for(Player p: players){
            System.out.println(p.name);
        }



//        Swap memory -> HDD ->
//        TB/s -> HDD -> 30MB/s -> 100MB/s


//        Player player1 = new Player("Bala");
//        System.out.println("Player count: "+ Player.playerCount);
//        System.out.println(player1.name);
//        Player player2 = new Player("Vijay");
//        System.out.println("Player count: "+ Player.playerCount);
//        System.out.println(player2.name);
//        Player player3 = new Player("Player 3");
//        System.out.println("Player count: "+ Player.playerCount);
    }
}
//         Player1  Player2
// Memory 0x5f184fc6   5f184fc7    5f184fc7


// static variable/method can only be accessed by its Class name

// Play Online -> https://www.playgames.com/cricket/
// Enter Name ->