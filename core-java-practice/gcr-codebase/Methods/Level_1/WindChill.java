import java.util.Scanner;

public class WindChill {

    static double calculate(double t, double v) {

        return 35.74 + 0.6215 * t
                - 35.75 * Math.pow(v, 0.16)
                + 0.4275 * t * Math.pow(v, 0.16);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double temp = sc.nextDouble();
        double speed = sc.nextDouble();

        System.out.println("Wind Chill = " + calculate(temp, speed));
    }
}