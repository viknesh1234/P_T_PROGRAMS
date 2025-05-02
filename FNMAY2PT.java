import java.util.*;
public class FNMAY2PT {
    // void age(int a) throws Exception{
    //     if(a<18){
    //         throw new Exception("Not eligible for voting");
    //     }else{
    //         System.out.println("Eligible for voting");
    //     }
    // }
    void age(String a) throws Exception{
        if(!a.equals("@123")){
            throw new Exception("Not eligible for voting");
        }else{
            System.out.println("Eligible for voting");
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
//     String str = "123234";
//     int arr[] = new int [3];
//     try{
//         System.out.println(5/0);
//         int a = Integer.parseInt(str);
//         System.out.println(arr[3]);
//     }catch (ArithmeticException obj) {
//         System.out.println(obj.toString());
//         System.out.println("hello");
//     }
//     catch (ArrayIndexOutOfBoundsException obj) {
//         System.out.println(obj.toString());
//         System.out.println("hi");
// }
// catch (Exception obj) {
//     System.out.println(obj.toString());
   
// }
// int age = sc.nextInt();
// if(age<18){
//     throw new Exception("Not eligible for voting");
// }else{
//     System.out.println("Eligible for voting");
// }
//     }
//    int arr[] = new int[5];
//    try{
//     System.out.println(arr[5]);
//    }
//    finally{
//     System.out.println("hi everyone");
//    }
int a = sc.nextInt();
FNMAY2PT mv = new FNMAY2PT();
mv.age(a);
}
}