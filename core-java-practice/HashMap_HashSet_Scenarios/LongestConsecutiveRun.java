import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestConsecutiveRun {

    static int longestConsecutiveRun(int[] ids) {

        Set<Integer> set = new HashSet<>();

        for (int id : ids)
            set.add(id);

        int longest = 0;

        for (int id : set) {

            if (!set.contains(id - 1)) {

                int current = id;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of IDs: ");
            int n = sc.nextInt();
            
            int[] ids = new int[n];
            
            System.out.println("Enter User IDs:");
            
            for (int i = 0; i < n; i++)
                ids[i] = sc.nextInt();
            
            System.out.println("Longest Consecutive Run = " + longestConsecutiveRun(ids));
        }
    }
}