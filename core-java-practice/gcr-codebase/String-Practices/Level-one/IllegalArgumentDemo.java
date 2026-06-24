import java.util.Scanner;

public class IllegalArgumentDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        try {
            System.out.println(text.substring(5, 2));
        }
        catch (Exception e) {
            System.out.println("IllegalArgumentException Handled");
        }
    }
}