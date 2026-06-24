public class Product {


    String productName;


    Product(int productID, String productName,
            double price, int quantity) {

        this.productName = productName;
    }


    public static void main(String[] args) {

        Product p =
        new Product(1, "Mouse", 500, 2);

        if (p instanceof Product)
            System.out.println(p.productName);
    }
}