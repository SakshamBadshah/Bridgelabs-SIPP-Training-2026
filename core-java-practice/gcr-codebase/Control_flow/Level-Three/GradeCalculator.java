public class GradeCalculator {
    public static void main(String[] args) {
        int phy = 80, chem = 75, math = 90;

        double per = (phy + chem + math) / 3.0;

        if (per >= 80) System.out.println("Grade A");
        else if (per >= 70) System.out.println("Grade B");
        else if (per >= 60) System.out.println("Grade C");
        else if (per >= 50) System.out.println("Grade D");
        else if (per >= 40) System.out.println("Grade E");
        else System.out.println("Grade R");

        System.out.println("Percentage = " + per);
    }
}