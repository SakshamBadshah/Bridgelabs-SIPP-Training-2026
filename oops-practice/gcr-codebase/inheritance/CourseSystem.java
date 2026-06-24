class Course {

    String courseName;
    int duration;

    Course(String courseName,
           int duration) {

        this.courseName = courseName;
        this.duration = duration;
    }
}

class OnlineCourse extends Course {

    String platform;
    boolean isRecorded;

    OnlineCourse(String name,
                 int duration,
                 String platform,
                 boolean recorded) {

        super(name, duration);

        this.platform = platform;
        this.isRecorded = recorded;
    }
}

class PaidOnlineCourse
extends OnlineCourse {

    double fee;
    double discount;

    PaidOnlineCourse(
            String name,
            int duration,
            String platform,
            boolean recorded,
            double fee,
            double discount) {

        super(name, duration,
              platform, recorded);

        this.fee = fee;
        this.discount = discount;
    }

    void display() {

        System.out.println(
        "Course: " + courseName);

        System.out.println(
        "Platform: " + platform);

        System.out.println(
        "Fee: " + fee);

        System.out.println(
        "Discount: " + discount);
    }
}

public class CourseSystem {

    public static void main(String[] args) {

        PaidOnlineCourse p =
        new PaidOnlineCourse(
        "Java",
        60,
        "Udemy",
        true,
        5000,
        10);

        p.display();
    }
}