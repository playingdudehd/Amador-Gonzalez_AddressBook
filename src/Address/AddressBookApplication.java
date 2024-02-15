package Address;

import Address.data.AddressEntry;
/**
 *
 *
 * **/

class AddressBookApplication {
    //AddressBook ab;

    public static void main(String[] args) {
        //Menu.displayMenu();
        /*
        String first_Name = Menu.prompt_FirstName();
        String last_name = Menu.prompt_LastName();
        String street = Menu.prompt_Street();
        String city = Menu.prompt_City();
        String state = Menu.prompt_State();
        Integer zip = Menu.prompt_Zip();
        String telephone = Menu.prompt_Telephone();
        String email = Menu.prompt_Email();
        */
        AddressBook ab = new AddressBook();  //instance of AddressBook
        initAddressBookExercise(ab);
    }
    public static void initAddressBookExercise(AddressBook ab){
        AddressEntry part1 = new AddressEntry("Misa", "Amador", "1901 Harder Rd", "Hayward", "CA", 94542, "5108853507", "misa.amadorgonzalez@csueastbay.edu");
        AddressEntry part2 = new AddressEntry();
        ab.add(part1);
        ab.add(part2);
        ab.list();
    }
}

