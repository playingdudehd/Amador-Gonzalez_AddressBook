package Address.data;
public class AddressEntry {
    // Private instance variables to store personal information
    private String firstName, lastName, street, city, state, phone, email;
    private int zip;  // Zip code

    // Default constructor setting default values
    public AddressEntry(){
        firstName = "Jane";
        lastName = "Doe";
        street = "123 street";
        city = "Hayward";
        state = "CA";
        zip = 94542;
        phone = "1234567890";
        email = "janedoe@hotmail.com";
    }//constructor

    // Parameterized constructor to set values based on provided arguments
    public AddressEntry(String firstName, String lastName, String street, String city, String state, int zip,  String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    // toString method to create a formatted string representation of the object

    /**
     * @return formatted string representation
     */
    public String toString() {
        return firstName + " " + lastName + "\n" + street + "\n" + city + ", " + state + " " + zip + "\n" + phone + "\n" + email + "\n";
    }

    /**
     * @return  first name
     */
    // Getter and Setter methods for firstName
    public String getFirstName(){
        return firstName;
    }

    /**
     * @param newFirstName the new first name to set
     */
    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }

    /**
     * @return last name
     */
    // Getter and Setter methods for lastName
    public String getLastName(){
        return lastName;
    }

    /**
     * @param newLastName the new last name to set
     */
    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }

    /**
     * @return the street
     */
    // Getter and Setter methods for street
    public String getStreet(){
        return street;
    }

    /**
     * @param newStreet the new street to set
     */
    public void setStreet(String newStreet){
        this.street = newStreet;
    }

    /**
     * @return the city
     */
    // Getter and Setter methods for city
    public String getCity(){
        return city;
    }

    /**
     * @param newCity the new city to set
     */
    public void setCity(String newCity){
        this.city = newCity;
    }

    /**
     * @return the state
     */
    // Getter and Setter methods for state
    public String getState(){
        return state;
    }

    /**
     * @param newState the new state to set
     */
    public void setState(String newState){
        this.state = newState;
    }

    /**
     * @return the zip code
     */
    // Getter and Setter methods for zip
    public int getZip(){
        return zip;
    }

    /**
     * @param newZip the new zip code to set
     */
    public void setZip(int newZip){
        this.zip = newZip;
    }

    /**
     * @return the phone number
     */
    // Getter and Setter methods for phone
    public String getPhone(){
        return phone;
    }

    /**
     * @param newPhone the new phone number to set
     */
    public void setPhone(String newPhone){
        this.phone = newPhone;
    }

    /**
     * @return the email address
     */
    // Getter and Setter methods for email
    public String getEmail(){
        return email;
    }

    /**
     * @param newEmail the new email address to set.
     */
    public void setEmail(String newEmail){
        this.email = newEmail;
    }
}