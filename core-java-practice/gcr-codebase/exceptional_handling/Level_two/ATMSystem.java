class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

public class ATMSystem {

    static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {

        if (amount > balance)
            throw new InsufficientBalanceException(
                    "Balance: ₹" + balance +
                    ", Requested: ₹" + amount);

        System.out.println("Withdrawal Successful");
    }

    public static void main(String[] args) {

        try {
            withdraw(5000, 8000);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}