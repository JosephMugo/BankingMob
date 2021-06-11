import java.util.ArrayList;
import java.util.Random;

public class User {

    private String firstName;
    private String lastName;
    private int pin;
    private String userId;
    private ArrayList<Account> accounts = new ArrayList<>();

    public User(String firstName, String lastName, int pin) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
        Random rand = new Random();
        int rand_int = rand.nextInt(999);
        this.userId = pin + "" + rand_int;
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

    public int getPin() {
        return pin;
    }

    public String getUserId() {
        return userId;
    }
}
