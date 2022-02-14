import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Person class used for creating people going to be an extension to many
 */
public abstract class Person {
    private UUID id;
    private String firstName;
    private String lastName;
    private boolean deceased;
    private String phoneNumber;
    private String address;
    protected List<Integer> caseNums;

    /**
     * default constructor for person
     */
    protected Person() {

    }

    protected Person(String firstName, String lastName, String phoneNumber, String address) {
        this.id = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.deceased = false; // default is not deceased
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    /**
     * Helps data loader that has existing parameters
     * 
     * @param id          found in JSON file
     * @param firstName   found in JSON file
     * @param lastName    found in JSON file
     * @param deceased    found in JSON file
     * @param phoneNumber found in JSON file
     */
    protected Person(UUID id, String firstName, String lastName, boolean deceased, String phoneNumber, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.deceased = deceased;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // getter section
    /**
     * get First Name
     * 
     * @return String firstName
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * get Last Name
     * 
     * @return String lastName
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * is Deceased boolean
     * 
     * @return deceased status true = dead false = alive
     */
    public boolean getIsDeceased() {
        return this.deceased;
    }

    /**
     * Accessor for phone numer
     * 
     * @return phone number in string format
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getAddress() {
        return this.address;
    }

    public UUID getId() {
        return this.id;
    }

    public List<Integer> getCases() {
        return caseNums;
    }

    // setter section
    /**
     * set First Name
     * 
     * @param String firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * set Last Name
     * 
     * @param String lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * set deceased status
     * 
     * @param boolean deceased
     */
    public void setDeceased(boolean deceased) {
        this.deceased = deceased;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addCase(Crime crime) {
        caseNums.add(crime.getCaseNumber());
    }
}
