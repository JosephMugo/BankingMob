import java.util.ArrayList;

public class User {

    private String firstName;
    private String lastName;
    private String accountNumber;
    private int pin;
    private ArrayList<Account> accounts = new ArrayList<>();

    public User(String accountNumber, String firstName, String lastName, int pin) {
        this.accountNumber = accountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void addNewAccount(Account newAcc) {
        this.accounts.add(newAcc);
    }

    public ArrayList<Account> getAccounts() {
        return this.accounts;
    }
}
