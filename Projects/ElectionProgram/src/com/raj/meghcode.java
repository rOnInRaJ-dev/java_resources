package com.raj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class meghcode {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\t\tELECTION SYSTEM");
        System.out.println();

        List<String> nominees = new ArrayList<String>();

        System.out.println("Enter Post:");
        String post = input.nextLine();
        String posName = "President";

        System.out.println("Enter Number of Nominees (Max 5)");
        int numNominees = input.nextInt();

        if (post.equalsIgnoreCase(posName)) {
            if (numNominees == 2) {
                System.out.println("Enter Nominee Names:");
                for (int i = 0; i <= 2; i++) {
                    System.out.println("Name:");
                    nominees.add(input.nextLine());
                }
            } else if (numNominees == 3) {
                System.out.println("Enter Nominee Names:");
                for (int i = 0; i <= 3; i++) {
                    System.out.println("Name:");
                    nominees.add(input.nextLine());
                }
            } else if (numNominees == 4) {
                System.out.println("Enter Nominee Names:");
                for (int i = 0; i <= 4; i++) {
                    System.out.println("Name:");
                    nominees.add(input.nextLine());
                }
            } else if (numNominees == 5) {
                System.out.println("Enter Nominee Names:");
                for (int i = 0; i <= 5; i++) {
                    System.out.println("Name:");
                    nominees.add(input.nextLine());
                }
            } else if (numNominees > 5) {
                System.out.println("Too many candidates");
            } else if (numNominees < 2) {
                System.out.println("too less candidates");
            }
        }


//        else if (post == "Class Representative") {
//            System.out.println("Enter Number of Nominees (Max 7)");
//            int numNominees = input.nextInt();
//
//            if (numNominees == 1) {
//                System.out.println("This Person is the Winner of "+post);
//            } else if (numNominees == 2) {
//                System.out.println("Enter Nominee Names:");
//                for (int i = 0; i <= 2; i++) {
//                    System.out.println("Name:");
//                    nominees.add(input.nextLine());
//                }
//            } if (numNominees == 3) {
//                System.out.println("Enter Nominee Names:");
//                for (int i = 0; i <= 3; i++) {
//                    System.out.println("Name:");
//                    nominees.add(input.nextLine());
//                }
//            } if (numNominees == 4) {
//                System.out.println("Enter Nominee Names:");
//                for (int i = 0; i <= 4; i++) {
//                    System.out.println("Name:");
//                    nominees.add(input.nextLine());
//                }
//            } if (numNominees == 5) {
//                System.out.println("Enter Nominee Names:");
//                for (int i = 0; i <= 5; i++) {
//                    System.out.println("Name:");
//                    nominees.add(input.nextLine());
//                }
//            } else {
//                System.out.println("Too many candidates");
//            }
//        }


        input.close();

    }
}
