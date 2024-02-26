package Address;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import Address.data.AddressEntry;

/**
 * Represents an address book with various functionalities.
 */
class AddressBook {
    // List to store address entries
    private LinkedList<AddressEntry> addressEntryList;

    /**
     * Constructor to initialize an empty address book.
     */
    public AddressBook() {
        this.addressEntryList = new LinkedList<>();
    }

    /**
     * Displays the details of all address entries in the address book.
     */
    public void list() {
        for (AddressEntry addressEntry : addressEntryList) {
            System.out.println(addressEntry.toString());
        }
    }

    /**
     * Adds an address entry to the address book.
     */
    public void add(AddressEntry addressEntry) {
        addressEntryList.add(addressEntry);
    }

    /**
     * Removes an address entry from the address book.
     */
    public void remove(AddressEntry addressEntry) {
        addressEntryList.remove(addressEntry);
    }

    /**
     * Finds and returns an address entry based on the last name.
     */
    public AddressEntry find(String lastName) {
        for (AddressEntry entry : addressEntryList) {
            if (entry.getLastName().equalsIgnoreCase(lastName)) {
                return entry;
            }
        }
        return null;
    }

    /**
     * Lists address entries in alphabetical order based on last names.
     */
    public void listAlphabeticOrder() {
        List<AddressEntry> sortedList = new ArrayList<>(addressEntryList);
        Collections.sort(sortedList, Comparator.comparing(AddressEntry::getLastName));
        for (int i = 0; i < sortedList.size(); i++) {
            AddressEntry addressEntry = sortedList.get(i);
            System.out.println("\n" + (i + 1) + ": " + addressEntry.toString());
        }
    }

    /**
     * Finds address entries by a partial last name and returns a set of matching entries.
     */
    public Set<AddressEntry> findEntriesByLastName(String partialLastName) {
        Set<AddressEntry> foundEntries = new HashSet<>();
        for (AddressEntry entry : addressEntryList) {
            if (entry.getLastName().toLowerCase().startsWith(partialLastName.toLowerCase())) {
                foundEntries.add(entry);
            }
        }
        return foundEntries;
    }

    /**
     * Loads address entries from a file into the address book.
     */
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
            System.out.println("Current Working Directory: " + System.getProperty("user.dir"));
        }
    }
}