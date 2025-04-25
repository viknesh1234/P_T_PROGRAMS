public class AN25PT {
    public static void main(String[] args) {
        // int [][] arr ={{1,2,3,}, {4,5,6},
        //                {7,8,9}, {10,11,12}, {13,14,15}};

        //  for(int i=0; i<arr.length; i++){
        //     int max = arr[i][0];   // Initialize max to the first element of the row
        //     int min = arr[i] [0];  // Initialize min to the first element of the row
        //     for (int j = 1; j < arr[i].length; j++) {
        //         if (arr[i][j] > max) {// Compare with the first element
        //             max = arr[i][j]; // Update max if current element is greater
        //         }
        //         if (arr[i][j] < min) {
        //             min = arr[i][j];
        //         }
        //     }
        //     System.out.println("Row " + i + " max: " + max + ", min: " + min);
            

        //  }
         int [][] ar ={{1,2,3,}, {4,5,6},
                       {7,8,9}};

            for(int i=0; i<ar.length; i++){
                for(int j=0;j<ar[i].length;j++){
                    if(i==j){
                        System.out.print(ar[i][i]+" ");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();

    }
    }
}
