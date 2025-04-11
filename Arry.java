import java.util.Random;
import java.util.Scanner;
public class Arry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []arr = new int [size];
        Random rnd = new Random();
        for(int i=0; i<size; i++){
            int val = rnd.nextInt()%100;
            if(val<0){
                val = -(val);
            }
            arr[i]=val;
        }
        for (int i : arr){
            System.out.print(i+" ");
        }

        }

      
    
}
