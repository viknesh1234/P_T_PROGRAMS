import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<Integer>();
         Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for(int i=0;i<n;i++){
        //     System.out.println("Enter the value ");
        //     int v =sc.nextInt();
        //     v = (val + val);
        //     list.add(v);
        // }
        // System.out.println(list);

         ArrayList<Integer> value1 = new ArrayList<Integer>();
        // System.out.println("HOW MANY NUMBERS IN THE LIST : ");
        // int n = sc.nextInt();

        // System.out.println("ENTER THE ELEMENTS ");
        // for(int i=0; i<n; i++){
        //     int num = sc.nextInt();
        //     value.add(num);
        // }
        
        // int sum = 0;
        // for(int mv : value){
        //     sum = sum + mv;
        // }
        // System.out.println("TOTAL VALUE :" + sum);

            // ARRAY LIST REVERSE 

            // Arraylist<Integer>  value1 = new Arraylist<Integer>();
            System.out.println("HOW MANY NUMBERS IN THE LIST : ");
            int r = sc.nextInt();

            System.out.println("ENTER ELEMNTS : ");
            for(int i=0; i<r; i++){
                int f = sc.nextInt();
                value1.add(f);
            }

            Collections.reverse(value1);

            for( int d : value1){
                System.out.println("reverse order : "+ " " + d);
            }
        
    }
}
