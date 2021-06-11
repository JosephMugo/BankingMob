public class CheckingsAccount extends Account {
  private String accountNumber;
  private final int TYPE = 7;
    public CheckingsAccount(int balance , int pin) {
        super(balance , pin, 7);
    }

    public int getType() {
        return TYPE;
    }
}
