public class Student {

    static int totalStudents = 0;

    String name;

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println(totalStudents);
    }

    public static void main(String[] args) {

        Student s =
        new Student("Saksham", 10, "A");

        if (s instanceof Student)
            System.out.println(s.name);

        displayTotalStudents();
    }
}