public class Patient {

    static int totalPatients = 0;

    String name;


    Patient(int patientID,
            String name,
            int age,
            String ailment) {

        this.name = name;

        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println(totalPatients);
    }

    public static void main(String[] args) {

        Patient p =
        new Patient(1, "Rahul", 25, "Fever");

        if (p instanceof Patient)
            System.out.println(p.name);

        getTotalPatients();
    }
}