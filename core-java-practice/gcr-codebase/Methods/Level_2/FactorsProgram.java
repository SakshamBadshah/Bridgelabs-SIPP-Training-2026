import java.util.Scanner;

public class FactorsProgram {

    static int[] getFactors(int n) {
        int count = 0;

        for(int i=1;i<=n;i++)
            if(n%i==0) count++;

        int[] factors = new int[count];
        int index = 0;

        for(int i=1;i<=n;i++)
            if(n%i==0)
                factors[index++] = i;

        return factors;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            int[] factors = getFactors(n);

            int sum = 0;
            long product = 1;
            int squareSum = 0;

            for(int f : factors){
                System.out.print(f + " ");
                sum += f;
                product *= f;
                squareSum += Math.pow(f,2);
            }

            System.out.println("\nSum = " + sum);
            System.out.println("Product = " + product);
            System.out.println("Sum of Squares = " + squareSum);
        }
    }
}