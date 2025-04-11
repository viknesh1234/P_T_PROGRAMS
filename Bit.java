import java.math.BigInteger;
import java.util.Scanner;
public class Bit{
public  static  BigInteger(int num) {
    BigInteger fact = BigInteger.ONE;
    if(num>=2){
        for(int i =2; i <=num; i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    BigInteger factorial = factorial(num);
    System.out.println(factorial);
}
}
