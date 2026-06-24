import java.util.Scanner;

public class CheckNumber {

    static int check(int num) {
        if (num > 0) return 1;
        if (num < 0) return -1;
        return 0;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();

            System.out.println(check(num));
        }
    }
}