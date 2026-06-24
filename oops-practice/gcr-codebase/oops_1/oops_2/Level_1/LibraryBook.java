public class LibraryBook {

    String title;
    String author;
    double price;
    boolean available = true;

    void borrowBook() {
        available = false;
    }

    public static void main(String[] args) {

        LibraryBook b = new LibraryBook();

        b.borrowBook();

        System.out.println(b.available);
    }
}