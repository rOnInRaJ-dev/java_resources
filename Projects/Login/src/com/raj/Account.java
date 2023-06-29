package com.raj;

import java.util.Scanner;

public class Account extends Main{

	private Scanner scanner = new Scanner(System.in);

	private static int accountMoney;

	Account(int money){

		accountMoney = money;

	}

	void withdraw(){
		System.out.println("**************************************************************************************************");
		System.out.println("\t\t\t\t\t\t\tYou currently have $" + accountMoney +" in your bank account");
		System.out.println("\t\t\t\t\t\t\tPlease enter how much you would like to withdraw");
		System.out.println("**************************************************************************************************");

		int amount = scanner.nextInt();

		if(amount <= accountMoney){
			accountMoney -= amount;
			System.out.println("**************************************************************************************************");
			System.out.println("\t\t\t\t\t\t\tYou have withdrawn $" + amount +". You now have $" + accountMoney +".");
			System.out.println("\t\t\t\t\t\t\tTHANK YOU FOR USING FUTURE BANK");
			System.out.println("**************************************************************************************************");

			System.out.println("\n");
			startScreen();
		} else if(amount <0) {
			System.out.println("**************************************************************************************************");
			System.out.println("\t\t\t\t\t\t\t\t\t\tERROR!");
			System.out.println("\t\t\t\t\t\tYou need to enter valid values to withdraw in your account");
			System.out.println("**************************************************************************************************\n\n");
			withdraw();

		}else {
			System.out.println("**************************************************************************************************");
			System.out.println("\t\t\t\t\t\t\t\t\t\tERROR!");
			System.out.println("\t\t\t\t\t\tYou do not have sufficient funds n your bank account");
			System.out.println("**************************************************************************************************\n\n");
			withdraw();
		}
	}

	void deposit() {

		System.out.println("**************************************************************************************************");
		System.out.println("\t\t\t\t\t\t\tYou currently have $" + accountMoney +" in your bank account");
		System.out.println("\t\t\t\t\t\t\tPlease enter how much you would like to deposit");
		System.out.println("**************************************************************************************************");
		int amount = scanner.nextInt();

		if(amount <= accountMoney) {
			System.out.println("**************************************************************************************************");
			System.out.println("\t\t\t\t\t\t\t\t\t\tERROR!");
			System.out.println("\t\t\t\t\t\tYou need to enter valid values to deposit in your account");
			System.out.println("**************************************************************************************************\n\n");
			deposit();
		}else
		 {
			accountMoney += amount;

			System.out.println("**************************************************************************************************");
			System.out.println("\t\t\t\t\t\t\tYou have deposited $" + amount + ". You now have $" + accountMoney + ".");
			System.out.println("\t\t\t\t\t\t\tTHANK YOU FOR USING FUTURE BANK");
			System.out.println("**************************************************************************************************\n\n");

			startScreen();
		}
	}



}