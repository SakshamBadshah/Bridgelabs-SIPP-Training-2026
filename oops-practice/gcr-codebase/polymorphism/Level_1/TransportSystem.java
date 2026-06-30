class Vehicle {
    void fuelCost(int km) {
        System.out.println("Fuel Cost");
    }
}

class Car extends Vehicle {
    @Override
    void fuelCost(int km) {
        System.out.println("Car Cost = " + (km * 8));
    }
}

class Bus extends Vehicle {
    @Override
    void fuelCost(int km) {
        System.out.println("Bus Cost = " + (km * 15));
    }
}

class Bike extends Vehicle {
    @Override
    void fuelCost(int km) {
        System.out.println("Bike Cost = " + (km * 3));
    }
}

class ElectricCar extends Vehicle {
    @Override
    void fuelCost(int km) {
        System.out.println("Electric Cost = " + (km * 2));
    }
}

public class TransportSystem {

    public static void main(String[] args) {

        Vehicle v[] = {
                new Car(),
                new Bus(),
                new Bike(),
                new ElectricCar()
        };

        for (Vehicle x : v) {

            x.fuelCost(10);

            if (x instanceof Car)
                System.out.println("Car");

            else if (x instanceof Bus)
                System.out.println("Bus");

            else if (x instanceof Bike)
                System.out.println("Bike");

            else if (x instanceof ElectricCar)
                System.out.println("Electric Car");
        }
    }
}