package com.meghpathak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner user_input = new Scanner (System.in);

//        int midterm;
//        System.out.println("Enter your MidTerm mark;");
//        midterm = user_input.nextInt();
//
//        int exams;
//        System.out.println("Enter your Exams mark;");
//        exams = user_input.nextInt();
//
//        double finalMark =60;
//        finalMark = (exams * 0.7 ) + ( midterm * 0.3 );

        eotMark("English",73,66);
        eotMark("Business",75,75);
        eotMark("Physics",70,68);
        eotMark("Chemistry",86,87);
        eotMark("E.M",40,62);

    }

    public static void eotMark (String subject, int midterm, int exams) {

        double finalMark =60;
        finalMark = (exams * 0.7 ) + ( midterm * 0.3 );

        if (finalMark >=60) {
            System.out.println("You have Passed " + subject + " with " + finalMark);
        }
        else {
            System.out.println("You have failed " + subject + " with " + finalMark );
        }

    }

}
