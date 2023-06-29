package com.raj;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        //System.out.println("How many grades.");
        //int gradenum= s.nextInt();
        String grade = JOptionPane.showInputDialog("Enter Your Marks.");
        int marks= Integer.parseInt(grade);

        if (marks >=90 && marks <=100){
            JOptionPane.showMessageDialog(null ,"A+");
        } else if (marks >=80 && marks <=89){
            JOptionPane.showMessageDialog(null ,"A");
        } else if (marks >=70 && marks <=79){
            JOptionPane.showMessageDialog(null ,"B");
        } else if (marks >=60 && marks <=69){
            JOptionPane.showMessageDialog(null ,"C");
        } else if (marks >=50 && marks <=59){
            JOptionPane.showMessageDialog(null ,"D");
        } else if (marks >=40 && marks <=49){
            JOptionPane.showMessageDialog(null ,"E");
        } else if (marks >=30 && marks <=39){
            JOptionPane.showMessageDialog(null ,"F");
        } else if (marks <=29) {
            JOptionPane.showMessageDialog(null ,"Dont even bother");
        }
    }
}
