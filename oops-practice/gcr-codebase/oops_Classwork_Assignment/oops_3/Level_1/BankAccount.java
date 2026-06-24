public class BankAccount {

    static int totalAccounts = 0;

    String accountHolderName;
    final int accountNumber;

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts = " + totalAccounts);
    }

    void display() {
        System.out.println(accountHolderName + " " + accountNumber);
    }

    public static void main(String[] args) {

        BankAccount b = new BankAccount("Saksham", 101);

        if (b instanceof BankAccount)
            b.display();

        getTotalAccounts();
    }
}