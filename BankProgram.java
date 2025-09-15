import java.util.ArrayList;

public class BankProgram {

    // Account class
    static class Account {
        private String name;
        private String accountNumber;
        private double balance;

        // Constructor
        public Account(String name, String accountNumber, double balance) {
            this.name = name;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        // Deposit method
        public void deposit(double amount) {
            balance += amount;
        }

        // Withdraw method
        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Insufficient funds in account: " + accountNumber);
            }
        }

        // Display method
        public void display() {
            System.out.println("Name: " + name + ", Account Number: " + accountNumber + ", Balance: " + balance);
        }

        public String getAccountNumber() {
            return accountNumber;
        }
    }

    // Main class logic
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();

        // Create and add accounts
        Account acc1 = new Account("Peter Irmgard", "C0011", 5000.0);
        Account acc2 = new Account("Katja Ruedi", "C0121", 4500.0);
        Account acc3 = new Account("Marcella Gebhard", "C0222", 20000.0);

        accounts.add(acc1);
        accounts.add(acc2);
        accounts.add(acc3);

        // Display all accounts
        System.out.println("List of accounts:");
        for (Account acc : accounts) {
            acc.display();
        }

        // Deposit into account1
        System.out.println("\nAfter depositing 1000 into account1:");
        acc1.deposit(1000);
        acc1.display();

        // No transaction in account2
        System.out.println("No transaction in account2:");
        acc2.display();

        // Withdraw from account3
        System.out.println("After withdrawing 5000 from account3:");
        acc3.withdraw(5000);
        acc3.display();
    }
}
