import java.util.Scanner;

public class QuadraticRoots {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double d = b*b - 4*a*c;

        if(d < 0){
            System.out.println("No Real Roots");
        }
        else{
            double r1 = (-b + Math.sqrt(d))/(2*a);
            double r2 = (-b - Math.sqrt(d))/(2*a);

            System.out.println("Root1 = " + r1);
            System.out.println("Root2 = " + r2);
        }
    }
}