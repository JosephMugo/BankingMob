public class Main {
    public static void main(String[] args) {
        User testUser = new User("first", "Test", 1234);

        Account testUserAccount = new CheckingsAccount(10000 , "39983943");

        testUser.addNewAccount(testUserAccount);
        for (Account account : testUser.getAccounts()) {
            System.out.println(account.getBalance());
        }
        Output.printBankInfoToConsole(testUser);
    }

}
