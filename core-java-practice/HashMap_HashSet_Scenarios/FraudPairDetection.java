import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FraudPairDetection {

    static int[] findFraudPair(int[] amounts, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < amounts.length; i++) {

            int complement = target - amounts[i];

            if (map.containsKey(complement))
                return new int[] { map.get(complement), i };

            map.put(amounts[i], i);
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size: ");
            int n = sc.nextInt();
            
            int[] amounts = new int[n];
            
            System.out.println("Enter transaction amounts:");
            
            for (int i = 0; i < n; i++)
                amounts[i] = sc.nextInt();
            
            System.out.print("Enter target: ");
            int target = sc.nextInt();
            
            int[] ans = findFraudPair(amounts, target);
            
            if (ans[0] == -1)
                System.out.println("No Pair Found");
            else
                System.out.println("Indices = " + ans[0] + " " + ans[1]);
        }
    }
}