import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class AN23PT {
    public static void main(String[] args) {
        // String []ar1 = {"str1", "str2", "str3", "str4", "str5", "str6", "str7", "str8", "str9", "str10"};
        // String []ar2 = {"str10", "str2", "str7", };

        // Set<String> set = new LinkedHashSet<String>(); 
            
        // for(int i=0; i<ar1.length;i++){
        //     set.add(ar1[i]);
        // }

        //  for(int i=0; i<ar2.length;i++){
        //     set.add(ar2[i]);
        // }
        // System.out.println(set);
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE  ELEMENTS");
        String mv = sc.nextLine();
        String[] ar1 = mv.split(",");
        int sum =0;for(int i=0; i<ar1.length;i++){
            sum = sum + Integer.parseInt(ar1[i]);
        }
        System.out.println("SUM OF THE INTEGER :  " + sum);
    }
}
