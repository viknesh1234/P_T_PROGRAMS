import java.util.*;
public class multi{
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i=1; i<=5; i++){
    int m = i*n;
    System.out.println(n + "X" + i + "=" + m );
    }
    }
}