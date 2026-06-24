public class Course {

    String courseName;
    int duration;
    double fee;

    static String instituteName="ABC";

    static void updateInstituteName(String name){
        instituteName=name;
    }

    void displayCourseDetails(){
        System.out.println(courseName);
    }

    public static void main(String[] args) {

        updateInstituteName("XYZ");
        System.out.println(instituteName);
    }
}