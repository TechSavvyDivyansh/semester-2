import java.util.Scanner;

class BankAccount {
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    public synchronized void deposit(int amount) {
        System.out.println("Depositing $" + amount);
        balance += amount;
        System.out.println("Money successfully deposited!");
        System.out.println("Current balance: $" + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println("Withdrawing $" + amount);
            balance -= amount;
            System.out.println("Money successfully withdrawn!");
            System.out.println("Current balance: $" + balance);
        } else {
            System.out.println("Insufficient balance for withdrawal!");
            System.out.println("Current balance: $" + balance);
        }
    }
}

class Customer extends Thread {
    private BankAccount account;
    private String transactionType;
    private int amount;

    public Customer(BankAccount account, String transactionType, int amount) {
        this.account = account;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public void run() {
        if (transactionType.equals("deposit")) {
            account.deposit(amount);
        } else if (transactionType.equals("withdraw")) {
            account.withdraw(amount);
        }
    }
}

public class Accounts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount to deposit: ");
        int depositAmount = scanner.nextInt();

        System.out.print("Enter the amount to withdraw: ");
        int withdrawAmount = scanner.nextInt();

        BankAccount account = new BankAccount();
        Customer customer1 = new Customer(account, "deposit", depositAmount);
        Customer customer2 = new Customer(account, "withdraw", withdrawAmount);

        customer1.start();
        customer2.start();

        scanner.close();
    }
}

