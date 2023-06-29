package com.raj;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);

        System.out.println("Hello user, this program will help you to compare 2 numbers or decimals.");
        System.out.println("Let us first start with numbers.");

        System.out.println("Enter 1st number.");
        int a= s.nextInt();
        System.out.println("Enter 2nd Number.");
        int b= s.nextInt();
        int result1= Minfunction(a,b);
        System.out.println("The minimum number is " +result1);

        System.out.println("");

        System.out.println("Now Lets compare 2 decimals.");

        System.out.println("Enter 1st decimal.");
        double c= s.nextDouble();
        System.out.println("Enter 2nd decimal.");
        double d= s.nextDouble() ;
        double result2= Minfunction(c,d);
        System.out.println("The minimum decimal is " +result2);

    }

    public static int Minfunction(int n1, int n2){

        int min;

        if (n1>n2) min=n2;else min=n1;return min; }

    public static double Minfunction(double n1, double n2){

        double min;

        if (n1>n2){
            min=n2;
        }
        else {
            min=n1;
        }
        return min;
    }

}
