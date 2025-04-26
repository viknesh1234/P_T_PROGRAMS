import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;



public class FN26PT {
    public static List<Integer> findIntersection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        // Add all elements of arr1 to set1
        for (int num : arr1) {
            set1.add(num);
        }

        // Check if elements of arr2 are in set1
        for (int num : arr2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }

        // Convert resultSet to List and return
        return new ArrayList<>(resultSet);
    }
  
    //public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get first array input
        // System.out.print("Enter size of first array: ");
        // int n1 = sc.nextInt();
        // int[] array1 = new int[n1];
        // System.out.println("Enter elements of first array:");
        // for (int i = 0; i < n1; i++) {
        //     array1[i] = sc.nextInt();
        // }

        // // Get second array input
        // System.out.print("Enter size of second array: ");
        // int n2 = sc.nextInt();
        // int[] array2 = new int[n2];
        // System.out.println("Enter elements of second array:");
        // for (int i = 0; i < n2; i++) {
        //     array2[i] = sc.nextInt();
        // }

        // // Find and print intersection
        // List<Integer> result = findIntersection(array1, array2);
        // System.out.println("Intersection: " + result);
    

    }

    // nextone
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Convert strings to char array and sort
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Check if arrays are equal
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Yes! The strings are anagrams.");
        } else {
            System.out.println("Nope! The strings are not anagrams.");
        }

        sc.close();
    }
}