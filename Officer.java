import java.util.UUID;

/**
 * class for officers typer of user
 */
public class Officer extends User {
    private int yearsServed;
    private String rank;
    private String badgeNumber;

    /**
     * Default constructor for Officer
     */
    public Officer() {

    }

    public Officer(String firstName, String lastName, String userName, String password, String precinct,
            String department, int yearsServed, String rank, String badgeNumber) {
        super(firstName, lastName, userName, password, precinct, department);
        this.yearsServed = yearsServed;
        this.rank = rank;
        this.badgeNumber = badgeNumber;
    }

    public Officer(UUID id, String firstName, String lastName, String userName, String password, String precinct,
            String department, int yearsServed, String rank, String badgeNumber) {
        super(id, firstName, lastName, userName, password, precinct, department);
        this.yearsServed = yearsServed;
        this.rank = rank;
        this.badgeNumber = badgeNumber;
    }

    // getter section
    /**
     * getter for years served by an Officer
     * 
     * @return int yearsServed
     */
    public int getYearsServed() {
        return yearsServed;
    }

    /**
     * getter for rank of an Officer
     * 
     * @return String rank
     */
    public String getRank() {
        return rank;
    }

    /**
     * getter for Officer badge Number gonig to be used for identifcation
     * 
     * @return String badgeNumber
     */
    public String getBadgeNumber() {
        return badgeNumber;
    }

    // setter section
    /**
     * set amount of years an Officer has served
     * 
     * @param int yearsServed
     */
    public void setYearsServed(int yearsServed) {
        this.yearsServed = yearsServed;
    }

    /**
     * set the rank of an officer
     * 
     * @param String rank
     */
    public void setRank(String rank) {
        this.rank = rank;
    }

    /**
     * set the badge number for an officer
     * 
     * @param String badgeNumber
     */
    public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }
}
