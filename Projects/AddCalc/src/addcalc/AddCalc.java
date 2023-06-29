
package addcalc;

import java.util.Scanner;

public class AddCalc {

    
    public static void main(String[] args) {
       
       int answer, a, b;
       
       Scanner s=new Scanner(System.in);
       
       System.out.println("Hello Guest. Please Enter the First number.");
       a= s.nextInt();

       System.out.println("Enter the Second number.");
       b= s.nextInt();
       
       answer=a+b;
       
       System.out.println("Your answer is " +answer);
       
    }

}
