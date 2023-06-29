package com.raj;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);

        System.out.println(" There is a Secret Message hidden in here.");
        System.out.println(" To see it:");
        System.out.println(" Enter your password");
        String pass= s.nextLine();

        System.out.println(" Now enter your password again to access the hidden message");
        String password= s.nextLine();

        if (password.equals(pass)){
            System.out.println(" I Love You.");
        }
        else {
            System.out.println(" Wrong password.");
            System.out.println(" Try again");
        }
        String passagain= s.nextLine();

        if (passagain.equals(pass)){
            System.out.println(" I love you.");
        }
        else {
            System.out.println(" Invalid Password");
            System.out.println(" Many incorrect trials");
        }
    }
}
