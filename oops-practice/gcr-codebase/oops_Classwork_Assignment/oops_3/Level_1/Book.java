public class Book {

    static String libraryName = "Central Library";

    String title;

    Book(String title, String author, String isbn) {
        this.title = title;
    }

    static void displayLibraryName() {
        System.out.println(libraryName);
    }

    public static void main(String[] args) {

        Book b = new Book("Java", "James", "123");

        if (b instanceof Book)
            System.out.println(b.title);

        displayLibraryName();
    }
}