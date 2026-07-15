import java.util.Scanner;

public class FraudDetection {

    public static int[] findPairSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return new int[]{arr[left], arr[right]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of transactions: ");
            int n = sc.nextInt();
            
            int[] transactions = new int[n];
            
            System.out.println("Enter sorted transaction amounts:");
            
            for (int i = 0; i < n; i++) {
                transactions[i] = sc.nextInt();
            }
            
            System.out.print("Enter target amount: ");
            int target = sc.nextInt();
            
            int[] ans = findPairSum(transactions, target);
            
            if (ans[0] == -1)
                System.out.println("No Pair Found");
            else
                System.out.println("Pair = " + ans[0] + " " + ans[1]);
        }
    }
}