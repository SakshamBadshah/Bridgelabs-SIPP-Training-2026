import java.util.*;

abstract class WarehouseItem {
    String name;
    WarehouseItem(String name) {
        this.name = name;
    }
    @SuppressWarnings("override")
    public String toString() {
        return name;
    }
}

class Electronics extends WarehouseItem {
    Electronics(String name) {
        super(name);
    }
}

@SuppressWarnings("unused")
class Grocery  extends WarehouseItem {
    Grocery(String name) {
        super(name);
    }
}

@SuppressWarnings("unused")
class Furniture extends WarehouseItem {
    Furniture(String name) {
        super(name);
    }
}

class Storage<T extends WarehouseItem> {
    List<T> items = new ArrayList<>();

    void add(T item) {
        items.add(item);
    }

    List<T> getItems() {
        return items;
    }
}

public class WarehouseDemo {

    static void display(List<? extends WarehouseItem> list) {
        for (WarehouseItem i : list)
            System.out.println(i);
    }

    public static void main(String[] args) {

        Storage<Electronics> s = new Storage<>();

        s.add(new Electronics("Laptop"));
        s.add(new Electronics("Mobile"));

        display(s.getItems());

    }
}