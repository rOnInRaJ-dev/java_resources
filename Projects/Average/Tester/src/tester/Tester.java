
package tester;

import java.util.Scanner;


public class Tester {

    
    public static void main(String[] args) {
        
        System.out.println("This is a program that allow only users with an age of 18 and above.");
        
        Scanner s= new Scanner(System.in);
        
        System.out.println("Please Enter your age");
        
        int a;
        a=s.nextInt();
        
        System.out.println("Your age is " +a);
        
        if (a >=18 ) {
            
            System.out.println("You are old.");
        }
        
        else {
            
            System.out.println("Grow up");
            
        }
            
        }
                
}
    

