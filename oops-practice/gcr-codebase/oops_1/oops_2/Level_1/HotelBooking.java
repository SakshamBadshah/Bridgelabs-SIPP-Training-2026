public class HotelBooking {

    String guestName;
    String roomType;
    int nights;

    HotelBooking() {
        guestName = "Guest";
    }

    HotelBooking(String g, String r, int n) {
        guestName = g;
        roomType = r;
        nights = n;
    }

    HotelBooking(HotelBooking h) {
        guestName = h.guestName;
        roomType = h.roomType;
        nights = h.nights;
    }

    public static void main(String[] args) {

        HotelBooking h1 = new HotelBooking("Rahul","AC",2);
        HotelBooking h2 = new HotelBooking(h1);

        System.out.println(h2.guestName);
    }
}