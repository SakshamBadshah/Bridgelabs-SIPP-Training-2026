public class Employee {

    static int totalEmployees = 0;

    String name;

    Employee(String name, int id, String designation) {
        this.name = name;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println(totalEmployees);
    }

    public static void main(String[] args) {

        Employee e = new Employee("Saksham", 1, "Developer");

        if (e instanceof Employee)
            System.out.println(e.name);

        displayTotalEmployees();
    }
}