import java.util.Scanner;

public class PositionSwap {
     public static void main(String[] args) {
       // int arr[]={1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        // int pos1 = sc.nextInt();
        // int pos2 = sc.nextInt();

    //   if(pos1<0 || pos2<0 || pos1>=size ||pos2>=size){
    //     System.out.println("Invalid");
    //   }
    //   else{
    int pos1,pos2;
    for(pos1 =0, pos2 = arr.length-1; pos1<pos2; pos1++, pos2--){
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;{
            for(int term : arr)
            System.out.println(term+" ");
        }
      }
    // int start =0;
    // int end=arr.length-1;
    // while(start<end){
    //     int temp=arr[start];
    //     arr[start]=arr[end];
    //     arr[end]= temp;
    //     start++;
    //     end--;
        
    // }{
    //     for(int term : arr){
    //         System.out.print(term +" ");
    //     }
    // }
        
    
      }
    
}
