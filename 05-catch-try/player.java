class main extends Exception {

    public main(String message) {

        super(message);

    }
}


class BankAccount {

    private String owner;

    private double balance;


    public BankAccount(
            String owner,
            double balance
    ) {

        this.owner = owner;

        this.balance = balance;

    }


    public void deposit(double amount) {

        if (amount <= 0) {

            throw new IllegalArgumentException(
                    "Amount must be greater than zero."
            );

        }

        balance += amount;

        System.out.println(
                "Deposit successful."
        );

        System.out.println(
                "Balance: " + balance
        );

    }


    public void withdraw(double amount)
            throws main {

        if (amount <= 0) {

            throw new IllegalArgumentException(
                    "Amount must be greater than zero."
            );

        }

        if (amount > balance) {

            throw new main(
                    "Insufficient balance!"
            );

        }

        balance -= amount;

        System.out.println(
                "Withdraw successful."
        );

        System.out.println(
                "Balance: " + balance
        );

    }


    public void showBalance() {

        System.out.println(
                "Owner: " + owner
        );

        System.out.println(
                "Balance: " + balance
        );

    }

}


public class Main {

    public static void main(String[] args) {

        BankAccount account =
                new BankAccount(
                        "Pouya",
                        5000
                );


        account.showBalance();


        System.out.println(
                "----------------"
        );


        try {

            account.deposit(2000);

            account.withdraw(3000);

            account.withdraw(10000);

        } catch (
                main e
        ) {

            System.out.println(
                    "Bank Error: "
                            + e.getMessage()
            );

        } catch (
                IllegalArgumentException e
        ) {

            System.out.println(
                    "Input Error: "
                            + e.getMessage()
            );

        }


        System.out.println(
                "----------------"
        );


        account.showBalance();

    }
}