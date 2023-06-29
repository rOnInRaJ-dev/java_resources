package com.meghpathak;

public class Main {

    public static void main(String[] args) {

//        int count = 1;
//        while (count !=6) {
//            System.out.println("Count value is " +count);
//            count++;
//        }
//
//        count = 6;
//        do {
//            System.out.println("Count value was " +count);
//            count++;
//
//            if (count >100) {
//                break;
//            }
//
//        }while (count !=6);

//        int number = 4;
//        int finishNumber = 20;
//
//        while (number <= finishNumber) {
//            number++;
//            if (!isEvenNumber(number)) {
//                continue;
//            }
//
//            System.out.println("Even number " +number);
//
//        }

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " +number);

        }

    }

    public static boolean isEvenNumber (int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

}
