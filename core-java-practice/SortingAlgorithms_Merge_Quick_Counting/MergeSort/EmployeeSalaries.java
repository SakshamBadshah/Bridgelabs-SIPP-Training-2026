import java.util.*;

public class EmployeeSalaries {

    static void mergeSort(int[] arr, int l, int r) {

        if (l < r) {

            int m = (l + r) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    static void merge(int[] arr, int l, int m, int r) {

        int[] temp = new int[r - l + 1];

        int i = l;
        int j = m + 1;
        int k = 0;

        while (i <= m && j <= r) {

            if (arr[i] < arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while (i <= m)
            temp[k++] = arr[i++];

        while (j <= r)
            temp[k++] = arr[j++];

        for (i = l, k = 0; i <= r; i++, k++)
            arr[i] = temp[k];
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Number of Employees : ");
            
            int n = sc.nextInt();
            
            int[] salary = new int[n];
            
            System.out.println("Enter Salaries");
            
            for (int i = 0; i < n; i++)
                salary[i] = sc.nextInt();
            
            mergeSort(salary, 0, n - 1);
            
            System.out.println("Sorted Salaries");
            
            for (int i : salary)
                System.out.print(i + " ");
        }
    }
}