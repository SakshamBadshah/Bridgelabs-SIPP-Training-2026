import java.util.Scanner;

public class GenreCodeSorting {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of genres: ");
            int n = sc.nextInt();
            
            int arr[] = new int[n];
            
            System.out.println("Enter genre codes (1-20):");
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int count[] = new int[21];
            
            for (int i = 0; i < n; i++) {
                count[arr[i]]++;
            }
            
            System.out.println("Sorted Genre Codes:");
            
            for (int i = 1; i <= 20; i++) {
                
                while (count[i] > 0) {
                    System.out.print(i + " ");
                    count[i]--;
                }
                
            }
        }
    }
}