abstract class Vehicle {
    private String vehicleNumber;
    private String vehicleType;

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public abstract double calculateRentalCost(int days);

    public void displayVehicleInfo() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
    }
}

class Car extends Vehicle {
    private double dailyRate;

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

class Bike extends Vehicle {
    private double dailyRate;

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

class Truck extends Vehicle {
    private double dailyRate;
    private double loadingCharge;

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public double getLoadingCharge() {
        return loadingCharge;
    }

    public void setLoadingCharge(double loadingCharge) {
        this.loadingCharge = loadingCharge;
    }

    @Override
    public double calculateRentalCost(int days) {
        return (days * dailyRate) + loadingCharge;
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {

        Car car = new Car();
        car.setVehicleNumber("CAR101");
        car.setVehicleType("Car");
        car.setDailyRate(2000);

        Bike bike = new Bike();
        bike.setVehicleNumber("BIKE101");
        bike.setVehicleType("Bike");
        bike.setDailyRate(500);

        Truck truck = new Truck();
        truck.setVehicleNumber("TRUCK101");
        truck.setVehicleType("Truck");
        truck.setDailyRate(4000);
        truck.setLoadingCharge(1500);

        System.out.println("Car");
        car.displayVehicleInfo();
        System.out.println("Rental Cost: " + car.calculateRentalCost(5));

        System.out.println();

        System.out.println("Bike");
        bike.displayVehicleInfo();
        System.out.println("Rental Cost: " + bike.calculateRentalCost(5));

        System.out.println();

        System.out.println("Truck");
        truck.displayVehicleInfo();
        System.out.println("Rental Cost: " + truck.calculateRentalCost(5));
    }
}