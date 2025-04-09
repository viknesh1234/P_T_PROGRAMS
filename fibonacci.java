import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a= 0, b = 1, count=0;
        System.out.println("Fibonacci series " + a + " " + b);
        do{
            int temp = a+b;
            a = b;
            b = temp;
            System.out.print(temp+" ");
            count++;

        }
        while(count < num);


    }

    
}
