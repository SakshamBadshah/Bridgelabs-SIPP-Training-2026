import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double sum = 0;
            double num;

            do {
                num = sc.nextDouble();
                sum += num;
            } while (num != 0);

            System.out.println("Sum = " + sum);
        }
    }
}