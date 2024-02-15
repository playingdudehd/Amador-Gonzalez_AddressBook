package Address;
import java.util.LinkedList;
import Address.data.AddressEntry;

class AddressBook{
    private LinkedList<AddressEntry> addressEntryList;

    public AddressBook(){
        this.addressEntryList = new LinkedList<>();
    }
    public void list(){  //list which iterates through address entrylist and for each item call toString &prints it out
        for (AddressEntry addressEntry : addressEntryList){
            System.out.println(addressEntry.toString());
        }
    }
    public void add(AddressEntry addressEntry){
        addressEntryList.add(addressEntry);
    }

}
