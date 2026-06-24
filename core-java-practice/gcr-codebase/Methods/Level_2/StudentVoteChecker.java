import java.util.Scanner;

public class StudentVoteChecker {

    boolean canStudentVote(int age){
        return age >= 18;
    }

    public static void main(String[] args){

        try (Scanner sc = new Scanner(System.in)) {
            StudentVoteChecker obj = new StudentVoteChecker();

            for(int i=1;i<=10;i++){

                System.out.print("Age : ");
                int age = sc.nextInt();

                System.out.println(obj.canStudentVote(age));
            }
        }
    }
}