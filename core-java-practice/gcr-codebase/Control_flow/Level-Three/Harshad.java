public class Harshad {
    public static void main(String[] args) {
        int n = 21, temp = n, sum = 0;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println(n % sum == 0 ? "Harshad" : "Not Harshad");
    }
}