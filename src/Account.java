import java.util.Random;

public class Account {
    private int balance;
    private String accountNumber;
    private int type = 1;

    public Account(int balance, int pin) {
        this.balance = balance;
        this.accountNumber = String.valueOf(type) + "" + String.valueOf(pin);
    }

    public String getAccountNumber() {
        return accountNumber;
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

    //3(4576)first 4 after the first number are random
}