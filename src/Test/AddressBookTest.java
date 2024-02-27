package Test;

import Address.AddressBook;
import Address.data.AddressEntry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class AddressBookTest {

    private AddressBook addressBook;

    @BeforeEach
    public void setUp() {
        addressBook = new AddressBook();
    }

    @Test
    public void testAddEntry() {
        // Test adding a new entry to the address book
        AddressEntry newEntry = new AddressEntry("John", "Doe", "123 Main St", "City", "CA", 12345, "555-1234", "john@example.com");
        addressBook.add(newEntry);

        // Check if the entry was added successfully
        assertTrue(addressBook.find("Doe") != null);
    }

    @Test
    public void testRemoveEntry() {
        // Test removing an existing entry from the address book
        AddressEntry entryToRemove = new AddressEntry("Jane", "Doe", "456 Oak St", "City", "CA", 67890, "555-5678", "jane@example.com");
        addressBook.add(entryToRemove);

        // Remove the entry
        addressBook.remove(entryToRemove);

        // Check if the entry was removed successfully
        assertNull(addressBook.find("Doe"));
    }

    @Test
    public void testFindEntry() {
        // Test finding an existing entry by last name
        AddressEntry entryToFind = new AddressEntry("Alice", "Smith", "789 Elm St", "City", "CA", 11111, "555-9999", "alice@example.com");
        addressBook.add(entryToFind);

        // Find the entry
        AddressEntry foundEntry = addressBook.find("Smith");

        // Check if the correct entry was found
        assertNotNull(foundEntry);
        assertEquals(entryToFind, foundEntry);
    }

    @Test
    public void testFindNonExistentEntry() {
        // Test finding a non-existent entry by last name
        AddressEntry foundEntry = addressBook.find("NonExistent");

        // Check that no entry was found
        assertNull(foundEntry);
    }

    @Test
    public void testListAlphabeticOrder() {
        // Test listing entries in alphabetical order
        AddressEntry entry1 = new AddressEntry("Bob", "Johnson", "123 Elm St", "City", "CA", 98765, "555-4321", "bob@example.com");
        AddressEntry entry2 = new AddressEntry("Charlie", "Williams", "456 Oak St", "City", "CA", 54321, "555-8765", "charlie@example.com");

        addressBook.add(entry1);
        addressBook.add(entry2);

        // List entries in alphabetic order
        addressBook.listAlphabeticOrder();
    }

    @Test
    public void testFindEntriesByLastName() {
        // Test finding entries by a partial last name
        AddressEntry entry1 = new AddressEntry("John", "Doe", "123 Main St", "City", "CA", 12345, "555-1234", "john@example.com");
        AddressEntry entry2 = new AddressEntry("Jane", "Doe", "456 Oak St", "City", "CA", 67890, "555-5678", "jane@example.com");

        addressBook.add(entry1);
        addressBook.add(entry2);

        // Find entries by partial last name
        Set<AddressEntry> foundEntries = addressBook.findEntriesByLastName("Do");

        // Check if the correct entries were found
        assertTrue(foundEntries.contains(entry1));
        assertTrue(foundEntries.contains(entry2));
    }

    @Test
    public void testLoadFromFile() {
        // Test loading entries from a file
        String filePath = "data.txt";
        addressBook.loadFromFile(filePath);

        // Check if entries are loaded successfully
        assertTrue(addressBook.find("Jeppson") != null);
        assertTrue(addressBook.find("Jeppson") != null);
    }
}