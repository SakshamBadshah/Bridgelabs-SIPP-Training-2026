interface StreamingService {

    void streamMovie();

    default void showSubscriptionDetails() {
        System.out.println(
        "Streaming Subscription");
    }
}

interface GamingService {

    void playGame();

    default void showSubscriptionDetails() {
        System.out.println(
        "Gaming Subscription");
    }
}

class SmartTV
implements StreamingService,
           GamingService {

    @Override
    public void streamMovie() {
        System.out.println(
        "Streaming Movie");
    }

    @Override
    public void playGame() {
        System.out.println(
        "Playing Game");
    }

    @Override
    public void showSubscriptionDetails() {

        System.out.println(
        "Smart TV Subscription");
    }
}

public class SmartTVDemo {

    public static void main(String[] args) {

        String movies[] = {
                "Avengers",
                "Batman"
        };

        String games[] = {
                "FIFA",
                "PUBG"
        };

        SmartTV tv =
        new SmartTV();

        tv.showSubscriptionDetails();

        System.out.println("Movies:");
        for(String m : movies)
            System.out.println(m);

        System.out.println("Games:");
        for(String g : games)
            System.out.println(g);
    }
}