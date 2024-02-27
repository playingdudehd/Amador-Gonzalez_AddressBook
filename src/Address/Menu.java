package Address;

import Address.data.AddressEntry;
import java.util.Scanner; // Import the Scanner Class
import java.util.Set;


/**
 * Represents the menu class for the address book application.
 */
public class Menu {
    private static Scanner scanner;
    public Menu(){
        this.scanner = new Scanner(System.in);
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
     *@return The user's menu choice as a String.
     */
    public String getUserChoice() {
        return scanner.nextLine();
    }

    /**
     * Prompts the user for the first name.
     * @return The user-entered first name.
     */
    public static String prompt_FirstName() {
        System.out.print("First Name:");
        return scanner.nextLine();
    }

    /**
     * Prompts the user for the last name.
     * @return The user-entered last name.
     */
    public static String prompt_LastName() {
        System.out.print("Last Name: ");
        return scanner.nextLine();
    }

    /**
     * Prompts the user for the street.
     * @return The user-entered street.
     */
    public static String prompt_Street() {
        System.out.print("Street: ");
        return scanner.nextLine();
    }

    /**
     * Prompts the user for the city.
     * @return The user-entered city.
     */
    public static String prompt_City() {
        System.out.print("City: ");
        return scanner.nextLine();
    }

    /**
     * Prompts the user for the state.
     * @return The user-entered state.
     */
    public static String prompt_State() {
        System.out.print("State: ");
        return scanner.nextLine();
    }

    /**
     * Prompts the user for the zip code.
     * @return The user-entered zip code as an Integer.
     */
    public static Integer prompt_Zip() {
        System.out.print("Zip: ");
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for zip code. Please enter a valid integer.");
            return prompt_Zip(); // Recursive call if the input is not a valid integer
        }
    }

    /**
     * Prompts the user for the telephone number.
     * @return The user-entered telephone number.
     */
    public static String prompt_Telephone() {
        System.out.print("Telephone: ");
        return scanner.nextLine();
    }

    /**
     * Prompts the user for the email address.
     * @return The user-entered email address.
     */
    public static String prompt_Email() {
        System.out.print("Email: ");
        return scanner.nextLine();
    }

    /**
     * Prompts the user to find entries by partial last name.
     * Returns a set of found entries.
     *@param addressBook The AddressBook instance to search for entries.
     *@return A set of found AddressEntry instances.
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
    /**
     * Closes the scanner to free up system resources.
     */
    public void closeScanner() {
        scanner.close();
    }
}