import java.util.Scanner;

public class Trigonometry {

    static double[] calculate(double angle) {

        double rad = Math.toRadians(angle);

        return new double[]{
                Math.sin(rad),
                Math.cos(rad),
                Math.tan(rad)
        };
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            double angle = sc.nextDouble();

            double[] result = calculate(angle);

            System.out.println("Sin = " + result[0]);
            System.out.println("Cos = " + result[1]);
            System.out.println("Tan = " + result[2]);
        }
    }
}