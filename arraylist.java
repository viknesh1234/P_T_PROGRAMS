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

         ArrayList<Integer> items = new ArrayList<Integer>();
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

            //  Arraylist<Integer>  value1 = new Arraylist<Integer>();
            // System.out.println("HOW MANY NUMBERS IN THE LIST : ");
            // int r = sc.nextInt();

            // System.out.println("ENTER ELEMNTS : ");
            // for(int i=0; i<r; i++){
            //     int f = sc.nextInt();
            //     value1.add(f);
            // }

            // Collections.reverse(value1);

            // for( int d : value1){
            //     System.out.println("reverse order : "+ " " + d);
            // }
        
            // items.add("apple");
            // items.add("orange");
            // items.add("banana");

            // for(int i = items.size()-1; i>=0; i--){
            //     System.out.println("index of "+i +  " value = " + items.get(i));
            // }

            // SWAP 
            System.out.println("Enter the number of elements: ");
            int n = sc.nextInt();
            
            System.out.println("Enter the elements: ");
            for (int i = 0; i < n; i++) {
                items.add(sc.nextInt());
            }
    
            System.out.println("Enter indices to swap: ");
            int i = sc.nextInt();
            int j = sc.nextInt();
            
            // Calling the swap method
            swap(items, i, j);
            
            System.out.println("List after swapping: " + items);
        }
    
        // Swap method
        public static void swap(ArrayList<Integer> items, int i, int j) {
            int temp = items.get(i);
            items.set(i, items.get(j));
            items.set(j, temp);
                    
    }
}
