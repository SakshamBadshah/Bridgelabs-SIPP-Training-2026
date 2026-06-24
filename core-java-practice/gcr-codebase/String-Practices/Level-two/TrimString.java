import java.util.Scanner;

public class TrimString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        int start = 0;
        int end = text.length() - 1;

        while (text.charAt(start) == ' ')
            start++;

        while (text.charAt(end) == ' ')
            end--;

        String result = "";

        for (int i = start; i <= end; i++)
            result += text.charAt(i);

        System.out.println("User Trim = [" + result + "]");
        System.out.println("Built-in = [" + text.trim() + "]");
    }
}