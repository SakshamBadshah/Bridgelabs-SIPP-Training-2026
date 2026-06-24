import java.util.Scanner;

public class BMIProgram {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double[][] person = new double[10][3];

        for(int i=0;i<10;i++){

            System.out.print("Weight : ");
            person[i][0] = sc.nextDouble();

            System.out.print("Height(cm): ");
            person[i][1] = sc.nextDouble();

            double h = person[i][1]/100;
            person[i][2] = person[i][0]/(h*h);
        }

        System.out.println("Weight Height BMI");

        for(int i=0;i<10;i++)
            System.out.printf("%.1f %.1f %.2f\n",
                    person[i][0],person[i][1],person[i][2]);
    }
}