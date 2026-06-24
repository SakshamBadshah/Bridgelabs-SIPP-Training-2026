public class UsernameValidator {

    static boolean check(String str, int index) {

        if (index == str.length())
            return true;

        char ch = str.charAt(index);

        if (ch < 'a' || ch > 'z')
            return false;

        return check(str, index + 1);
    }

    public static void main(String[] args) {

        String username = "abcdxyz";

        System.out.println(check(username, 0));
    }
}