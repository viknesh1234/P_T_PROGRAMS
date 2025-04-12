import java.util.Scanner;
public class Starptr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int row = sc.nextInt();
        // int col = sc.nextInt();
        // for (int m = 1; m<row; m++){
        //     for(int v = 0; v<col; v++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (i == 1 || i == 0 || j == 2)
                    System.out.print("* ");
                else
                    System.out.print("  "); // Print two spaces for alignment
            }
            System.out.println();
        }
        
        // char ch = 'a';
        // for(int i = 1; i<=5; i++){
        //     ch='a';
        //     for(int j = 1; j<=i; j++){
              
        //         System.out.print(ch );
        //         ch++;
        //     }
            
        //     System.out.println("  ");
        // }
    }
}
