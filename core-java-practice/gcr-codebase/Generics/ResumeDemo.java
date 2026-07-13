import java.util.*;

abstract class JobRole {
    String role;

    JobRole(String role) {
        this.role = role;
    }

    @SuppressWarnings("override")
    public String toString() {
        return role;
    }
}

class SoftwareEngineer extends JobRole {

    SoftwareEngineer() {
        super("Software Engineer");
    }
}

class DataScientist extends JobRole {

    DataScientist() {
        super("Data Scientist");
    }
}

@SuppressWarnings("unused")
class Resume<T extends JobRole> {

    T role;

    Resume(T role) {
        this.role = role;
    }
}

public class ResumeDemo {

    static void screen(List<? extends JobRole> list) {

        for (JobRole r : list)
            System.out.println(r);

    }

    public static void main(String[] args) {

        List<JobRole> jobs = new ArrayList<>();

        jobs.add(new SoftwareEngineer());
        jobs.add(new DataScientist());

        screen(jobs);

    }
}