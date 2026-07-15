import java.util.Scanner;

public class EmployeePromotionConflicts {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of employees: ");
            int n = sc.nextInt();
            
            int score[] = new int[n];
            
            System.out.println("Enter performance scores:");
            
            for (int i = 0; i < n; i++) {
                score[i] = sc.nextInt();
            }
            
            int conflicts = 0;
            
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (score[i] < score[j]) {
                        conflicts++;
                    }
                }
            }
            
            System.out.println("Promotion Conflicts = " + conflicts);
        }
    }
}