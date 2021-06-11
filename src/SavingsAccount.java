public class SavingsAccount extends Account {
    private String accountNumber;
    private final int TYPE = 3;

    public SavingsAccount(int balance, int pin) {
        super(balance, pin, 3);
    }

    public int getType() {
        return TYPE;
    }
}
