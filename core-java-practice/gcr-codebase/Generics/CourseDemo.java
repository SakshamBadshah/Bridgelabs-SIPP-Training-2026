import java.util.*;

abstract class CourseType {
    String name;

    CourseType(String name) {
        this.name = name;
    }

    @SuppressWarnings("override")
    public String toString() {
        return name;
    }
}

class ExamCourse extends CourseType {
    ExamCourse(String name) {
        super(name);
    }
}

@SuppressWarnings("unused")
class AssignmentCourse extends CourseType {
    AssignmentCourse(String name) {
        super(name);
    }
}

class Course<T extends CourseType> {

    List<T> list = new ArrayList<>();

    void add(T c) {
        list.add(c);
    }

    List<T> getList() {
        return list;
    }
}

public class CourseDemo {

    static void show(List<? extends CourseType> list) {

        for (CourseType c : list)
            System.out.println(c);

    }

    public static void main(String[] args) {

        Course<ExamCourse> c = new Course<>();

        c.add(new ExamCourse("Java"));

        show(c.getList());

    }
}