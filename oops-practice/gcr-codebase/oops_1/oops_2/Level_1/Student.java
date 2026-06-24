class Student {

    public int rollNumber=1;
    protected String name="Saksham";
    private double cgpa=8.5;

    public double getCgpa(){
        return cgpa;
    }

    public void setCgpa(double cgpa){
        this.cgpa=cgpa;
    }
}

class PostgraduateStudent extends Student{

    public static void main(String[] args) {

        PostgraduateStudent p=
        new PostgraduateStudent();

        System.out.println(p.rollNumber);
        System.out.println(p.name);
    }
}