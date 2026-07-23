abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public abstract int getLoanDuration();

    public void displayItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Book extends LibraryItem {
    @Override
    public int getLoanDuration() {
        return 14;
    }
}

class Magazine extends LibraryItem {
    @Override
    public int getLoanDuration() {
        return 7;
    }
}

class DVD extends LibraryItem {
    @Override
    public int getLoanDuration() {
        return 3;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {

        Book book = new Book();
        book.setItemId(101);
        book.setTitle("Java Programming");
        book.setAuthor("James Gosling");

        Magazine magazine = new Magazine();
        magazine.setItemId(102);
        magazine.setTitle("Tech Today");
        magazine.setAuthor("ABC Publications");

        DVD dvd = new DVD();
        dvd.setItemId(103);
        dvd.setTitle("Avengers");
        dvd.setAuthor("Marvel Studios");

        System.out.println("Book Details");
        book.displayItemDetails();
        System.out.println("Loan Duration: " + book.getLoanDuration() + " Days\n");

        System.out.println("Magazine Details");
        magazine.displayItemDetails();
        System.out.println("Loan Duration: " + magazine.getLoanDuration() + " Days\n");

        System.out.println("DVD Details");
        dvd.displayItemDetails();
        System.out.println("Loan Duration: " + dvd.getLoanDuration() + " Days");
    }
}