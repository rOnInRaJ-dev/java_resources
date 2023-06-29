package com.raj;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);

	private static int trials = 0;

	private static Account account = new Account(100);

	public static void main(String[] args) {

		System.out.println("********************************************************");
		System.out.println("\t\t\t\t\t\t LOGIN");
		System.out.println("********************************************************");

		enterUsername();

		startScreen();
    }

	static void startScreen() {
		System.out.println("**************************************************************************************************" +
				"\n \t\t\t\t\t\t\t\t\tWELCOME TO FUTURE BANK\n" +
				"**************************************************************************************************");
		System.out.println("\t\t\t\t     Press 1  	  	 | 		    Press 2 ");
		System.out.println("\t\t\t\tto withdraw money  	 |  	to deposit money");
		int x = scanner.nextInt();

		if (x == 1) {
			//WITHDRAW
			account.withdraw();
		} else if (x ==2){
			//DEPOSIT
			account.deposit();
		}
	}

	private static void enterUsername(){

		System.out.println("Enter your username");

		String userInput = scanner.nextLine();
		trials ++;

		String cUser = "user";
		if(userInput.equals(cUser)){

			trials = 0;
			enterPassword();

		}else if (trials == 3){

			System.out.println("!!!TERMINATE PROGRAM!!!");
			System.exit(0);

		}else if (trials < 3){

			System.out.println("\t\t\t||||||Try Again!|||||||\n");
			enterUsername();

		}
	}

	private static void enterPassword(){

		System.out.println("Now enter your password");

		String passInput = scanner.nextLine();
		trials ++;


		String cPass = "pass";
		if(passInput.equals(cPass)) {

			System.out.println("\n\n");
			startScreen();

		}
		else if(trials == 3){

			System.out.println("!!!TERMINATE!!!");
			System.exit(0);

		}else if(trials < 3){

			System.out.println("\t\t\t||||||Try Again!|||||||\n");
			enterPassword();

		}
	}
}
