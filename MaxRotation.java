import java.util.*;

public class MaxRotation {
    public static int isMaxnum(int[] arr, int n) {
        int sum = 0;
        int currentVal = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            currentVal += i * arr[i]; // F(0)
        }

        int maxVal = currentVal;

        // Use the rotation sum formula
        for (int i = 1; i < n; i++) {
            currentVal = currentVal + sum - n * arr[n - i];
            maxVal = Math.max(maxVal, currentVal);
        }

        return maxVal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = isMaxnum(arr, n);
        System.out.println("The maximum rotation sum is: " + result);
    }
}
