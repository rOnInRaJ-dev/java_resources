package com.raj;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        Random rando= new Random();
        int number;
        JOptionPane.showMessageDialog(null ,"Hello user. I have created a program that rolls a 6-sided dice at random." );
        JOptionPane.showMessageDialog(null ,"You have to guess which number is shown on top.");
        JOptionPane.showMessageDialog(null ,"Try your luck.");
        String begin = JOptionPane.showInputDialog("Type Ok to begin");
        String Ok="Ok";
        if (Ok.equalsIgnoreCase(begin)) {
            String start=JOptionPane.showInputDialog("Start guessing. You have only 3 tries.");
            number = 1 + rando.nextInt(6);
            int in = Integer.parseInt(start);
            if (in == number) {
                JOptionPane.showMessageDialog(null ,"Congrats! You guessed it right.");
            }
            else if (in>6){
                JOptionPane.showMessageDialog(null ,"You are so dumb you cannot even follow instructions.");
            }
            else {
                String repeat=JOptionPane.showInputDialog("try again");
                int ina = Integer.parseInt(repeat);
                if (ina == number) {
                    JOptionPane.showMessageDialog(null ,"Congrats! You guessed it right.");
                }
                else if (ina>6){
                    JOptionPane.showMessageDialog(null ,"You are so dumb you cannot even follow instructions.");
                }
                else {
                    String repeat2=JOptionPane.showInputDialog("try again");
                    int inb= Integer.parseInt(repeat2);
                    if (inb == number){
                        JOptionPane.showMessageDialog(null ,"Congrats! You guessed it right.");
                    }
                    else if (inb>6){
                        JOptionPane.showMessageDialog(null ,"You are so dumb you cannot even follow instructions.");
                    }
                    else {
                        JOptionPane.showMessageDialog(null ,"Sorry. Bad luck. Best of luck next time.");
                    }
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(null ,"You are so dumb.");
            JOptionPane.showMessageDialog(null ,"You can't even follow simple instructions");

        }
    }
}
