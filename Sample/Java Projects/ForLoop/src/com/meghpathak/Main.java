package com.meghpathak;

public class Main {

    public static void main(String[] args) {

        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0) );

        System.out.println("*************************");

        for(int i=0; i<5; i++) {
            System.out.println("Loop " + i + " hello");
        }

        System.out.println("*************************");

        for(int i=2; i<9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, + i)));
        }

        System.out.println("*************************");

        for(int i=8; i>=2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, + i)));
        }

        System.out.println("*************************");

    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount*(interestRate/100));
    }

}
