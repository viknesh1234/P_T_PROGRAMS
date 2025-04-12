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
    public static void insertPosition(int newArry[], int oldArry[]) {
        for (int i = 0; i<position; i++){
            newArry[i]= oldArry[i]; 
        }
        newArry[position] =100;// 100 is the value to be inserted
        for (int i =0; i<newArry.length-1; i++){
            newArry [i]=oldArry[i];
        }
        System.out.println("after add 100 position of 3");
        printarry(newArry);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]= new int[size];
        for(int i=0; i<size; i++){
            arr[i]= i+1;// 1,2,3,4,5
            //i= 0+1=1, i=1+1=2, i=2+1=3, i=3+1=4, i=4+1=5
        }
        int len = 5;
        int newArry[] = new int [size+len]; // 5+5=10
        // newArry [0]= 100;  
        for (int i =0; i<size; i++){
            newArry [i]= arr[i]; // 100,1,2,3,4,5

        }
        for(int i =size-1; i<newArry.length; i++){
            newArry[i]= i+1;// 6,7,8,9,10
            //i= 5+1=6, i=6+1=7, i=7+1=8, i=8+1=9, i=9+1=10
        }
        System.out.println("Adding 100 to the first index of the array: ");
        //printarry(newArry);
        printarry(insertPosition(newArry,arr));




        
       // printarry(arr);
         //   sumofarry(arr,size);

    }
}
