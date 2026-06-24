import java.util.Scanner;

public class DynamicLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();

        int max = 10;
        int[] digits = new int[max];
        int index = 0;

        while (num > 0) {
            if (index == max) {
                max += 10;

                int[] temp = new int[max];

                for (int i = 0; i < digits.length; i++)
                    temp[i] = digits[i];

                digits = temp;
            }

            digits[index++] = (int) (num % 10);
            num /= 10;
        }

        int largest = 0, second = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                second = largest;
                largest = digits[i];
            } else if (digits[i] > second && digits[i] != largest) {
                second = digits[i];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + second);
    }
}