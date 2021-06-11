import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public Main() throws FileNotFoundException {
    }

    public static void main(String[] args) {
        BankManager bankManager = new BankManager();

        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        System.out.println("----- Welcome to GROUP 2 Bank ------");
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        // Sign Up
        System.out.println();
        System.out.println("What would you like to accomplish today? ");

        // Ask user to either login or sign up
        Scanner scanner = new Scanner(System.in);
        boolean inputNotValid = true;
        while (inputNotValid) {
            System.out.print("Login or Sign Up: ");
            String workflow = scanner.nextLine();

            if (workflow.equalsIgnoreCase("login")) {
                // login workflow
                // !!!! (IMPLEMENT LATER) !!!!
                inputNotValid = false;
                Login(scanner, bankManager);

            } else if (workflow.equalsIgnoreCase("sign up")) {
                inputNotValid = false;
                // sign up workflow
                SignUp(scanner, bankManager);
                Login(scanner, bankManager);
            } else {
                System.out.println("Option provided not valid");
            }
        }


        Iterator userIterator = bankManager.getUserMap().entrySet().iterator();

        while (userIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry) userIterator.next();
            User current = (User) mapElement.getValue();
            ArrayList<Account> currentAccount = current.getAccounts();
            System.out.println(current.getFirstName() + " " + current.getLastName());
            for (Account x : currentAccount) {
                System.out.println("Account Number: " + x.getAccountNumber());
            }
        }
    }

    public static void Login(Scanner scanner, BankManager bankManager) {
        System.out.println("Loading Login procedure...");
        System.out.println("|||| NOT IMPLEMENTED ||||");
    }

    public static void SignUp(Scanner scanner, BankManager bankManager) {
        System.out.println("Loading Sign Up procedure...");
        System.out.println();

        // first name
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        // last name
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        // unique pin
        System.out.print("Unique pin (3 digit pin): ");
        int uniquePin = scanner.nextInt();

        // create new user
        System.out.println();
        System.out.println("User created with the following credentials");
        System.out.println("-------------------------------------------");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("unique pin: " + uniquePin);

        User newUser = new User(firstName, lastName, uniquePin);

        // create new checkings account
        Account newAccount = new CheckingsAccount(0, uniquePin);

        // link checkings account to user
        newUser.addNewAccount(newAccount);

        // Bank manager add user to "bank database (hashmap)"
        bankManager.addNewUser(newUser);
    }

}//end of main class
