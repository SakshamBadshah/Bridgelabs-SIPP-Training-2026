public class CarRental {

    String customerName;
    String carModel;
    int rentalDays;

    CarRental(String n,String c,int d){
        customerName=n;
        carModel=c;
        rentalDays=d;
    }

    void totalCost(){
        System.out.println(rentalDays * 1000);
    }

    public static void main(String[] args) {

        CarRental c =
        new CarRental("Saksham","Swift",5);

        c.totalCost();
    }
}