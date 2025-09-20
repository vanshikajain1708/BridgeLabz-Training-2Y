class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        }
    }

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            System.out.print("Enter Account Holder Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Account Number: ");
            String accNumber = sc.nextLine();

            System.out.print("Enter Initial Balance: ₹");
            double balance = sc.nextDouble();

            BankAccount account = new BankAccount(name, accNumber, balance);

            int choice;
            do {
                System.out.println("\n--- ATM Menu ---");
                System.out.println("1. Deposit Money");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter amount to deposit: ₹");
                        account.deposit(sc.nextDouble());
                    }
                    case 2 -> {
                        System.out.print("Enter amount to withdraw: ₹");
                        account.withdraw(sc.nextDouble());
                    }
                    case 3 -> account.displayBalance(); // Now clearly uses accountHolder and accountNumber
                    case 4 -> System.out.println("Thank you for using the ATM!");
                    default -> System.out.println("Invalid option. Try again.");
                }
            } while (choice != 4);
        }
    }
}

