class InsufficientFundsException extends Exception {
    InsufficientFundsException(String msg) {
        super(msg);
    }
}

public class HospitalBilling {

    public static void main(String[] args) {

        try {
            int bill = 1000;
            int items = 0;
            System.out.println(bill / items);

        } catch (ArithmeticException e) {
            System.out.println("Error: Number of items cannot be zero.");
        }

        try {
            int patients[] = {101, 102, 103};
            System.out.println(patients[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");
        }

        try {
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number entered.");
        }

        try {
            int payment = 500;
            int billAmount = 1000;

            if (payment < billAmount)
                throw new InsufficientFundsException("Payment failed!");

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}