import java.util.Scanner;

public class HospitalEmergency {

    static void sort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {

            int max = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of patients: ");
            int n = sc.nextInt();
            
            int priority[] = new int[n];
            
            System.out.println("Enter priorities:");
            
            for (int i = 0; i < n; i++) {
                priority[i] = sc.nextInt();
            }
            
            System.out.print("Enter K: ");
            int k = sc.nextInt();
            
            sort(priority);
            
            System.out.println(k + " Highest Priority = " + priority[k - 1]);
        }
    }
}