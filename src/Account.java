import java.util.Random;

public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amountDepositing) {
        this.balance += amountDepositing;
    }

    public void withdrawal(int amountWithdrawing) {
        this.balance -= amountWithdrawing;
    }

}
