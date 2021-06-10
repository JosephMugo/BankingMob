import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public Main() throws FileNotFoundException {
    }

    public static void main(String[] args) {
        BankManager bankMan = new BankManager();

        User testUser = new User("Arielle", "Duncan", 1234);

        Account testUserAccount = new CheckingsAccount(10000, 854541);
        //#3's Stand for savings accounts, while any other number is a checkings

        testUser.addNewAccount(testUserAccount);
        bankMan.addNewUser("32548894", testUser);

        Iterator userIterator = bankMan.getUserMap().entrySet().iterator();

        while (userIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry) userIterator.next();
            User current = (User) mapElement.getValue();
            ArrayList<Account> currentAccount = current.getAccounts();
            System.out.println(current.getFirstName() + " " + current.getLastName());
            for (Account x : currentAccount) {
                System.out.println(x.getAccountNumber());
            }
        }
    }


    //Output.printBankInfoToConsole(testUser);
    Scanner storageReader = new Scanner(new File("C:/Users/fadewale/IdeaProjects/BankingMob/src/Storage.csv"));

    {
        int rowNum = 0;
        while (storageReader.hasNextLine()) {
            ++rowNum;
            if (rowNum == 0) {
                String nextLn = storageReader.nextLine();
                continue;
            }
            String nextRow = storageReader.nextLine();
            System.out.println(nextRow);
            //System.out.println("Arielle" + "Duncan" + "344102638" + "Savings" + "1000");
            //Row StorageRow = new Row(nextRow);
        }
    //} catch(Exception e;) {

    {
       // System.out.println("Testing " + e);
    }
}


}//end of main class