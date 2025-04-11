import java.util.Scanner;
public class MethodArry {
    public static void printArray (int[] arr , int size){
        for(int i = 0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int size = sc .nextInt();
        int arr[] = new int [size];
    for(int i =0; i<size; i++){
        arr[i] = i+1;
    }       
    printArray(arr, size);
 }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int size = sc.nextInt();
//     int extended = sc.nextInt();
// }
  }

