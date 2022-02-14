import java.util.ArrayList;
public class Administrators {
    private static Administrators admins = null;
    private static ArrayList<Administrator> adminList = new ArrayList<Administrator>();

    private Administrators() {
        adminList = DataLoader.loadAdministrators();
    }

    public static Administrators getInstance() {
        if (admins == null) {
            admins = new Administrators();
        }
        return admins;
    }

    public ArrayList<Administrator> getAdministrators() {
        return adminList;
    }

    public void addUser(String firstName, String lastName, String userName, String password,
     String precinct,  String department, String phoneNumber, String email) {
        adminList.add(new Administrator(firstName, lastName, userName, password,
        precinct, department, phoneNumber, email));
        DataWriter.saveAdministrators();
    }
}
