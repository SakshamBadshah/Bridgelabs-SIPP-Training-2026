import java.util.Scanner;

public class CountdownWhile {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            while (n >= 1) {
                System.out.println(n);
                n--;
            }
        }
    }
}