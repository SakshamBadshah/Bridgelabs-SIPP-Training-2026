import java.util.Scanner;

public class CharacterType {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine().toLowerCase();

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if ("aeiou".indexOf(ch) != -1)
                System.out.println(ch + " -> Vowel");
            else if (ch >= 'a' && ch <= 'z')
                System.out.println(ch + " -> Consonant");
            else
                System.out.println(ch + " -> Not Letter");
        }
    }
}