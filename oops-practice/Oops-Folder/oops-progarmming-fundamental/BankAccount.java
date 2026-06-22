public class BankAccount {
    private String accountNumber;
    private String holder;
    private double balance;
    private static int totalAccounts = 0;
    
    public BankAccount(String accountNumber, String holder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = initialBalance;
        totalAccounts++;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + " | New Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + " | New Balance: $" + balance);
            return true;
        } else if (amount > balance) {
            System.out.println("Insufficient funds - Overdraft not allowed! Available: $" + balance);
            return false;
        } else {
            System.out.println("Invalid withdrawal amount");
            return false;
        }
    }
    
    public void getStatement() {
        System.out.println("\n=== Account Statement ===");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder: " + holder);
        System.out.println("Balance: $" + balance);
        System.out.println("========================\n");
    }
    
    public static int getTotalAccounts() {
        return totalAccounts;
    }
    
    public static void main(String[] args) {
        System.out.println("--- Bank Account Management System ---\n");
        
        // Create 3 accounts
        BankAccount account1 = new BankAccount("ACC001", "John Doe", 1000);
        BankAccount account2 = new BankAccount("ACC002", "Jane Smith", 500);
        BankAccount account3 = new BankAccount("ACC003", "Bob Wilson", 750);
        
        System.out.println("Total Accounts Created: " + getTotalAccounts() + "\n");
        
        // Simulate 5 transactions for account1
        System.out.println("--- Account 1 Transactions ---");
        account1.deposit(500);
        account1.withdraw(200);
        account1.deposit(300);
        account1.withdraw(1500); // Overdraft attempt
        account1.withdraw(100);
        account1.getStatement();
        
        // Simulate 5 transactions for account2
        System.out.println("--- Account 2 Transactions ---");
        account2.deposit(200);
        account2.withdraw(100);
        account2.deposit(150);
        account2.withdraw(600); // Overdraft attempt
        account2.withdraw(50);
        account2.getStatement();
        
        // Simulate 5 transactions for account3
        System.out.println("--- Account 3 Transactions ---");
        account3.deposit(250);
        account3.withdraw(300);
        account3.deposit(100);
        account3.withdraw(400);
        account3.deposit(500);
        account3.getStatement();
        
        System.out.println("Final Total Accounts: " + getTotalAccounts());
    }
}
