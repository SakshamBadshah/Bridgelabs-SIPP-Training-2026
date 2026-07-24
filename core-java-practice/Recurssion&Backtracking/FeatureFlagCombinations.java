import java.util.*;

public class FeatureFlagCombinations {

    public static List<List<String>> generateFlagCombinations(String[] flags) {
        List<List<String>> result = new ArrayList<>();
        backtrack(flags, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(String[] flags, int index,
                                  List<String> current,
                                  List<List<String>> result) {

        if (index == flags.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Include current flag
        current.add(flags[index]);
        backtrack(flags, index + 1, current, result);

        // Exclude current flag
        current.remove(current.size() - 1);
        backtrack(flags, index + 1, current, result);
    }

    public static void main(String[] args) {
        String[] flags = {"DarkMode", "BetaSearch", "NewCheckout"};

        List<List<String>> result = generateFlagCombinations(flags);

        for (List<String> list : result) {
            System.out.println(list);
        }
    }
}