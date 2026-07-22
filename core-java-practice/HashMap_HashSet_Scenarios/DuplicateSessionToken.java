import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateSessionToken {

    static boolean hasDuplicateToken(String[] tokens) {

        Set<String> seen = new HashSet<>();

        for (String token : tokens) {

            if (!seen.add(token))
                return true;
        }

        return false;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of tokens: ");
            int n = sc.nextInt();
            sc.nextLine();
            
            String[] tokens = new String[n];
            
            System.out.println("Enter Tokens:");
            
            for (int i = 0; i < n; i++) {
                tokens[i] = sc.nextLine();
            }
            
            if (hasDuplicateToken(tokens))
                System.out.println("Duplicate Token Found");
            else
                System.out.println("No Duplicate Token");
        }
    }
}