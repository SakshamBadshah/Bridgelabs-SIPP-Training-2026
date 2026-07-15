import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    // Method to check whether brackets are balanced
    public static boolean isValidConfig(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Push opening brackets
            switch (ch) {
                case '(', '{', '[' -> stack.push(ch);
                case ')', '}', ']' -> {
                    if (stack.isEmpty()) {
                        return false;
                    }   char top = stack.pop();
                    if ((ch == ')' && top != '(') ||
                            (ch == '}' && top != '{') ||
                            (ch == ']' && top != '[')) {
                        return false;
                    }
                }
                default -> {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Bracket String: ");
            String input = sc.nextLine();
            
            if (isValidConfig(input)) {
                System.out.println("Brackets are Balanced.");
            } else {
                System.out.println("Brackets are NOT Balanced.");
            }
        }
    }
}