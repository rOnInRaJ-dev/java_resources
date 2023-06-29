package com.raj;
import java.util.Scanner;
class Main {
    private static int rajClassRep;
    private static int meghClassRep;
    private static int vedantClassRep;
    private static int adrenClassRep;

    private static int rajPrez = 0;
    private static int meghPrez=0;
    private static int vedantPrez=0;
    private static int adrenPrez=0;
    public static void main(String[] args) {
        start();
    }
    private static void start() {
        classRep();
        president();
        end();
    }
    private static void classRep (){

        System.out.println("\t\tCLASS REPRESENTATIVE");
        System.out.println("1.) Raj");
        System.out.println("2.) Megh");
        System.out.println("3.) Vedant");
        System.out.println("4.) Adren");
        Scanner s=new Scanner (System.in);
        int chosen=s.nextInt();
        if (chosen==1) {
           rajClassRep ++;
        }
        else if (chosen==2) {
            meghClassRep ++;
        }
        else if (chosen==3) {
            vedantClassRep ++;
        }
        else if (chosen==4) {
            adrenClassRep ++;
        }
    }
    private static void president (){

        System.out.println("\t\tPRESIDENT");
        System.out.println("1.) Raj");
        System.out.println("2.) Megh");
        System.out.println("3.) Vedant");
        System.out.println("4.) Adren");
        Scanner s=new Scanner (System.in);
        int chosen=s.nextInt();
        if (chosen==1) {
            rajPrez ++;
        }
        else if (chosen==2) {
            meghPrez ++;
        }
        else if (chosen==3) {
            vedantPrez ++;
        }
        else if (chosen==4) {
            adrenPrez ++;
        }
    }
    private static void end (){
        Scanner s = new Scanner(System.in);
        System.out.println("Thank you for voting.");
        System.out.println("Press 'no' to restart or 'yes' to end and see the results");
        String exit=s.nextLine();
        String no="no",yes="yes";
        if (exit.equalsIgnoreCase(no)) {
            start();
        }
        else if (exit.equalsIgnoreCase(yes)) {
            System.out.println("Exit");
            System.out.println("Confirm 'Yes' or 'No'");
            String exitConfirm=s.nextLine();
            String noConfirm="no",yesConfirm="yes";
            if (exitConfirm.equalsIgnoreCase(no)) {
                end();
            }
            else if (exitConfirm.equalsIgnoreCase(yes)) {
                System.out.println("RESULTS");
                results();
            }
        }
        else {
            System.out.println("Choose yes or no.");
            end();
        }
    }
    private static void results () {
        System.out.println("\n\t\tClass Representative");
        System.out.println("\nRaj : " +rajClassRep +" votes");
        System.out.println("Megh : " +meghClassRep +" votes");
        System.out.println("Vedant : " +vedantClassRep +" votes");
        System.out.println("Adren : " +adrenClassRep +" votes");

        System.out.println("\n\t\tPresident");
        System.out.println("\nRaj : " +rajPrez +" votes");
        System.out.println("Megh : " +meghPrez +" votes");
        System.out.println("Vedant : " +vedantPrez +" votes");
        System.out.println("Adren : " +adrenPrez +" votes");
    }
}
