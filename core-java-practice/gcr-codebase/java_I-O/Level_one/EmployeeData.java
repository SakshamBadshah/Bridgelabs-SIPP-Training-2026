import java.io.*;
import java.util.*;

class Employee implements Serializable {

    int employeeId;
    String name;
    String department;
    double salary;

    Employee(int id,String n,
             String d,double s) {

        employeeId=id;
        name=n;
        department=d;
        salary=s;
    }
}

public class EmployeeData {

    public static void main(String[] args)
            throws Exception {

        try (Scanner sc = new Scanner(System.in)) {
            Employee e =
            new Employee(
                    sc.nextInt(),
                    sc.next(),
                    sc.next(),
                    sc.nextDouble());

            try (ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream("emp.dat"))) {
                out.writeObject(e);
            }
        }

        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("emp.dat"))) {
            Employee emp =
                    (Employee) in.readObject();
            
            System.out.println(emp.employeeId);
            System.out.println(emp.name);
            System.out.println(emp.department);
            System.out.println(emp.salary);
        }
    }
}