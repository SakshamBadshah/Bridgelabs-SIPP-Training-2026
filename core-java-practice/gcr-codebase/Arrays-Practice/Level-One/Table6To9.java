import java.util.Scanner;

public class Table6To9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] result = new int[4];

        for (int i = 6; i <= 9; i++) {
            result[i - 6] = n * i;
            System.out.println(n + " * " + i + " = " + result[i - 6]);
        }
    }
}