import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.UUID;
import java.util.Scanner;

public class CrimeTracker {
    
    static Scanner scanner = new Scanner(System.in);

    private static Users users;
    private static User user;
    private static User currentUser;

    private static Administrators admins;
    private static Administrator admin;

    private static Crimes crimes;
    private static Crime crime;

    private static Officers officers;
    private static Officer officer;

    private static Detectives detectives;
    private static Detective detective;

    /**
     * logging into account boolean tests to see if username is found then if
     * passeword matches password associated with username
     * 
     * @param userName
     * @param password
     * @return true if username and password were valid false if there was a trouble
     *         not finding username/ if password didn't match
     */
    public static boolean loginAccountUser(String userName, String password) {
        users = Users.getInstance();
        ArrayList<User> userList = users.getUsers();
        for (int i = 0; i < userList.size(); ++i) {
            user = userList.get(i);
            if (user.getUserName().equals(userName)) {
                if (user.getPassword().equals(password)) {
                    System.out.println("Logging you in...");
                    currentUser = user;
                    return true;
                } else {
                    System.out.println("Invalid password for username: " + userName);
                    return false;
                }
            }
        }
        System.out.println("Username not found");
        return false;
    }

    public static boolean loginAccountDetective(String userName, String password) {
        detectives = Detectives.getInstance();
        ArrayList<Detective> detectiveList = detectives.getDetectives();
        for (int i = 0; i < detectiveList.size(); ++i) {
            detective = detectiveList.get(i);
            if (detective.getUserName().equals(userName)) {
                if (detective.getPassword().equals(password)) {
                    System.out.println("Logging you in as Detective...");
                    currentUser = detective;
                    return true;
                } else {
                    System.out.println("Invalid password for username: " + userName);
                    return false;
                }
            }
        }
        System.out.println("Username not found");
        return false;
    }

    public static boolean loginAccountOfficer(String userName, String password) {
        officers = Officers.getInstance();
        ArrayList<Officer> officerList = officers.getOfficers();
        for (int i = 0; i < officerList.size(); ++i) {
            officer = officerList.get(i);
            if (officer.getUserName().equals(userName)) {
                if (officer.getPassword().equals(password)) {
                    System.out.println("Logging you in as Officer...");
                    currentUser = officer;
                    return true;
                } else {
                    System.out.println("Invalid password for username: " + userName);
                    return false;
                }
            }
        }
        System.out.println("Username not found");
        return false;
    }

    /**
     * checks to see if userName already exists amongst users
     * 
     * @param userName
     * @return true if username wasnt found in database false, if username already
     *         exists amongst users
     */
    public static boolean existingUserName(String userName) {
        users = Users.getInstance();
        ArrayList<User> userList = users.getUsers();
        for (int i = 0; i < users.getUsers().size(); ++i) {
            user = userList.get(i);
            if (user.getUserName().equals(userName)) {
                System.out.println("User Name is taken...");
                return false;
            }
        }
        return true;
    }

    public static User getCurrentUser() {
        return currentUser;
    }

    /**
     * checks to see if email already exists amongst users
     * 
     * @param email
     * @return true if email not found false, if email already exists amongst users
     */
    public static boolean existingEmail(String email) {
        admins = Administrators.getInstance();
        ArrayList<Administrator> adminList = admins.getAdministrators();
        for (int i = 0; i < adminList.size(); ++i) {
            admin = adminList.get(i);
            if (admin.getEmail().equals(email)) {
                System.out.println("Email is taken...");
                return false;
            }
        }
        return true;
    }

