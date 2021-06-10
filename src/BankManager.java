import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankManager {
    //private List<User> userList = new ArrayList<>();
    Map<String, User> userMap = new HashMap<>();


    public BankManager() {
        //Add new user, remove existing user, update existing users, get users
    }

    public void addNewUser(String accountNumber, User user) {
        userMap.put(accountNumber, user);
    }

    public void removeUser(String accountNumber) {
        userMap.remove(accountNumber);
    }

    public void updateUserFirstName(String accountNumber, String newFirstName) {
        userMap.get(accountNumber).setFirstName(newFirstName);
        //update name and balance
    }

    public void updateUserLastName(String accountNumber, String newLastName) {
        userMap.get(accountNumber).setLastName(newLastName);
        //update name and balance
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }
}
