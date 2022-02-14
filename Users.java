import java.util.ArrayList;
public class Users {
    private static Users users = null;
    private static ArrayList<User> userList = new ArrayList<User>();

    private Users() {
        userList = DataLoader.loadUsers();
    }

    public static Users getInstance() {
        if (users == null) {
            users = new Users();
        }
        return users;
    }

    public ArrayList<User> getUsers() {
        return userList;
    }

    public void addUser(String firstName, String lastName, String userName, String password,
     String precinct,  String department) {
        userList.add(new User(firstName, lastName, userName, password,
        precinct, department));
        DataWriter.saveUsers();
    }
}