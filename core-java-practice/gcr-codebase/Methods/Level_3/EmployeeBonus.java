public class EmployeeBonus {

    public static void main(String[] args) {

        double oldTotal = 0;
        double newTotal = 0;
        double bonusTotal = 0;

        System.out.println("Salary\tYears\tBonus\tNew Salary");

        for (int i = 1; i <= 10; i++) {

            int salary = (int)(Math.random() * 90000) + 10000;
            int years = (int)(Math.random() * 10) + 1;

            double bonus;

            if (years > 5)
                bonus = salary * 0.05;
            else
                bonus = salary * 0.02;

            double newSalary = salary + bonus;

            oldTotal += salary;
            newTotal += newSalary;
            bonusTotal += bonus;

            System.out.println(
                    salary + "\t" +
                    years + "\t" +
                    bonus + "\t" +
                    newSalary);
        }

        System.out.println("\nOld Salary Total = " + oldTotal);
        System.out.println("Bonus Total = " + bonusTotal);
        System.out.println("New Salary Total = " + newTotal);
    }
}