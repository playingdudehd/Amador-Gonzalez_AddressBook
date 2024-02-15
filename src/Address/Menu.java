package Address;
import java.util.Scanner; //import the Scanner Class
public class Menu {
    /*
    public static String displayMenu(){
        System.out.println("*************************");
        System.out.println("Please enter your menu selection");
        System.out.println("a) Loading From File");
        System.out.println("b) Addition");
        System.out.println("c) Removal");
        System.out.println("d) Find");
        System.out.println("e) Listing");
        System.out.println("f) Quit");
        System.out.println("*************************");
        Scanner mystr = new Scanner(System.in);
        String choice = mystr.nextLine();
        return choice;
    }*/
    /**
     * prompt for First Name
     * @return the First Name entered in by the user, if nothing entered in will use default
     */
    public static String prompt_FirstName(){
        Scanner mystr = new Scanner(System.in); //Create a Scanner Object

        System.out.print("First Name:");
        String fName = mystr.nextLine();
        return fName;
    }
    public static String prompt_LastName(){
        Scanner mystr = new Scanner(System.in);
        System.out.print("Last Name: ");
        String fName = mystr.nextLine();

        return fName;
    }
    public static String prompt_Street(){
        Scanner mystr = new Scanner(System.in);
        System.out.print("Street: ");
        String street = mystr.nextLine();
        return street;
    }
    public static String prompt_City() {
        Scanner mystr = new Scanner(System.in);
        System.out.print("City: ");
        String city = mystr.nextLine();
        return city;
    }
    public static String prompt_State() {
        Scanner mystr = new Scanner(System.in);
        System.out.print("State: ");
        String state = mystr.nextLine();
        return state;
    }
    public static Integer prompt_Zip() {
        Scanner mynum = new Scanner(System.in);
        System.out.print("Zip: ");
        int zip = mynum.nextInt();
        return zip;
    }
    public static String prompt_Telephone() {
        Scanner mystr = new Scanner(System.in);
        System.out.print("Telephone: ");
        String telephone = mystr.nextLine();
        return telephone;
    }
    public static String prompt_Email() {
        Scanner mystr = new Scanner(System.in);
        System.out.print("Email: ");
        String email = mystr.nextLine();
        return email;
    }
}
