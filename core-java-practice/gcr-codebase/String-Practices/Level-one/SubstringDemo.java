import java.util.Scanner;

public class SubstringDemo {

    static String getSub(String str, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++)
            result += str.charAt(i);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String s1 = getSub(text, start, end);
        String s2 = text.substring(start, end);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));
    }
}