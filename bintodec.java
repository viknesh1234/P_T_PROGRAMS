import java.util.*;
public class bintodec {
    public static int gcd(int a, int b) {
    while(b !=0) {
        int temp = b;
        b =a%b;
        a = temp;
    }     
    return a;  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter a binary number: ");
        // String binary = sc.nextLine();
        // int decimal = Integer.parseInt(binary,2);// Convert binary to decimal // parseInt() method to convert a string to an integer in a specified base.  
        // //example parseInt = 1010 ;//  1*2^3 + 0*2^2 + 1*2^1 + 0*2^0 = 8 + 0 + 2 + 0 = 10
        // System.out.println("Decimal value: " + decimal);
        // // Convert decimal back to binary for verification

        // decimal to binary
        // System.out.print("Enter a decimal number: ");
        // int decimal = sc.nextInt();
        // String binary=Integer.toBinaryString(decimal);//10 = 1×2³ + 0×2² + 1×2¹ + 0×2⁰ = 8 + 0 + 2 + 0 = 10
        // System.out.print("Binary value: " + binary);
        // Convert binary back to decimal for verification

        //GCD
       //  System.out.print("enter the number of Integers : ");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        //System.out.println("GCD value : "+ gcd(a,b));

        // SubString
        System.out.println("enter the string ");
        String str = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println("SubString "+str.substring(start,end));
    }
}
