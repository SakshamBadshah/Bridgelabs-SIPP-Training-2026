public class Vehicle {

    String ownerName;
    String vehicleType;

    static double registrationFee=5000;

    static void updateRegistrationFee(double fee){
        registrationFee=fee;
    }

    public static void main(String[] args) {

        updateRegistrationFee(7000);

        System.out.println(registrationFee);
    }
}