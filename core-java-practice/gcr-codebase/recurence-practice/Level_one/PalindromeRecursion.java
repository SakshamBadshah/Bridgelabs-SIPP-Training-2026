public class PalindromeRecursion {

    static boolean check(String str) {

        if (str.length() <= 1)
            return true;

        if (str.charAt(0) !=
            str.charAt(str.length()-1))
            return false;

        return check(
            str.substring(1, str.length()-1)
        );
    }

    public static void main(String[] args) {

        if(check("madam"))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}