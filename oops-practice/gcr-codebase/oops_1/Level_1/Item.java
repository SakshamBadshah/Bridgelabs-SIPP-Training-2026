public class Item {

    int itemCode;
    String itemName;
    double price;

    void display() {
        System.out.println(itemCode + " " + itemName + " " + price);
    }

    void totalCost(int qty) {
        System.out.println("Total = " + (price * qty));
    }

    public static void main(String[] args) {

        Item i = new Item();

        i.itemCode = 1;
        i.itemName = "Mouse";
        i.price = 500;

        i.display();
        i.totalCost(3);
    }
}