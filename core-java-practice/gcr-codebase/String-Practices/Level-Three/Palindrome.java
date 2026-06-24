import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        boolean palindrome=true;

        int start=0;
        int end=text.length()-1;

        while(start<end){
            if(text.charAt(start)!=text.charAt(end)){
                palindrome=false;
                break;
            }
            start++;
            end--;
        }

        System.out.println(palindrome?"Palindrome":"Not Palindrome");
    }
}