import java.util.Scanner;

public class recursive {
    // public static int fun(int n) {
    //     if(n==0){
    //         return 0;
    //     }
    //   return fun(n/10)+1;
        
    // }
    // public static void main(String[] args) {
    //     int sum = fun(012345);
    //     System.out.println(sum);
    // }
    // public static int sumofDigit(int n, int rev) {
    //     if(n==0){
    //         return rev;
    //     }
    //     rev = rev*10+n%10;
    //     return sumofDigit(n/10)+n%10;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     System.out.println(sumofDigit(n));
   // }

//    public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the Number : ");
//     int n =sc.nextInt();
//     int mask = Integer.MIN_VALUE;
//     String s = "";
//     while(mask!=0){
//         if((n&mask) ==0){
//             s=s+"0";
//         }
//         else{
//             s = s+"1";
//         }
//         mask = mask>>>1;
//     }
//     System.out.println("Binary value : ");
//     System.out.println(s);

//    }
public static int fun (int n) {
    if(n==0 || n==1){
        return 1;
    }
    return fun(n-2) + fun(n-1);
    
}
public static void main(String[] args) {
    System.out.println(fun(7));
}
}
