public class Output {
    public static void printBankInfoToConsole(User user) {
        System.out.println("Name: " + user.getFirstName() + " " + user.getLastName());
        //System.out.println("Account Number: " + user.getAccountNumber());
        for (Account account : user.getAccounts()) {
            if (Integer.parseInt(account.getAccountNumber().substring(0,1)) == 3) {
                System.out.println("Saving Balance: $" + account.getBalance());
            } else {
                System.out.println("Checking Balance: $" + account.getBalance());

            }


        }
    }

}//end of class

