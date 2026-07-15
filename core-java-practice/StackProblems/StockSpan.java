import java.util.Scanner;
import java.util.Stack;

public class StockSpan {

    public static int[] calculateSpan(int[] price) {

        int n = price.length;
        int[] span = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }

            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of days: ");
            int n = sc.nextInt();
            
            int[] prices = new int[n];
            
            System.out.println("Enter prices:");
            
            for (int i = 0; i < n; i++) {
                prices[i] = sc.nextInt();
            }
            
            int[] span = calculateSpan(prices);
            
            System.out.println("Stock Span:");
            
            for (int s : span) {
                System.out.print(s + " ");
            }
        }
    }
}