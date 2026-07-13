class Category {}

class BookCategory extends Category {}

@SuppressWarnings("unused")
class ClothingCategory extends Category {}

class Product<T extends Category> {

    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class MarketplaceDemo {

    static <T extends Product<?>> void applyDiscount(T p, double per) {

        p.price = p.price - (p.price * per / 100);

        System.out.println(p.name + " Price = " + p.price);

    }

    public static void main(String[] args) {

        Product<BookCategory> b =
                new Product<>("Java Book", 500);

        applyDiscount(b, 10);

    }
}