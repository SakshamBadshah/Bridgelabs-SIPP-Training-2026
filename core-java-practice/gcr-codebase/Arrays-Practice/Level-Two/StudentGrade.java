import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int p = sc.nextInt();
            int c = sc.nextInt();
            int m = sc.nextInt();

            double per = (p + c + m) / 3.0;

            char grade;

            if (per >= 80) grade = 'A';
            else if (per >= 70) grade = 'B';
            else if (per >= 60) grade = 'C';
            else if (per >= 50) grade = 'D';
            else if (per >= 40) grade = 'E';
            else grade = 'R';

            System.out.println("Percentage = " + per);
            System.out.println("Grade = " + grade);
        }
    }
}