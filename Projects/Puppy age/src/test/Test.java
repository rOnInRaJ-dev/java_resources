
package test;


public class Test {
    
    public static int a, b;                                                                                                   
    
    public static void main(String[] args) {
        
        Test test=new Test();
        test.pupAge();
        
        int d1=a=40;
        int d2=b=20;
        
        test.divAge(d1, d2);
        
    }
    
    public void divAge(int az, int bz) {
        
        int x=az;
        int y=bz;
        
        int r= x/y;
        
        System.out.println("Puppy age is :" +r);
    }
    
    public void pupAge(){
        
        int age=0;
        age= age+7;
        System.out.println("Puppy age is: " +age);
        
    }
    
}
