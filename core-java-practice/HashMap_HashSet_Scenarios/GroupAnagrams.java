import java.util.*;

public class GroupAnagrams {

    static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> groups = new HashMap<>();

        for (String s : strs) {

            char[] ch = s.toCharArray();

            Arrays.sort(ch);

            String key = new String(ch);

            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(groups.values());
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of words: ");
            int n = sc.nextInt();
            sc.nextLine();
            
            String[] words = new String[n];
            
            System.out.println("Enter words:");
            
            for (int i = 0; i < n; i++)
                words[i] = sc.nextLine();
            
            List<List<String>> result = groupAnagrams(words);
            
            System.out.println("Grouped Anagrams:");
            
            for (List<String> group : result)
                System.out.println(group);
        }
    }
}