package Test;

import Address.data.AddressEntry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddressEntryTest {

    @Test
    public void testToString() {
        AddressEntry addressEntry = new AddressEntry("John", "Doe", "123 Main St", "City", "CA", 12345, "555-1234", "john@example.com");
        String expectedToString = "John Doe\n123 Main St\nCity, CA 12345\n555-1234\njohn@example.com\n";
        assertEquals(expectedToString, addressEntry.toString());
    }

    @Test
    public void testGettersAndSetters() {
        AddressEntry addressEntry = new AddressEntry();
        addressEntry.setFirstName("Jane");
        addressEntry.setLastName("Doe");
        addressEntry.setStreet("456 Oak St");
        addressEntry.setCity("City");
        addressEntry.setState("CA");
        addressEntry.setZip(67890);
        addressEntry.setPhone("555-5678");
        addressEntry.setEmail("jane@example.com");
        assertEquals("Jane", addressEntry.getFirstName());
        assertEquals("Doe", addressEntry.getLastName());
        assertEquals("456 Oak St", addressEntry.getStreet());
        assertEquals("City", addressEntry.getCity());
        assertEquals("CA", addressEntry.getState());
        assertEquals(67890, addressEntry.getZip());
        assertEquals("555-5678", addressEntry.getPhone());
        assertEquals("jane@example.com", addressEntry.getEmail());
    }
}