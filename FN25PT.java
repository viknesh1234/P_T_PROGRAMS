import java.util.Arrays;
import java.util.Scanner;


public class FN25PT {
    public static void printarray(int [][] arr) 
                /// 3RD CONTINUE
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        /// sum arr
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               sum += arr[i][j];
            }
            System.out.print(sum);
        }
        
    }
    public static int [][] takneInput(Scanner sc1) 
      /// 3RD CONTINUE
    {
        System.out.println("Enter the Row size");
        int row = sc1.nextInt();
        System.out.println("Enter the Column size");
        int col = sc1.nextInt();
        int [][] arr1 = new int [row][col];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] =sc1.nextInt();
            }
          
        }
        return arr1;
        
    }
      //  System.out.println("XXXXXXXX END XXXXXXXX");
    public static void main(String[] args) 
                 //// 1ST ///
    {
        int [] [] arr = new int [][] { {1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15} };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%02d ",arr[i][j]);
            }
            System.out.println();
        }
           System.out.println("XXXXXXXX END XXXXXXXX");
        // 2ND next one 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Row size");
        int row = sc.nextInt();
        System.out.println("Enter the Column size");
        int col = sc.nextInt();
        int [][] arr1 = new int [row][col];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.printf(arr1[i][j] + " ");
        }
        System.out.println();
    }
        System.out.println("XXXXXXXXXXX END XXXXXXXXXX");

    // 3RD next one
    Scanner sc1 = new Scanner(System.in);
    printarray(takneInput(sc1));

            //4TH next one
    //SORTED ARRAY
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc2.nextInt();
        System.out.print("Enter the elements");
        int [] arr2 = new int [n];
        for(int i=0; i<n; i++){
            arr2[i] =sc2.nextInt();
        }
        Arrays.sort(arr2);
    System.out.println("//////");
        for(int num : arr2){
            System.out.println(num);
        }

        System.out.println("XXXXXXXXXXX END XXXXXXXXXX"); 

        //5TH next one
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter the Row size");
        int row1 = sc3.nextInt();
        System.out.println("Enter the Column size");
        int col1 = sc3.nextInt();
        int [][]arr3  = new int [row1][col1];

        System.out.println("Enter the elements");
        for(int i=0; i<arr3.length; i++){
            for(int j=0; j<arr3.length; j++){
                arr3[i][j]= sc3.nextInt();
            }
        }
        System.out.println("even numbers");
        for(int i=0; i<row;i++){
            for(int j=0; j<col; j++){
                if(arr3[i][j]%2 ==0){
                    System.out.println(arr3[i][j]+ " ");
                }
            }
        }
        System.out.println("odd numbers");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(arr3[i][j]%2 !=0){
                    System.out.println(arr3[i][j]+" ");
                }
            }
        }

        System.out.println("XXXXXXXXXXX END XXXXXXXXXX");
        //6TH next one
        
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Enter the Row size");
        int row2 = sc4.nextInt();
        System.out.println("Enter the Column size");
        int col2 = sc4.nextInt();
        int [][]arr4  = new int [row2][col2];
        System.out.println("Enter the elements");
        for(int i=0; i<arr4.length; i++){
            for(int j=0; j<arr4.length; j++){
                arr4[i][j]= sc4.nextInt();
            }
        }

        int oddSum =0;
        int evenSum =0;
            
        for(int i=0; i<row2;i++){
                for(int j=0; j<col2; j++){
                    if(arr4[i][j]%2 ==0){
                        System.out.println(arr4[i][j]+ " ");
                    }
                }
            }
            System.out.println("odd numbers");
            for(int i=0; i<row2; i++){
                for(int j=0; j<col2; j++){
                    if(arr4[i][j]%2 !=0){
                        System.out.println(arr4[i][j]+" ");
                    }
                }
            }
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(arr4 [i][j] %2==0){
                    oddSum += arr4[i][j];
                }
                else{
                    evenSum += arr4[i][j];
                }
            }
        }
        System.out.println("Even sum is " + evenSum);
        System.out.println("Odd sum is " + oddSum);
}
}

