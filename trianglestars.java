public class trianglestars {
    // public static int dup(int n[]) {
    //     for(int i =0; i<n.length; i++){
    //         for(int j=0; j<n.length; j++){
    //             if(i!=j && n[i]==n[j]){
    //                 break;              
    //             }   
    //             if(j==n.length-1){
    //                 return n[i];
    //             }
    //         }
    //     }
    //     return -1;
    
    //     }
    
 public static void main(String[] args) {
      int n =5; 
    
    //  System.out.println(dup(n));                      //daimond pattern
        for(int i =1; i<=n;i++){
            for(int j=i; j<n; j++){
            System.out.print(" ");
        }
        for(int k =1; k<=2*i-1; k++){
            System.out.print("*");
        }            
        
        System.out.println();
    }
    for(int i=n-1;i>=1;i--){
        for(int j=n; j>i;j--){
        System.out.print(" ");
    }
    for(int k=1;k<=2*i-1;k++){
        System.out.print("*");
    }
    System.out.println();
 
}



     //     // for(int i=1; i<=n;i++){
        for(int i=1; i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i ==1 || i ==n || j==1 || j == n)                                          
                {
                    System.out.print("*");;
                }else{
                System.out.print(" ");
            }
        }
        System.out.println();
        }
       
            //   i = 1 → First row (print stars only)
                // *****
                // (count += 5)
                
                // i = 2 → Second row
                // *   *   ← stars at j = 1 and j = 5; spaces in-between
                // (count += 2)
                
                // i = 3 → Third row
                // *   *   ← same as above
                // (count += 2)
                
                // i = 4 → Fourth row
                // *   *   ← same as above
                // (count += 2)
                
                // i = 5 → Fifth row (last row, all stars)
                // *****
                // (count += 5)
           

                
                for(int i=n;i>=1;i--){
                    for(int j=0;j<n-i;j++){
                        System.out.print(" ");
                    }
                    for(int k=1; k<=2*i-1;k++){
                    System.out.print("*");
                    }
                    System.out.println();
                }
                for(int i =2; i<=n;i++){
                    for(int j=0; j<n-i;j++){
                        System.out.print(" ");
                    }
                    for(int k =1; k<=2*i-1; k++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                
    }
}


