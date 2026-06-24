public class Book {

    String title;
    String author;
    double price;

    Book() {
        title = "Java";
        author = "James";
        price = 500;
    }

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Python", "Guido", 700);

        System.out.println(b1.title);
        System.out.println(b2.title);
    }
}