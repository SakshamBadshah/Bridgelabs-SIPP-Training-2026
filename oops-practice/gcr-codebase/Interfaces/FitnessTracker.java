interface Trackable {

    void logActivity();

    default void resetData() {
        System.out.println("Data Reset");
    }
}

interface Reportable {
    void generateReport();
}

interface Notifiable {
    void sendAlert();
}

class FitnessDevice
implements Trackable,
           Reportable,
           Notifiable {

    @Override
    public void logActivity() {
        System.out.println("Activity Logged");
    }

    @Override
    public void generateReport() {
        System.out.println("Report Generated");
    }

    @Override
    public void sendAlert() {
        System.out.println("Alert Sent");
    }
}

public class FitnessTracker {

    public static void main(String[] args) {

        FitnessDevice f =
        new FitnessDevice();

        f.logActivity();
        f.generateReport();
        f.sendAlert();
        f.resetData();
    }
}