package com.meghpathak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Scanner user_input = new Scanner(System.in);


        int current_year;
        System.out.println("Enter the year you want to know your age on;");
        current_year = user_input.nextInt();

        int birth_year;
        System.out.println("Enter your Birth Year;");
        birth_year = user_input.nextInt();

        int age;
        age = current_year - birth_year;
        System.out.println("You are " + age );



    }
}
