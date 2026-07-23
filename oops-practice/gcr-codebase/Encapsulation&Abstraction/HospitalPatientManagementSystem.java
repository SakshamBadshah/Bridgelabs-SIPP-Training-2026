abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract double calculateBill();

    public void displayPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class InPatient extends Patient {
    private double roomCharges;
    private double treatmentCharges;

    public void setRoomCharges(double roomCharges) {
        this.roomCharges = roomCharges;
    }

    public void setTreatmentCharges(double treatmentCharges) {
        this.treatmentCharges = treatmentCharges;
    }

    @Override
    public double calculateBill() {
        return roomCharges + treatmentCharges;
    }
}

class OutPatient extends Patient {
    private double consultationFees;
    private double treatmentCharges;

    public void setConsultationFees(double consultationFees) {
        this.consultationFees = consultationFees;
    }

    public void setTreatmentCharges(double treatmentCharges) {
        this.treatmentCharges = treatmentCharges;
    }

    @Override
    public double calculateBill() {
        return consultationFees + treatmentCharges;
    }
}

public class HospitalPatientManagementSystem {
    public static void main(String[] args) {

        InPatient in = new InPatient();
        in.setPatientId(1);
        in.setName("Saksham");
        in.setAge(22);
        in.setRoomCharges(5000);
        in.setTreatmentCharges(12000);

        OutPatient out = new OutPatient();
        out.setPatientId(2);
        out.setName("Rahul");
        out.setAge(25);
        out.setConsultationFees(800);
        out.setTreatmentCharges(2500);

        System.out.println("In Patient");
        in.displayPatientDetails();
        System.out.println("Bill: " + in.calculateBill());

        System.out.println();

        System.out.println("Out Patient");
        out.displayPatientDetails();
        System.out.println("Bill: " + out.calculateBill());
    }
}