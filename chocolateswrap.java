import java.util.*;
public class chocolateswrap {
    public static int countChocolates(int money, int price, int wrap)
     {
        int chocolates = money / price; // Initial chocolates bought with money
        int wrappers = chocolates;
        while(wrappers >=wrap){
                int extrachocolates = wrappers / wrap;
                chocolates +=extrachocolates;
                wrappers = wrappers%wrap + extrachocolates;
        }   // Initial wrappers from the chocolates
            return chocolates; // Total chocolates including those obtained from wrappers
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total Money : ");
        int money = sc.nextInt();
        System.out.print("Enter the Chocolates price : ");
        int price = sc.nextInt();
        System.out.print("Enter the wrap price : ");
        int wrap = sc.nextInt();

        int totalChocolates = countChocolates(money, price,wrap);
        System.out.print("Total Chocolates =  " + totalChocolates);
    }
}
