import java.util.Scanner;
public class SumOfArry {
    public static void printarry(int arr []) {
        for ( int temp : arr){
            System.out.println(temp + " ");
        }
    }
    public static void sumofarry(int arr[], int size){
        int sum =0;
        for(int i = 0; i<size; i++){
            sum =sum+arr [i]; // sum =0+1 =1, sum =1+2=3, sum =3+3=6, sum =6+4=10, sum =10+5=15
        }
        System.out.println("sum = " +sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]= new int[size];
        for(int i=0; i<size; i++){
            arr[i]= i+1;// 1,2,3,4,5
            //i= 0+1=1, i=1+1=2, i=2+1=3, i=3+1=4, i=4+1=5
        }
        printarry(arr);
            sumofarry(arr,size);
    }
}
