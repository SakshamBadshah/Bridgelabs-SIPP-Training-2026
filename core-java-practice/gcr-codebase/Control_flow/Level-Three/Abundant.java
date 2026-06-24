public class Abundant {
    public static void main(String[] args) {
        int n = 12, sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }

        System.out.println(sum > n ? "Abundant" : "Not Abundant");
    }
}