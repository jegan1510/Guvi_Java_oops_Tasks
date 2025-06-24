package JavaOOps;
public class Account {
    private String name;
    private int accNo;
    private double balance;

    // No-arg constructor
    public Account() {
        this.name = "Default";
        this.accNo = 0;
        this.balance = 0.0;
    }

    // Parameterized constructor
    public Account(String name, int accNo, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Main method to test
    public static void main(String[] args) {
        Account acc = new Account("Jegan", 12345, 1000.0);
        acc.checkBalance();
        acc.deposit(500);
        acc.withdraw(300);
        acc.withdraw(1500);
        acc.checkBalance();
    }
}

