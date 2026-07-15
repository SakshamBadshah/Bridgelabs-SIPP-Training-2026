import java.util.Scanner;

public class BankFraudDetection {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of transactions: ");
            int n = sc.nextInt();
            
            int amount[] = new int[n];
            
            System.out.println("Enter transaction amounts:");
            
            for (int i = 0; i < n; i++) {
                amount[i] = sc.nextInt();
            }
            
            int count = 0;
            
            for (int i = 0; i < n; i++) {
                
                for (int j = i + 1; j < n; j++) {
                    
                    if (amount[i] > 3 * amount[j]) {
                        count++;
                    }
                    
                }
            }
            
            System.out.println("Suspicious Pairs = " + count);
        }
    }
}