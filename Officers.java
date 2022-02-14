import java.util.ArrayList;
//plural for officer
public class Officers {
    private static Officers officers = null;
    private static ArrayList<Officer> officerList = new ArrayList<Officer>();

    private Officers() {
        officerList = DataLoader.loadOfficers();
    }

    public static Officers getInstance() {
        if (officers == null) {
            officers = new Officers();
        }
        return officers;
    }

    public ArrayList<Officer> getOfficers() {
        return officerList;
    }

    public void addOfficer(String firstName, String lastName, String userName,
    String password, String precint, String department, int yearsServed,
    String rank, String badgeNumber) {
        officerList.add(new Officer(firstName, lastName, userName,
        password, precint, department, yearsServed, rank, badgeNumber));
        DataWriter.saveOfficers();
    }
}
