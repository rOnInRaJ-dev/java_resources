package com.meghpathak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String answer;

        Scanner user_input = new Scanner (System.in);

        System.out.println("1. What is the Capital City of India?");

        System.out.println("Answer;");
        answer = user_input.nextLine();

        if (answer.equalsIgnoreCase("Dehli")) {
            System.out.println("You are correct!!");
        }

        else {
            System.out.println("Oops the answer is wrong!! Try Again");
        }

        System.out.println("2. What is the half of 50?");

        System.out.println("75");
        System.out.println("15");
        System.out.println("25");
        System.out.println("10");

        answer = user_input.nextLine();

        if (answer.equals("25")) {
            System.out.println("You are correct!!");
        }

        else {
            System.out.println("Oops the answer is wrong!! Try Again");
        }



    }
}
