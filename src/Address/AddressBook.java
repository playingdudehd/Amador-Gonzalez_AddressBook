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
                // Split the line based on the delimiter (assuming comma here)
                String[] fields = line.split(",");
                // Check if the line has the expected number of fields
                if (fields.length == 8) { // Assuming 8 fields: firstName, lastName, street, city, state, zip, phone, email
                    // Extract fields
                    String firstName = fields[0].trim();
                    String lastName = fields[1].trim();
                    String street = fields[2].trim();
                    String city = fields[3].trim();
                    String state = fields[4].trim();
                    int zip = Integer.parseInt(fields[5].trim());
                    String phone = fields[6].trim();
                    String email = fields[7].trim();

                    // Create an AddressEntry object
                    AddressEntry addressEntry = new AddressEntry(firstName, lastName, street, city, state, zip, phone, email);

                    // Add the AddressEntry to the addressEntryList
                    addressEntryList.add(addressEntry);
                } else {
                    System.out.println("Skipping invalid line: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception as needed
            System.out.println("Current Wroking Directory: " + System.getProperty("user.dir"));
        }
    }
}
