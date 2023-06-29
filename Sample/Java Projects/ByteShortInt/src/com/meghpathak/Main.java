package com.meghpathak;

public class Main {

    public static void main(String[] args) {

        byte myByteValue = 10;
        short myShortValue = 20;
        int myIntValue = 50;
        long myLongTotal = 50000L + 10L * (myByteValue + myShortValue + myIntValue);
        System.out.println("myLongTotal = "  + myLongTotal);


    }
}
