/**
 *  class administrator
 * extentsion of type of user
 */
public class Administrator extends User{
    private String phoneNumber;
    private String email;

    /**
     * Default Constructor for admin
     */
    public Administrator(String firstName, String lastName, String username, String password, String precinct, String department, String phoneNumber, String email) {
        super(firstName, lastName, username, password, precinct, department);
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    //getter section
    /**
     * get Phone Number
     * @return String phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }
    /**
     * get Email
     * @return String email
     */
    public String getEmail() {
        return email;
    }

    //setter section
    /**
     * set Phone Number 
     * @param String phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    /**
     * set Email
     * @param String email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    //methods section
    /**
     * void method for deleting a crime
     */
    private void deleteCrime() {
        
    }

    /**
     * void method for deleting a person
     */
    private void deletePerson() {

    }

    /**
     * void method for deleting users
     */
    private void deleteUser() {

    }
}
