import java.util.*;
public class kaprekar {
    public static  boolean isKaprekar(int n){
        if(n ==1){
            return true;
        }
        int sq = n* n;
        String str = String.valueOf(sq);
        int len =str.length();

        for(int i = 1; i<len;i++){
            String left = str.substring(0,i);
            String right =str.substring(i);

            int l =Integer.parseInt(left);
            int r = Integer.parseInt(right);

            if(r!= 0 && (l+r)==n){
                return true;
            }
        }
        return false;
        }
        
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of terms: ");
    int n = sc.nextInt();
    int arr[] = new int[n]
        if(isKaprekar(n)){
            System.out.println(n+"The number is a Kaprekar number.");
        }else{
            System.out.println(n+"The number is not a Kaprekar number.");
        }
    
    }
}

