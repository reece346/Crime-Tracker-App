import java.util.ArrayList;

public class Detectives {
    private static Detectives detectives = null;
    private static ArrayList<Detective> detectiveList = new ArrayList<>();

    private Detectives() {
        detectiveList = DataLoader.loadDetectives();
    }

    public static Detectives getInstance() {
        if (detectives == null) {
            detectives = new Detectives();
        }
        return detectives;
    }
    
    public ArrayList<Detective> getDetectives() {
        return detectiveList;
    }

    public void addDetective(String firstName, String lastName, String userName, String password, String precint,
            String department, int yearsServed, String rank, String badgeNumber, int activeCases, int solvedCases) {
        detectiveList.add(new Detective(firstName, lastName, userName, password, precint, department, yearsServed, rank,
                badgeNumber, activeCases, solvedCases));
        DataWriter.saveDetectives();
    }
}
