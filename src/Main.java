public class Main {
    public static void main(String[] args) {
        User testUser = new User("first", "Test", "Users", 1234);

        Account testUserAccount = new SavingsAccount(10000);

        testUser.addNewAccount(testUserAccount);
        for (Account account : testUser.getAccounts()) {
            System.out.println(account.getBalance());
        }

    }
}
