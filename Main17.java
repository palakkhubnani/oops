package javacodes;
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
        if ((balance - amount) < 100) {
            System.out.println("Cannot withdraw: Balance would fall below $100");
        } else {
            super.withdraw(amount);
            System.out.println("Withdrawal successful");
        }
    }
}

public class Main17 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.withdraw(450);  // Should block
        sa.withdraw(300);  // Should succeed
    }
}

