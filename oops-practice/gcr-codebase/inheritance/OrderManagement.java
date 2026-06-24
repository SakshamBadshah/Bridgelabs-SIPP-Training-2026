class Order {

    int orderId;
    String orderDate;

    Order(int id,String date) {

        orderId = id;
        orderDate = date;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {

    String trackingNumber;

    ShippedOrder(int id,String date,
                 String track) {

        super(id,date);
        trackingNumber = track;
    }

    String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder
extends ShippedOrder {

    String deliveryDate;

    DeliveredOrder(int id,
                   String date,
                   String track,
                   String delivery) {

        super(id,date,track);

        deliveryDate = delivery;
    }

    String getOrderStatus() {
        return "Order Delivered";
    }
}

public class OrderManagement {

    public static void main(String[] args) {

        DeliveredOrder d =
        new DeliveredOrder(
        101,
        "01-01-2026",
        "TR123",
        "05-01-2026");

        System.out.println(
        d.getOrderStatus());
    }
}