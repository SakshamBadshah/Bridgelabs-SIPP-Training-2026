public class MovieTicket {

    String movieName;
    String seatNo;
    double price;

    void book(String movie, String seat, double p) {
        movieName = movie;
        seatNo = seat;
        price = p;
    }

    void display() {
        System.out.println(movieName);
        System.out.println(seatNo);
        System.out.println(price);
    }

    public static void main(String[] args) {

        MovieTicket m = new MovieTicket();

        m.book("Avengers", "A12", 250);

        m.display();
    }
}