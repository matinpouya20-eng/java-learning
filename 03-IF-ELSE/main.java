import java.util.Scanner;

class JA {

    private String ownerName;
    private String accountNumber;
    private double balance;

    public BankAccount(String ownerName, String accountNumber, double balance) {

        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {

        if (amount <= 0) {

            throw new IllegalArgumentException(
                    "Deposit amount must be greater than zero."
            );

        }

        balance += amount;

        System.out.println(
                "Deposit successful."
        );

        System.out.println(
                "New balance: " + balance
        );
    }

    public void withdraw(double amount) {

        if (amount <= 0) {

            throw new IllegalArgumentException(
                    "Withdraw amount must be greater than zero."
            );
        }

        if (amount > balance) {

            throw new IllegalArgumentException(
                    "Insufficient balance."
            );
        }

        balance -= amount;

        System.out.println(
                "Withdraw successful."
        );

        System.out.println(
                "New balance: " + balance
        );
    }

    public void transfer(BankAccount target, double amount) {

        if (target == null) {

            throw new IllegalArgumentException(
                    "Target account does not exist."
            );
        }

        if (amount <= 0) {

            throw new IllegalArgumentException(
                    "Transfer amount must be greater than zero."
            );
        }

        if (amount > balance) {

            throw new IllegalArgumentException(
                    "Insufficient balance."
            );
        }

        balance -= amount;

        target.balance += amount;

        System.out.println(
                "Transfer successful."
        );

        System.out.println(
                "Transferred amount: " + amount
        );

        System.out.println(
                "New balance: " + balance
        );
    }

    public void showAccountInfo() {

        System.out.println();
        System.out.println("========== ACCOUNT INFO ==========");

        System.out.println(
                "Owner: " + ownerName
        );

        System.out.println(
                "Account Number: " + accountNumber
        );

        System.out.println(
                "Balance: " + balance
        );

        System.out.println(
                "=================================="
        );

    }
}


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BankAccount account1 =
                new BankAccount(
                        "Pouya",
                        "1001",
                        5000
                );

        BankAccount account2 =
                new BankAccount(
                        "Ali",
                        "1002",
                        3000
                );

        boolean running = true;

        while (running) {

            System.out.println();
            System.out.println("========== BANK SYSTEM ==========");

            System.out.println("1. Show Account Information");

            System.out.println("2. Deposit Money");

            System.out.println("3. Withdraw Money");

            System.out.println("4. Transfer Money");

            System.out.println("5. Show Balance");

            System.out.println("6. Exit");

            System.out.println(
                    "================================="
            );

            System.out.print(
                    "Choose an option: "
            );

            try {

                int choice = scanner.nextInt();

                switch (choice) {

                    case 1:

                        account1.showAccountInfo();

                        break;


                    case 2:

                        System.out.print(
                                "Enter deposit amount: "
                        );

                        double depositAmount =
                                scanner.nextDouble();

                        account1.deposit(
                                depositAmount
                        );

                        break;


                    case 3:

                        System.out.print(
                                "Enter withdraw amount: "
                        );

                        double withdrawAmount =
                                scanner.nextDouble();

                        account1.withdraw(
                                withdrawAmount
                        );

                        break;


                    case 4:

                        System.out.print(
                                "Enter transfer amount: "
                        );

                        double transferAmount =
                                scanner.nextDouble();

                        account1.transfer(
                                account2,
                                transferAmount
                        );

                        break;


                    case 5:

                        System.out.println(
                                "Current balance: "
                                        + account1.getBalance()
                        );

                        break;


                    case 6:

                        running = false;

                        System.out.println(
                                "Thank you for using the bank system."
                        );

                        break;


                    default:

                        System.out.println(
                                "Invalid option."
                        );

                }

            } catch (Exception e) {

                System.out.println();
                System.out.println(
                        "ERROR: " + e.getMessage()
                );

                scanner.nextLine();

            }

        }

        scanner.close();

    }
}