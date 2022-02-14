
/**
 * Victims class
 * used for data processing
 */
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.UUID;

public class Victims {
    private static Victims victims = null;
    private static ArrayList<Victim> victimList = new ArrayList<Victim>();

    private Victims() {
        victimList = DataLoader.loadVictims();
    }

    public static Victims getInstance() {
        if (victims == null) {
            victims = new Victims();
        }
        return victims;
    }

    public ArrayList<Victim> getVictims() {
        return victimList;
    }

    public void addVictim(String firstName, String lastName, String phoneNumber, String address, String story,
            String criminalDesc) {
        victimList.add(new Victim(firstName, lastName, phoneNumber, address, story, criminalDesc));
        DataWriter.saveVictims();
    }

    public void addVictim(Victim victim) {
        victimList.add(victim);
        DataWriter.saveVictims();
    }

    public Victim getVictim(UUID id) {
        for (Victim victim : victimList)
            if (victim.getId().equals(id))
                return victim;
        return null;
    }
}