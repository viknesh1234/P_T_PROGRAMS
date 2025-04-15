public class trianglestars {
    public static int dup(int n[]) {
        for(int i =0; i<n.length; i++){
            for(int j=0; j<n.length; j++){
                if(i!=j && n[i]==n[j]){
                    break;              
                }   
                if(j==n.length-1){
                    return n[i];
                }
            }
        }
        return -1;
    
        }
    
    public static void main(String[] args) {
     int n[] ={5,8,4,5,6,7}; 
    
     System.out.println(dup(n));                      //daimond pattern
        // for(int i =1; i<n;i++){
        //     for(int j=1; j<=i; j++){
        //     System.out.print("* ");
        // }
//         for(int k =0; k<2*i+1; k++){
//             System.out.print("*");
//         }            
//         for(int j=0; j<n-i-1; j++){
//             System.out.print(" ");
//         }
        
//         System.out.println();
//     }
//     for(int i=n-1;i>=1;i--){
//         for(int j=n; j>=i;j--){
//         System.out.print(" ");
//     }
//     for(int k=1;k<=2*i-1;k++){
//         System.out.print("*");
//     }
// for(int k=n-i; k>=1;k--){
//     for(int j=1; j>=n-i;j--){
//     System.out.print("*");
// }
// }
//    System.out.println();
//  }
     
        
    }

}
