import java.util.Scanner;
public class Factorial {
   
    public static int factorial(int n) {
        int num = 1;
        if (n == 0 || n == 1) {
            return 1;
        } else  {
          for(int i = 2; i <= n; i++){
            num = num*i;
        }
    }
        return num;
        
    }
    public static  int SumOfDigits (int num) {
        int sum = 0;
        while(num!=0){
            sum = sum +num%10;
            num /=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " is: " + factorial(num));
        System.out.println("sum of digits " + num + "is: " + SumOfDigits(num) );
    }
    
}
