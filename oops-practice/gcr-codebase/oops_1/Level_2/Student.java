public class Student {

    String name;
    int roll;
    int marks;

    String grade() {
        if (marks >= 80) return "A";
        else if (marks >= 60) return "B";
        else return "C";
    }

    void display() {
        System.out.println(name + " " + roll);
        System.out.println("Grade = " + grade());
    }

    public static void main(String[] args) {

        Student s = new Student();

        s.name = "Saksham";
        s.roll = 10;
        s.marks = 85;

        s.display();
    }
}