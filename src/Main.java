import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User testUser = new User("first", "Test", 1234);

        Account testUserAccount = new CheckingsAccount(10000, 3, 2459823);
        //#3's Stand for savings accounts, while any other number is a checkings

        testUser.addNewAccount(testUserAccount);
        //for (Account account : testUser.getAccounts()) {
            //System.out.println(account.getBalance());
        //}
        //Output.printBankInfoToConsole(testUser);
        try (Scanner storageReader = new Scanner(new File("C:/Users/Armani Catlin/Documents/BankingMob/src/Storage.csv"));) {
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
        } catch (Exception e) {
            System.out.println("Something did not go as planned!  Exception info is: " + e);
        }
    }

    class Row {
        public Row(String row) {
            System.out.println("Row received: " + row);
            try (Scanner rowReader = new Scanner(row)) {
                rowReader.useDelimiter(",");
                int index = 0;
                while (rowReader.hasNext()) {
                    String val = rowReader.next();
                    System.out.println("Current value is: " + val);
//                    if (index == 0) setMonth(Integer.parseInt(val));
//                    if (index == 1) setDay(Integer.parseInt(val));
//                    if (index == 2) setYear(Integer.parseInt(val));
//                    if (index == 3) setHour(Integer.parseInt(val));
//                    if (index == 4) setMinute(Integer.parseInt(val));
//                    if (index == 5) setSecond(Integer.parseInt(val));
//                    if (index == 6) (val);

                    ++index;
                }
                rowReader.close();
            } catch (Exception e) {
                System.out.println("Something did not go as planned!  Exception info is: " + e);
            }
        }
    }
}