    /**
     * 
     * @param email
     * @return status of whether an email is proper syntax or not true if yes false
     *         if not
     */
    public static boolean validEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
                + "A-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null) {
            return false;
        }
        // return true if valid email
        if (pat.matcher(email).matches()) {
            return pat.matcher(email).matches();
        }
        // else, return false
        else {
            System.out.println("invalid email syntax");
            return false;
        }
    }

    /**
     * boolean to check existing phone numbers amongst admins
     * 
     * @param phoneNumber
     * @return true if phonenumber isn't already in system false if phoner number is
     *         already in account
     */
    public static boolean existingPhoneNumber(String phoneNumber) {
        admins = Administrators.getInstance();
        ArrayList<Administrator> adminList = admins.getAdministrators();
        for (int i = 0; i < adminList.size(); ++i) {
            admin = adminList.get(i);
            if (admin.getPhoneNumber().equals(phoneNumber)) {
                System.out.println("Phone Number already associated with an account...");
                return false;
            }
        }
        return true;
    }

    /**
     * boolean that checks if assigned ID is already registered
     * 
     * @param assingedId
     * @return true if id isn't already regisered with crime false if id is already
     *         registered to a crime
     */
    public static boolean checkCrimeID(String assingedId) {
        crimes = Crimes.getInstance();
        ArrayList<Crime> crimeList = crimes.getCrimes();
        for (int i = 0; i < crimeList.size(); ++i) {
            crime = crimeList.get(i);
            if (crime.getAssignedId().equals(assingedId)) {
                System.out.println("ID already associated with another Case");
                return false;
            }
        }
        return true;
    }

    /**
     * displays the crime associated with the already checked id
     * 
     * @param assignedID String id associated with crime
     */
    public static void dispCrime(String assignedID) {

    }

    /**
     * method that checks to see if officer exists should be used in the process of
     * creating crime with regards to officer first on scene
     * 
     * @param badgeNumber
     * @return true if officer exists, allowing that test to pass false if officer
     *         doesn't exist in system, not allowing for the creation of a crime
     */
    public static boolean existingOfficer(String id) {
        officers = Officers.getInstance();
        ArrayList<Officer> officerList = officers.getOfficers();
        for (int i = 0; i < officerList.size(); ++i) {
            officer = officerList.get(i);
            System.out.println(officer.getId());
            if (officer.getId().equals(UUID.fromString(id))) {
                // officer found
                return true;
            }
        }
        System.out.println("Officer not found");
        return false;
    }

    /**
     * method that checks to see if detective exists should be used in the process
     * of creating crime with regards to detective of the case
     * 
     * @param id
     * @return true, if detective exists in system. false, if detevtive doesn't
     *         exist inside of system.
     */
    public static boolean existingDetective(String id) {
        detectives = Detectives.getInstance();
        ArrayList<Detective> detectiveList = detectives.getDetectives();
        for (int i = 0; i < detectiveList.size(); ++i) {
            detective = detectiveList.get(i);
            if (detective.getId().equals(UUID.fromString(id))) {
                // detective found
                return true;
            }
        }
        System.out.println("Detective not found");
        return false;
    }

    /**
     * Method to check if an existing crime is in database
     * 
     * @param caseNum
     * @return true if found false if not found
     */
    public static boolean existingCrime(int caseNum) {
        crimes = Crimes.getInstance();
        ArrayList<Crime> crimeList = crimes.getCrimes();
        for (int i = 0; i < crimes.getCrimes().size(); ++i) {
            crime = crimeList.get(i);
            if (crime.getCaseNumber() == (caseNum)) {
                crime.printCrime();
                System.out.println("Would you like to write the crime to a txt file?");
                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("yes")) {
                    crime.writeCrime();
                }
                return true;
            }
        }
        return false;
    }

    public static void writeToTxt(int caseNum) {
        if (existingCrime(caseNum)) {
            crimes = Crimes.getInstance();
            ArrayList<Crime> crimeList = crimes.getCrimes();
            for (int i = 0; i < crimes.getCrimes().size(); ++i) {
                crime = crimeList.get(i);
                if (crime.getCaseNumber() == (caseNum)) {
                    crime.writeCrime();
                }
            }
        }
    }
}
