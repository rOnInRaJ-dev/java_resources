package com.raj;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
		System.out.println("Hello and welcome to choose your own Story. \nYou will be given two options to choose from.");
		System.out.println("Let us begin.");
		System.out.println("\n\n***********************************************************");
		System.out.println("\nThis is the begining \n blah blah blah blah");
		System.out.println("Choose\n ****1.)Kill him*****2.)Spare him****");
		int firstOption = s.nextInt();
		if (firstOption==1) {
			option1Ch1();
		}
		else if (firstOption==2){
			option2Ch2();
		}
    }
    public static void option1Ch1 () {
		System.out.println("You are very bad");
	}
	public static void option2Ch2 () {
		System.out.println("Thank you for saving me");
	}
}
