import java.util.Scanner;

public class binarybit {
    public static void main(String[] args) {
    //   int a =1;
    //      int b = 5;
//         System.out.println(Integer.toBinaryString( a));
//         System.out.println(Integer.toBinaryString( b));
//         System.out.println(Integer.toBinaryString( a&b));
//         System.out.println(Integer.toBinaryString( a|b));
//System.out.println(Integer.toBinaryString( 2^3^5));
//         System.out.println("left sift binary by 1      = "+Integer.toBinaryString(a<<1));
//         System.out.println("left shift binary by 2     = "+Integer.toBinaryString(b<<2));
//         System.out.println ("binary code value 3       = "+String.format("%8s",Integer.toBinaryString( a)).replace(" ", "0"));
//         System.out.println ("binary code value 4       = "+String.format("%8s",Integer.toBinaryString( b)).replace(" ", "0"));
//         System.out.println ("left shift binary code 3  = "+String.format("%8s",Integer.toBinaryString( a<<1)).replace(" ", "0"));
//         System.out.println ("left shift binary code 4  = "+String.format("%8s",Integer.toBinaryString( a<<2)).replace(" ", "0"));
//         System.out.println ("right shift binary code 3 = "+String.format("%8s",Integer.toBinaryString( a>>1)).replace(" ", "0"));
//         System.out.println ("right shift binary code 4 = "+String.format("%32s",Integer.toBinaryString( a>>2)).replace(" ", "0"));

// Scanner sc = new Scanner (System.in);
// int num = sc.nextInt();
// int bitposition = sc.nextInt();
// int mask = 1<<bitposition;
// int updatedvalue = num ^ mask;
// System.out.println(updatedvalue);
//System.out.println(2^3^5);

Scanner sc = new Scanner (System.in);
int n = sc.nextInt();
int count =0;
int mask = 1;
while((n & mask) >0){
    break;
}
count ++;
mask = mask<<1;
System.out.println (String.format("%32s",Integer.toBinaryString( n)).replace(" ", "0"));
System.out.println(count);
 }
}