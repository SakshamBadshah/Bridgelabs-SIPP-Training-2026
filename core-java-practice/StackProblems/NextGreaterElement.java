import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {

    public static int[] nextGreater(int[] arr) {

        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Initialize result array with -1
        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                int index = stack.pop();
                result[index] = arr[i];
            }

            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();
            
            int[] arr = new int[n];
            
            System.out.println("Enter elements:");
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            int[] ans = nextGreater(arr);
            
            System.out.println("Next Greater Elements:");
            
            for (int value : ans) {
                System.out.print(value + " ");
            }
        }
    }
}