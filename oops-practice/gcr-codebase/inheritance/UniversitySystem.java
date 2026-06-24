class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name: " + name;
    }
}

class Student extends Person {
    final int studentId;
    double gpa;

    Student(String name, int studentId, double gpa) {
        super(name);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String toString() {
        return super.toString() +
                ", ID: " + studentId +
                ", GPA: " + gpa;
    }
}

class GradStudent extends Student {
    String thesis;

    GradStudent(String name,int id,
                double gpa,String thesis) {

        super(name,id,gpa);
        this.thesis = thesis;
    }

    public String toString() {
        return super.toString() +
                ", Thesis: " + thesis;
    }
}

public class UniversitySystem {

    public static void main(String[] args) {

        GradStudent g =
        new GradStudent(
        "Rahul",101,8.5,"AI Research");

        System.out.println(g);

        System.out.println(
        g instanceof Student);

        System.out.println(
        g instanceof Person);
    }
}