package Address;

import Address.data.AddressEntry;
import java.util.Scanner; // Import the Scanner Class
import java.util.Set;

/**
 * Represents the menu class for the address book application.
 */
public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Closes the scanner to release resources.
     */
    public static void closeScanner() {
        scanner.close();
    }

    /**
     * Displays the menu options for the address book application.
     */
    public void displayMenu() {
        System.out.println("*************************");
        System.out.println("Please enter your menu selection");
        System.out.println("a) Loading From File");
        System.out.println("b) Addition");
        System.out.println("c) Removal");
        System.out.println("d) Find");
        System.out.println("e) Listing");
        System.out.println("f) Quit");
        System.out.println("*************************");
    }

    /**
     * Gets the user's menu choice.
     */
    public String getUserChoice() {
        return scanner.nextLine();
    }

    /**
     * Prompts the user for the first name.
     */
    public static String prompt_FirstName() {
        System.out.print("First Name:");
        return scanner.nextLine();
    }

    /**
     * Prompts the user for the last name.
     */
    public static String prompt_LastName() {
        System.out.print("Last Name: ");
        return scanner.nextLine();
    }

    /**
     * Prompts the user for the street.
     */
    public static String prompt_Street() {
        System.out.print("Street: ");
        return scanner.nextLine();
    }

    /**
     * Prompts the user for the city.
     */
    public static String prompt_City() {
        System.out.print("City: ");
        return scanner.nextLine();
    }

    /**
     * Prompts the user for the state.
     */
    public static String prompt_State() {
        System.out.print("State: ");
        return scanner.nextLine();
    }

    /**
     * Prompts the user for the zip code.
     */
    public static Integer prompt_Zip() {
        Scanner mynum = new Scanner(System.in);
        System.out.print("Zip: ");
        return mynum.nextInt();
    }

    /**
     * Prompts the user for the telephone number.
     */
    public static String prompt_Telephone() {
        System.out.print("Telephone: ");
        return scanner.nextLine();
    }

    /**
     * Prompts the user for the email address.
     */
    public static String prompt_Email() {
        System.out.print("Email: ");
        return scanner.nextLine();
    }

    /**
     * Prompts the user to find entries by partial last name.
     * Returns a set of found entries.
     */
    public Set<AddressEntry> prompt_FindByLastName(AddressBook addressBook) {
        System.out.print("Enter the beginning of the last name: ");
        String partialLastName = scanner.nextLine();
        Set<AddressEntry> foundEntries = addressBook.findEntriesByLastName(partialLastName);
        if (foundEntries.isEmpty()) {
            System.out.println("No entries found.");
        } else {
            System.out.println("Found entries:");
            for (AddressEntry entry : foundEntries) {
                System.out.println(entry.toString());
            }
        }
        return foundEntries;
    }
}