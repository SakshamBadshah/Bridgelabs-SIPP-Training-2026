import java.util.Scanner;

public class MergeCustomerRecords {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of Branch A: ");
            int n1 = sc.nextInt();
            int a[] = new int[n1];
            System.out.println("Enter Branch A IDs:");
            for (int i = 0; i < n1; i++) {
                a[i] = sc.nextInt();
            }   System.out.print("Enter size of Branch B: ");
            int n2 = sc.nextInt();
            int b[] = new int[n2];
            System.out.println("Enter Branch B IDs:");
            for (int i = 0; i < n2; i++) {
                b[i] = sc.nextInt();
            }   int result[] = new int[n1 + n2];
            int i = 0, j = 0, k = 0;
            while (i < n1 && j < n2) {
                
                if (a[i] < b[j]) {
                    result[k++] = a[i++];
                } else {
                    result[k++] = b[j++];
                }
            }   while (i < n1) {
                result[k++] = a[i++];
            }   while (j < n2) {
                result[k++] = b[j++];
            }   System.out.println("Merged Records:");
            for (int x : result) {
                System.out.print(x + " ");
            }
        }
    }
}