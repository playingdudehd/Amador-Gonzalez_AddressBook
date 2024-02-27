package Test;
import Address.AddressBook;
import Address.Menu;
import Address.data.AddressEntry;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

public class MenuTest {
    private Menu menu;
    private InputStream originalSystemIn;

    @BeforeEach
    public void setup() {
        originalSystemIn = System.in;
    }

    @AfterEach
    public void tearDown() {
        System.setIn(originalSystemIn);
        menu.closeScanner(); // Close the scanner after each test
    }

    @Test
    public void testDisplayMenu() {
        menu = new Menu();
        // Redirect System.out to capture the printed menu
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        menu.displayMenu();

        // Assert the menu is displayed correctly
        String expectedMenu = "*************************\nPlease enter your menu selection\na) Loading From File\nb) Addition\nc) Removal\nd) Find\ne) Listing\nf) Quit\n*************************";
        assertEquals(expectedMenu, outputStreamCaptor.toString().trim());
    }

    @Test
    public void testGetUserChoice() {
        provideInput("b"); // Simulate user entering "b"
        menu = new Menu();
        assertEquals("b", menu.getUserChoice());
    }

    private void provideInput(String b) {
    }

    @Test
    public void testPromptFirstName() {
        provideInput("John"); // Simulate user entering "John"
        menu = new Menu();
        assertEquals("John", menu.prompt_FirstName());
    }

    @Test
    public void testPromptLastName() {
        provideInput("Doe"); // Simulate user entering "Doe"
        menu = new Menu();
        assertEquals("Doe", menu.prompt_LastName());
    }

    @Test
    public void testPromptStreet() {
        provideInput("123 Main St"); // Simulate user entering "123 Main St"
        menu = new Menu();
        assertEquals("123 Main St", menu.prompt_Street());
    }

}