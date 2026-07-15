import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinimumWindowSubstring {

    public static String minWindow(String s, String t) {

        if (s.length() == 0 || t.length() == 0)
            return "";

        Map<Character, Integer> need = new HashMap<>();

        for (char c : t.toCharArray())
            need.put(c, need.getOrDefault(c, 0) + 1);

        Map<Character, Integer> window = new HashMap<>();

        int required = need.size();
        int formed = 0;

        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            window.put(c, window.getOrDefault(c, 0) + 1);

            if (need.containsKey(c) &&
                    window.get(c).intValue() == need.get(c).intValue()) {
                formed++;
            }

            while (formed == required) {

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char ch = s.charAt(left);

                window.put(ch, window.get(ch) - 1);

                if (need.containsKey(ch) &&
                        window.get(ch) < need.get(ch)) {
                    formed--;
                }

                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE)
            return "";

        return s.substring(start, start + minLen);
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter String: ");
            String s = sc.nextLine();
            
            System.out.print("Enter Pattern: ");
            String t = sc.nextLine();
            
            System.out.println("Minimum Window = " + minWindow(s, t));
        }
    }
}