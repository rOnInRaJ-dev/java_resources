
package raj;
import java.util.Scanner;

public class Raj {

    public static void main(String[] args) {
        System.out.println("Hello User,");
    System.out.println("This program will enable you to the area of a circle.");
        int radius;
        double pi=3.14,area;
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Radius of the circle");
        radius= s.nextInt();
        
        area= pi*(radius*radius);
        System.out.println("The area of the circle is " +area);
        }
    }


    

