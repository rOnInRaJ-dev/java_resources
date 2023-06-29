package com.raj;

import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Random random= new Random();

        System.out.println("Enter Number of Players");
        int number = scanner.nextInt();
        int counter = 0;

        String team[] = new String[number];
        team[counter] = scanner.nextLine();

        while (counter<number){
            int playerNumber = counter + 1;
            System.out.println("Enter Player Number: " +playerNumber);
            team[counter] = scanner.nextLine();
            counter++;
        }
        System.out.println("\nThese are the players playing :");

        for (String players:team){
            System.out.println(players);
        }

        System.out.println();

        for (String trigger : team){
            int bullet = random.nextInt(2);
            if (bullet == 0) {
                System.out.println(trigger +" is alive");
            }
            else if (bullet == 1){
                System.out.println(trigger +" has died");
            }
        }
    }
}
