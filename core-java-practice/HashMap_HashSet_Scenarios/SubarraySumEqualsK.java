import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubarraySumEqualsK {

    static int subarraySum(int[] arr, int k) {

        Map<Integer, Integer> prefix = new HashMap<>();

        prefix.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : arr) {

            sum += num;

            count += prefix.getOrDefault(sum - k, 0);

            prefix.put(sum, prefix.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size: ");
            int n = sc.nextInt();
            
            int[] arr = new int[n];
            
            System.out.println("Enter revenue changes:");
            
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            
            System.out.print("Enter target sum: ");
            int k = sc.nextInt();
            
            System.out.println("Total Subarrays = " + subarraySum(arr, k));
        }
    }
}