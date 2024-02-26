package Address;
import java.io.BufferedReader;
import java.util.*;
import Address.data.AddressEntry;
import java.io.FileReader;
import java.io.IOException;


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
        List<AddressEntry> sortedList = new ArrayList<>(addressEntryList);
        Collections.sort(sortedList, Comparator.comparing(AddressEntry::getLastName));

        for (int i = 0; i < sortedList.size(); i++) {
            AddressEntry addressEntry = sortedList.get(i);
            System.out.println("\n" + (i + 1) + ": " + addressEntry.toString());
        }
    }
    public Set<AddressEntry> findEntriesByLastName(String partialLastName) {
        Set<AddressEntry> foundEntries = new HashSet<>();

        for (AddressEntry entry : addressEntryList) {
            // Check if the last name starts with the provided partial last name
            if (entry.getLastName().toLowerCase().startsWith(partialLastName.toLowerCase())) {
                foundEntries.add(entry);
            }
        }
        return foundEntries;
    }
    public void loadFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Parse the line and create an AddressEntry object
                // Add the AddressEntry to the addressEntryList
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception as needed
        }
    }
}
