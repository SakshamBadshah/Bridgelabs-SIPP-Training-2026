interface Refuelable {

    void refuel();
}

class Vehicle {

    int maxSpeed;
    String model;

    Vehicle(int speed,
            String model) {

        maxSpeed = speed;
        this.model = model;
    }
}

class ElectricVehicle
extends Vehicle {

    ElectricVehicle(
    int speed,String model) {

        super(speed,model);
    }

    void charge() {

        System.out.println(
        "Charging Vehicle");
    }
}

class PetrolVehicle
extends Vehicle
implements Refuelable {

    PetrolVehicle(
    int speed,String model) {

        super(speed,model);
    }

    public void refuel() {

        System.out.println(
        "Refueling Vehicle");
    }
}

public class VehicleManagement {

    public static void main(String[] args) {

        ElectricVehicle e =
        new ElectricVehicle(
        180,"Tesla");

        PetrolVehicle p =
        new PetrolVehicle(
        200,"Honda");

        e.charge();
        p.refuel();
    }
}