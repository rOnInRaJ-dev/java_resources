
package area_of_trapezium;
import java.util.Scanner;

public class Area_Of_Trapezium {
    
    public static void main(String[] args) {
        
        int a, b, h;
        
        Scanner s= new Scanner(System.in);
        
        System.out.println("Hello User, this program will enable you to calculate the area of a trapezium.");
        
        System.out.println("To Start off, please enter the top length.");
        a= s.nextInt();
        
        System.out.println("Now Enter the base length.");
        b= s.nextInt();
        
        System.out.println("Now enter the height of trapezium.");
        h= s.nextInt();
        
        System.out.println("The area of your trapezium is " +area(a, b, h));
    }
    
    public static double area(int a, int b, int h){
        
        double area = 0.5*h*(a+b);
        return area;
        
    }
    
}
