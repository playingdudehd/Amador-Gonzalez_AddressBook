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
    public String toString() {
        return firstName + " " + lastName + "\n" + street + "\n" + city + ", " + state + " " + zip + "\n" + phone + "\n" + email + "\n";
    }

    // Getter and Setter methods for firstName
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }

    // Getter and Setter methods for lastName
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }

    // Getter and Setter methods for street
    public String getStreet(){
        return street;
    }
    public void setStreet(String newStreet){
        this.street = newStreet;
    }

    // Getter and Setter methods for city
    public String getCity(){
        return city;
    }
    public void setCity(String newCity){
        this.city = newCity;
    }

    // Getter and Setter methods for state
    public String getState(){
        return state;
    }
    public void setState(String newState){
        this.state = newState;
    }

    // Getter and Setter methods for zip
    public int getZip(){
        return zip;
    }
    public void setZip(int newZip){
        this.zip = newZip;
    }

    // Getter and Setter methods for phone
    public String getPhone(){
        return phone;
    }
    public void setPhone(String newPhone){
        this.phone = newPhone;
    }

    // Getter and Setter methods for email
    public String getEmail(){
        return email;
    }
    public void setEmail(String newEmail){
        this.email = newEmail;
    }
}