package com.raj;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //adding the scanner.
        Scanner s= new Scanner (System.in);
        // We first created all the variables necessary for this program.
        double numArray [] = {1,2,3,4,5,6,7,8,9,10};
        double add = 0;
        double mean;
        double difference [] = new double [numArray.length];
        double square [] = new double [numArray.length];
        double sum = 0;
        double mean2;
        double standardDeviation;

        //Defining the set of values.
        System.out.printf("\tHello user, This program will help the user to find standard deviation of the following set of numbers:");
        System.out.println( "\n \t\t 1, 2, 3, 4, 5, 6, 7, 8, 9, 10. \n" );

        //Finding the mean.
        System.out.println("\tFirst we find the mean.");
        for (int i=0; i<numArray.length; i++){
            add+=numArray[i];
        }
        mean= add / numArray.length;
        System.out.println("\tThe mean is: ");
        System.out.println("\t\t"+mean +"\n");

        //Finding the deviation of each number from the mean.
        System.out.println("\tThen we find the deviation of each number in the set from the mean.");
        for (int i=0 ; i < difference.length ; i++) {
            difference[i] = numArray[i] - mean;
            System.out.println("\t\t" +difference[i]);
        }

        //Finding the square of each of the deviation.
        System.out.println("\n\tThen we square each deviation.");
        for (int i=0 ; i<square.length ; i++){
            square [i] = Math.pow((difference [i]), 2);
            System.out.println("\t\t" +square [i]);
        }

        //Finding the mean of the squares.
        System.out.println("\n\tThen we find the mean of the squares.");
        for (int i=0; i<square.length ; i++){
            sum = sum+ square [i];
        }
        mean2 = sum / numArray.length;
        System.out.println("\tThe mean of the square is:");
        System.out.println("\t\t" +mean2);

        //Finding the square root.
        System.out.println("\n\tThe last step is to find the square root.");
        standardDeviation = Math.sqrt(mean2);
        System.out.println("\tThe Standard Deviation of this set is: ");
        System.out.printf("\n\t\t%2.4f" , standardDeviation);
    }
}
