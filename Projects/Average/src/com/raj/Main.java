package com.raj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);

        int total= 0, grade, average, counter= 0;

        while (counter <10) {
            int order = counter +1;
            System.out.println("Enter grade #" +order);
            grade = s.nextInt();
            total = total+grade;
            counter++;


        }

        average = total/10;
        System.out.println("Your average is " +average);

    }
}
