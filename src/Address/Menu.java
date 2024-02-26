package Address;
import Address.data.AddressEntry;
import java.util.Scanner; //import the Scanner Class
import java.util.Set;
public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    public static void closeScanner(){
        scanner.close();
    }
    public void displayMenu(){
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
    public String getUserChoice(){
        return scanner.nextLine();
    }
    public static String prompt_FirstName(){
        System.out.print("First Name:");
        return scanner.nextLine();
    }
    public static String prompt_LastName(){
        System.out.print("Last Name: ");
        return scanner.nextLine();
    }
    public static String prompt_Street(){
        System.out.print("Street: ");
        return scanner.nextLine();
    }
    public static String prompt_City() {
        System.out.print("City: ");
        return scanner.nextLine();
    }
    public static String prompt_State() {
        System.out.print("State: ");
        return scanner.nextLine();
    }
    public static Integer prompt_Zip() {
        Scanner mynum = new Scanner(System.in);
        System.out.print("Zip: ");
        return mynum.nextInt();
    }
    public static String prompt_Telephone() {
        System.out.print("Telephone: ");
        return scanner.nextLine();
    }
    public static String prompt_Email() {
        System.out.print("Email: ");
        return scanner.nextLine();
    }
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
