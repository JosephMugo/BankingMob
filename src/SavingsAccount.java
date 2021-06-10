public class SavingsAccount extends Account {
    private String accountNumber;
    private int type = 3;

    public SavingsAccount(int balance, int pin) {
        super(balance, pin);

    this.accountNumber = type + "" + String.valueOf(pin);
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
