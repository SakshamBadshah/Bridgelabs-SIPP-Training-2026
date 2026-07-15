import java.util.Scanner;

public class WebsiteResponseAnalysis {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of response times: ");
            int n = sc.nextInt();
            
            int response[] = new int[n];
            
            System.out.println("Enter response times:");
            
            for (int i = 0; i < n; i++) {
                response[i] = sc.nextInt();
            }
            
            int count = 0;
            
            for (int i = 0; i < n; i++) {
                
                for (int j = i + 1; j < n; j++) {
                    
                    if (response[i] > response[j]) {
                        count++;
                    }
                    
                }
            }
            
            System.out.println("Performance Violations = " + count);
        }
    }
}