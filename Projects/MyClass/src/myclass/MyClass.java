package myclass;

public class MyClass {
    
    int w;
    int l;
    int h;
    
    MyClass(int l, int w, int h){
        this.l= l;
        this.w= w;
        this.h= h;
    }

    public static void main(String[] args) {
        MyClass cube1=new MyClass(3,5,9);
        MyClass cube2=new MyClass(6,10,9);
        
        System.out.println(cube1.l + " " + cube1.h + " " + cube1.w + " ");
        System.out.println(cube2.l + " " + cube2.h + " " + cube2.w + " ");
    }
    
}
