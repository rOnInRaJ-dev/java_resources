package com.raj;

import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess the number in 10 tries");

        int num = 1 + random.nextInt(100);

        for (int i = 0; i < 5; i++) {
            int guess = scanner.nextInt();
            if (guess == num) {
                System.out.println("congrats");
                break;
            }

            else if (guess <num) {
                System.out.println("make it big");
            }

            else if (guess >num) {
                System.out.println("Make it small");
            }
        }
    }
}
