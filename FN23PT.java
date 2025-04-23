import java.util.*;
public class FN23PT {
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     // System.out.println("ENTER THE  ELEMENTS");
//     // int mv = sc.nextInt();
//     List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
//     int rotate = 3;

//     for(int i =0; i<rotate; i++){
//         int first = list.remove(list.size()-1);
//         list.add(0,first);
//     }
//     for(int vm : list){
//         System.out.println("ROTATION  THE INTEGER :  " + vm);
//     }
// }


public static void main(String[] args) {
    // Step 1: Create the ArrayList with some numbers
    List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    // Step 2: Loop through the list
    Iterator<Integer> iterator = numbers.iterator();  // We use iterator because we might modify the list while iterating
    while (iterator.hasNext()) {
        int num = iterator.next();  // Get next number
        if (num % 2 != 0) {  // If the number is odd
            iterator.remove();  // Remove the odd number
        }
    }

    // Step 3: Print the even numbers left in the list
    System.out.println("Even numbers: " + numbers);
}
}
