import java.util.*;
    class A extends Thread{
        public void run(){
            for(int i=0;i<3;i++){
            System.out.println("Hello");
        }
    }
    }
    class B extends Thread{
        public void run(){
            for(int i=0;i<3;i++){
            System.out.println("World");
        }
    }
        
    }
    public class t{
    public static void main(String[] args) {
        A a1 = new A();
        a1.start();
        B b2 = new B();
        b2.start();
    }
}
    


