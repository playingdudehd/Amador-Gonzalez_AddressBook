package Address;
import java.util.LinkedList;
import java.util.Collections;
import Address.data.AddressEntry;


class AddressBook{
    private LinkedList<AddressEntry> addressEntryList;

    public AddressBook(){
        this.addressEntryList = new LinkedList<>();
    }
    public void list(){  //list which iterates through address entry list and for each item call toString & prints it out
        for (AddressEntry addressEntry : addressEntryList){
            System.out.println(addressEntry.toString());
        }
    }
    public void add(AddressEntry addressEntry){
        addressEntryList.add(addressEntry);
    }
    public void remove(AddressEntry addressEntry){
        addressEntryList.remove(addressEntry);
    }
    public AddressEntry find(String lastName){
        for(AddressEntry entry : addressEntryList){
            if(entry.getLastName().equalsIgnoreCase(lastName)){
                return entry;
            }
        }
        return null;
    }
    public void listAlphabeticOrder(){
        Collections.sort(addressEntryList, (entry1, entry2) -> entry1.getLastName().compareTo(entry2.getLastName()));
        list();
    }
}
