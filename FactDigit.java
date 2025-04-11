import java.util.*;
public class FactDigit {
    public static int factDigits(int num){
        int digit = 0;
        int sum =0;
         while(num!=0){
            digit = num%10;

            int fact = 1;
            for (int i = 1; i<=digit; i++){
                fact = fact*i;
            }
            sum = sum + fact;
            num/=10;
         }
         return sum;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factDigits(num));
        
    }
    
}
