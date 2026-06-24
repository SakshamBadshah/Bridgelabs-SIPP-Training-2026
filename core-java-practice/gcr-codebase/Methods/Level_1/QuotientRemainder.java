import java.util.Scanner;

public class QuotientRemainder {

    static int[] find(int num, int divisor) {
        return new int[]{num / divisor, num % divisor};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int divisor = sc.nextInt();

        int[] result = find(num, divisor);

        System.out.println("Quotient = " + result[0]);
        System.out.println("Remainder = " + result[1]);
    }
}