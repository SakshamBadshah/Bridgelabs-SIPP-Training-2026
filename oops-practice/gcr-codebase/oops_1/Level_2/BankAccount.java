public class BankAccount {

    String holder;
    int accNo;
    double balance = 5000;

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) {
        if (amt <= balance)
            balance -= amt;
    }

    void showBalance() {
        System.out.println(balance);
    }

    public static void main(String[] args) {

        BankAccount b = new BankAccount();

        b.deposit(1000);
        b.withdraw(500);

        b.showBalance();
    }
}