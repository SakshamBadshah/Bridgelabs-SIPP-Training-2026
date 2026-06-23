public class CartItem {

    String itemName;
    double price;
    int quantity;

    void addItem(String name, double p, int q) {
        itemName = name;
        price = p;
        quantity = q;
    }

    void removeItem() {
        quantity = 0;
    }

    void totalCost() {
        System.out.println("Total = " + (price * quantity));
    }

    public static void main(String[] args) {

        CartItem c = new CartItem();

        c.addItem("Keyboard", 1000, 2);

        c.totalCost();
    }
}