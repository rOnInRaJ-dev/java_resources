package com.raj;

import java.util.Scanner;

public class Prototype_School_Election2 {

	public static void main(String[] args) {

		int a=1, v=0, l=0;
		int[][] Post_01 = new int [2][2];
		String[] Post_1 = new String[2];
		String Postnm1 = "Class_Representative";

		for(int i=1,j=0;j<Post_01.length;j++){
			Post_01[0][j]=i;
			i++;
		}

		Post_1[0] = "John";
		Post_1[1] = "Jake";

		int[][] Post_02 = new int [2][3];
		String[] Post_2 = new String[3];
		String Postnm2 = "Prez";

		for(int i=1,j=0;j<Post_02.length;j++){
			Post_02[0][j]=i;
			i++;
		}

		Post_2[0] = "Ved";
		Post_2[1] = "Ant";
		Post_2[2] = "Aunty";


		Prototype_School_Election2 p = new Prototype_School_Election2();

		p.StartScreen();

		Scanner s = new Scanner(System.in);

		do{
			Post_01 = p.Voting(Post_01,Post_1,a,v,l,Postnm1);
			Post_02 = p.Voting(Post_02,Post_2,a,v,l,Postnm2);
			System.out.println("Enter 1 to continue and 0 to end");
			a=s.nextInt();
		}
		while(a==1);

		p.Results(Post_01,Post_1,Postnm1,l);
		p.Results(Post_02,Post_2,Postnm2,l);


	}

	public static void StartScreen(){
		System.out.println("Welcome to the Pollify");
		System.out.println("We will display to you different Posts and you can enter the number of the candidate you want to vote for.");
	}

	public static int[][] Voting(int[][] Post_001,String[]Post__1, int aa, int vv, int ll,String a){

		Scanner s = new Scanner(System.in);

		System.out.println(a);

		for(int i=0, j=1; i< Post__1.length;){
			System.out.println(j+" "+Post__1[i]);
			i++;
			j++;
		}

		vv = s.nextInt();

		for(int i=0;i< Post_001.length;){
			if(vv==Post_001[0][i]){
				Post_001 [1][i]++;
			}
			i++;
		}


		System.out.println("*************************");
		System.out.println("Background Results Tally");

		ll = Post_001 [1][0];

		for(int i=1; i< Post_001.length; i++){
			if(Post_001[1][i]>ll){
				ll = Post_001[1][i];
			}
		}

		for(int i=1,j=0;j<Post__1.length;j++){
			System.out.println(Post__1[j]+":"+Post_001[i][j]+" votes");
		}

		for(int i=1,j=0;j<Post_001.length;j++){
			if(Post_001[i][j]==ll){
				System.out.println("Current Winner :"+Post__1[j]+" with "+Post_001[i][j]+" votes");
			}
		}
		System.out.println("*************************");
		return Post_001;

	}
	public static void Results(int[][] Post_001, String[] Post__1, String n, int ll){

		System.out.println("******"+n+" Final Results"+"******");

		ll = Post_001 [1][0];

		for(int i=1; i< Post_001.length; i++){
			if(Post_001[1][i]>ll){
				ll = Post_001[1][i];
			}
		}

		System.out.println(n+" Results");

		for(int i=1,j=0;j<Post__1.length;j++){
			System.out.println(Post__1[j]+":"+Post_001[i][j]+" votes");
		}

		for(int i=1,j=0;j<Post_001.length;j++){
			if(Post_001[i][j]==ll){
				System.out.println("Winner :"+Post__1[j]+" with "+Post_001[i][j]+" votes");
			}
		}

		System.out.println("*************************");

	}

}
