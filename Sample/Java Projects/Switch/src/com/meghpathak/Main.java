package com.meghpathak;

public class Main {

    public static void main(String[] args) {

        int switchValue = 1;

        switch (switchValue) {

            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was " + switchValue);
                break;

            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;

        }

        char switchVar = 'A';

        switch (switchVar) {

            case 'A':
                System.out.println("A was found");
                break;

            case 'B':
                System.out.println("B was found");
                break;

            case 'C': case 'D': case 'E':
                System.out.println(switchVar + "was found");

            default:
                System.out.println("Could not find A, B, C, D or E");
                break;

        }

        String month = "OCTOBER";

        switch (month.toLowerCase()) {

            case "january":
                System.out.println("Jan");
                break;

            case "october":
                System.out.println("Oct");
                break;

            default:
                System.out.println("Not Sure");
                break;

        }

    }
}
