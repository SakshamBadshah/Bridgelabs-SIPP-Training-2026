public class Vehicle {

    static double registrationFee = 5000;

    public static double getRegistrationFee() {
        return registrationFee;
    }

    final String registrationNumber;

    Vehicle(String ownerName,
            String vehicleType,
            String registrationNumber) {

        this.registrationNumber = registrationNumber;
    }


    public static void main(String[] args) {

        Vehicle v =
        new Vehicle("Saksham", "Car", "UP85AB1234");

        if (v instanceof Vehicle)
            System.out.println(v.registrationNumber);
    }
}