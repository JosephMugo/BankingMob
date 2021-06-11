import java.util.Random;

public abstract class Account {
    private int balance;
    private String accountNumber;
    private int type;

    public Account(int balance, int pin, int type) {
        this.balance = balance;
        this.type = type;
        Random rand = new Random();
        int rand_int = rand.nextInt(999);
        this.accountNumber = type + "" + String.valueOf(pin) + rand_int;
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
