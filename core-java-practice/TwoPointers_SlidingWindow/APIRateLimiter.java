import java.util.*;

public class APIRateLimiter {

    public static int longestSubarray(int[] arr, int k) {

        Map<Integer, Integer> freq = new HashMap<>();

        int start = 0;
        int maxLen = 0;

        for (int end = 0; end < arr.length; end++) {

            freq.put(arr[end], freq.getOrDefault(arr[end], 0) + 1);

            while (freq.size() > k) {

                freq.put(arr[start], freq.get(arr[start]) - 1);

                if (freq.get(arr[start]) == 0)
                    freq.remove(arr[start]);

                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter total API requests: ");
            int n = sc.nextInt();
            
            int[] keys = new int[n];
            
            System.out.println("Enter API Key IDs:");
            
            for (int i = 0; i < n; i++)
                keys[i] = sc.nextInt();
            
            System.out.print("Enter maximum distinct keys: ");
            int k = sc.nextInt();
            
            System.out.println("Longest Valid Window = " + longestSubarray(keys, k));
        }
    }
}