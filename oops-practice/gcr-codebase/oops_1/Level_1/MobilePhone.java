public class MobilePhone {

    String brand;
    String model;
    double price;

    void display() {
        System.out.println(brand);
        System.out.println(model);
        System.out.println(price);
    }

    public static void main(String[] args) {

        MobilePhone m = new MobilePhone();

        m.brand = "Samsung";
        m.model = "M35";
        m.price = 18000;

        m.display();
    }
}