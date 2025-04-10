import java.util.*;
public class Method {
 
        public static int addition(int a, int b){
            return a+b;
        }
        public static int subtraction(int a, int b){
            return (a-b);
        }
        public static int multiplication(int a, int b){
            return a*b;
        }
        public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(addition(a,b));
        System.out.println(subtraction(a,b));
        System.out.println(multiplication(a,b));

    }
}
