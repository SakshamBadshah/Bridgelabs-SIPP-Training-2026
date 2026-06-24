public class CollinearPoints {

    public static void main(String[] args) {

        int x1 = 2, y1 = 4;
        int x2 = 4, y2 = 6;
        int x3 = 6, y3 = 8;

        double slope1 = (double)(y2 - y1) / (x2 - x1);
        double slope2 = (double)(y3 - y2) / (x3 - x2);

        if (slope1 == slope2)
            System.out.println("Collinear");
        else
            System.out.println("Not Collinear");

        double area = 0.5 * Math.abs(
                x1 * (y2 - y3) +
                x2 * (y3 - y1) +
                x3 * (y1 - y2));

        System.out.println("Area = " + area);
    }
}