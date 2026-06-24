import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double totalBonus = 0, totalOld = 0, totalNew = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("Years: ");
            int years = sc.nextInt();

            double bonus = (years > 5) ? salary[i] * 0.05 : salary[i] * 0.02;
            double newSalary = salary[i] + bonus;

            totalBonus += bonus;
            totalOld += salary[i];
            totalNew += newSalary;
        }

        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOld);
        System.out.println("Total New Salary = " + totalNew);
    }
}