
/**
 * User class
 * serves as a base for all
 * types of users for this app
 * collects user info
 */
import java.util.List;
import java.util.UUID;
import java.util.ArrayList;

public class User {
    private UUID id;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String precinct;
    private String department;
    private List<Crime> crimeList;

    public User() {

    }

    public User(String firstName, String lastName, String userName, String password, String precinct,
            String department) {
        this.id = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        crimeList = new ArrayList<>();
        this.password = password;
        this.precinct = precinct;
        this.department = department;
    }

    public User(UUID id, String firstName, String lastName, String userName, String password, String precinct,
            String department) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        crimeList = new ArrayList<>();
        this.password = password;
        this.precinct = precinct;
        this.department = department;
    }

    // getter section

    /**
     * id getter
     * 
     * @return unique id
     */
    public UUID getId() {
        return id;
    }

    /**
     * first name getter
     * 
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * last name getter
     * 
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * user name getter
     * 
     * @return user name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * password getter
     * 
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * precint getter
     * 
     * @return precint
     */
    public String getPrecinct() {
        return precinct;
    }

    /**
     * department getter
     * 
     * @return department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * crime list getter
     * 
     * @return crime list
     */
    public List<Crime> getCrimeList() {
        return crimeList;
    }

    // setter section
    /**
     * first name setter
     * 
     * @param String firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * last name setter
     * 
     * @param String lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * username setter
     * 
     * @param String userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * password setter
     * 
     * @param String password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * precitn setter
     * 
     * @param String precint
     */
    public void setPrecinct(String precinct) {
        this.precinct = precinct;
    }

    /**
     * department setter
     * 
     * @param String department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Crime list setter not sure if this is needed
     * 
     * @param crimeList
     */
    public void setCrimeList(List<Crime> crimeList) {
        this.crimeList = crimeList;
    }

    // this is going to have to be changed to append to list
    // but fine for now
    public String append() {
        return null;
    }

    /**
     * void method for viewing stuff
     */
    private void view() {

    }

    /**
     * void method for removing edits
     */
    private void removeEdit() {

    }
}
