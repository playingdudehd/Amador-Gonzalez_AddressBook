package Address;

import Address.data.AddressEntry;
/**
 *
 *
 * **/

class AddressBookApplication {
    //AddressBook ab;

    public static void main(String[] args) {
        AddressBook ab = new AddressBook();  //instance of AddressBook
        initAddressBookExercise(ab);
        Menu menu = new Menu();
        menu.displayMenu();
        while(true){
            String choice = menu.getUserChoice();
            switch (choice.toLowerCase()){
                case "a":


                    break;
                case "b":

                    addEntry(ab, menu);
                    break;
                case "c":

                    removeEntry(ab, menu);
                    break;
                case "d":

                    findEntry(ab, menu);
                    break;
                case "e":

                    listEntries(ab);
                    break;
                case "f":

                    System.out.println("Exiting the Address Book Program");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice, Try Again");
                    break;
            }

        }
    }
    public static void initAddressBookExercise(AddressBook ab){
        AddressEntry part1 = new AddressEntry("Misa", "Amador", "1901 Harder Rd", "Hayward", "CA", 94542, "5108853507", "misa.amadorgonzalez@csueastbay.edu");
        AddressEntry part2 = new AddressEntry();
        ab.add(part1);
        ab.add(part2);
        ab.list();
    }
    private static void addEntry(AddressBook ab, Menu menu){
    AddressEntry newEntry = new AddressEntry(
            Menu.prompt_FirstName(),
            Menu.prompt_LastName(),
            Menu.prompt_Street(),
            Menu.prompt_City(),
            Menu.prompt_State(),
            Menu.prompt_Zip(),
            Menu.prompt_Telephone(),
            Menu.prompt_Email()
    );
    ab.add(newEntry);
    System.out.println("New Entry Added Successfully");
    }
    private static void removeEntry(AddressBook ab, Menu menu){
        String lastNameToRemove = menu.prompt_LastName();
        AddressEntry entryToRemove = ab.find(lastNameToRemove);

        if(entryToRemove != null){
            ab.remove(entryToRemove);
            System.out.println("Entry removed successfully");
        }else {
            System.out.println("Entry not found");
        }
    }
    private static void findEntry(AddressBook ab, Menu menu){
        String lastNametoFind = menu.prompt_LastName();
        AddressEntry foundEntry = ab.find(lastNametoFind);

        if(foundEntry != null){
            System.out.println("Found entry:" + foundEntry.toString());
        }else {
            System.out.println("Entry not found.");
        }
    }
    private static void listEntries(AddressBook ab){
        ab.listAlphabeticOrder();
    }
}

