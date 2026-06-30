class Notification {

    String recipientName;

    Notification(String r, String m) {
        recipientName = r;
    }

    void sendNotification() { }
}

class EmailNotification extends Notification {

    EmailNotification(String r, String m) {
        super(r, m);
    }

    @Override
    void sendNotification() {
        System.out.println("Email sent to " + recipientName);
    }
}

class SMSNotification extends Notification {

    SMSNotification(String r, String m) {
        super(r, m);
    }

    @Override
    void sendNotification() {
        System.out.println("SMS sent to " + recipientName);
    }
}

class PushNotification extends Notification {

    PushNotification(String r, String m) {
        super(r, m);
    }

    @Override
    void sendNotification() {
        System.out.println("Push Notification sent to " + recipientName);
    }
}

public class NotificationSystem {

    public static void main(String[] args) {

        Notification n[] = {

                new EmailNotification("Rahul","Hi"),
                new SMSNotification("Aman","Hello"),
                new PushNotification("Riya","Welcome")

        };

        for(Notification x:n)
            x.sendNotification();
    }
}