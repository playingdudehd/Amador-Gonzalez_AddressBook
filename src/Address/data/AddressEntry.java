package Address.data;

/**
 * 
 */
public class AddressEntry {
    private String firstName, lastName, street, city, state, phone, email;
    private int zip;//private restricted access
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

    public AddressEntry(String firstName, String lastName, String street, String city, String state,int zip,  String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;

    }

    public String toString() // unsure what to do with this one?
    {
        return firstName + " " + lastName + " " + street + " " + city + " " + state + " " + zip + " " + phone + " " + email;
    }
    public String getFirstName(){  //**After this point its just Getters and Setters**
        return firstName;
    }
    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }
    public String getStreet(){
        return street;
    }
    public void setStreet(String newStreet){
        this.street = newStreet;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String newCity){
        this.city = newCity;
    }
    public String getState(){
        return state;
    }
    public void setState(String newState){
        this.state = newState;
    }
    public int getZip(){
        return zip;
    }
    public void setZip(int newZip){
        this.zip = newZip;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String newPhone){
        this.phone = newPhone;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String newEmail){
        this.email = newEmail;
    }
}
