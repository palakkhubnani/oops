class BankAccount {
    double balance = 500;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }
}

class SavingsAccount extends BankAccount {
    @Override
    void withdraw(double amount) {
        if (balance - amount >= 100) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal denied: Balance would fall below 100");
        }
    }
}