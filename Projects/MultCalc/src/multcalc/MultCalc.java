
package multcalc;


public class MultCalc {

    
    public static void main(String[] args) {
        
         MultCalc m= new MultCalc();
        int p=m.mult(4,5);
        
        System.out.println(p);
        
    }
    
    public int mult(int x, int y) {
        
        int product= x*y;
        System.out.println(product);
        return product;
    }
            
}
