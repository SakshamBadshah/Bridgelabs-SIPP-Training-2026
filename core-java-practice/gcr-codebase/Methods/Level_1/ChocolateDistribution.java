import java.util.Scanner;

public class ChocolateDistribution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int chocolates = sc.nextInt();
        int children = sc.nextInt();

        System.out.println("Each Child Gets = " + chocolates / children);
        System.out.println("Remaining = " + chocolates % children);
    }
}