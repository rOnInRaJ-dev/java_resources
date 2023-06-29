package com.raj;
import java.util.Random;
import java.util.Scanner;

public class Randm {
    public static void main(String [] args){
        Random r = new Random();
        Scanner s = new Scanner (System.in);

        System.out.println("This program will let you know who your crush is");
        System.out.println("Enter your name");
        String a = s.nextLine();

        System.out.println("Enter the name of your ");
        String b = s.nextLine();

        int n = r.nextInt(2);

        if (n==0){
            System.out.println("Sorry ");
        }
        else if (n==1) {
            System.out.println("U Rock");
        }
    }
}
