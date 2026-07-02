import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            if (n > 0)
                System.out.println("Positive");
            else if (n < 0)
                System.out.println("Negative");
            else
                System.out.println("Zero");
        }
    }
}