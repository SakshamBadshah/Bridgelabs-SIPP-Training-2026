public class PalindromeChecker {

    String text = "madam";

    void check() {

        String rev = "";

        for(int i=text.length()-1;i>=0;i--)
            rev += text.charAt(i);

        System.out.println(text.equals(rev));
    }

    public static void main(String[] args) {

        PalindromeChecker p = new PalindromeChecker();
        p.check();
    }
}