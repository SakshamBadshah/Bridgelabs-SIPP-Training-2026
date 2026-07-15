import java.util.Scanner;

public class CPUSpikeDetection {

    public static int maxSubarrayOfSizeK(int[] cpu, int k) {

        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0;

        for (int end = 0; end < cpu.length; end++) {

            windowSum += cpu[end];

            if (end >= k - 1) {

                maxSum = Math.max(maxSum, windowSum);

                windowSum -= cpu[start];
                start++;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter readings: ");
            int n = sc.nextInt();
            
            int[] cpu = new int[n];
            
            System.out.println("Enter CPU values:");
            
            for (int i = 0; i < n; i++)
                cpu[i] = sc.nextInt();
            
            System.out.print("Window Size: ");
            int k = sc.nextInt();
            
            System.out.println("Maximum CPU Load = " + maxSubarrayOfSizeK(cpu, k));
        }
    }
}