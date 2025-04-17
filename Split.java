import java.util.Scanner;

public class Split {
    public static String [] reverse(String str) {
        String [] ar = str.split(" ");
        for(int i=0; i<ar.length;i++){
            if(i%2==0){
                StringBuilder str1 = new StringBuilder (ar[i]);
                str1.reverse();
                ar[i] = str1.toString();
            }
            

        }
        return ar;
    }
    
        
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String [] ar = reverse (str);
        for( String i : ar){
            System.out.print(i+ " ");
        }
        // String str = " india is my country";
        // String []ar = str.split(" ");

        // for (int i=0; i<ar.length; i++){
        //     System.out.println(ar[i]);
        // }
    }
}
