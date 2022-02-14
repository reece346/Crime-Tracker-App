import java.util.ArrayList;
import java.util.UUID;

public class Suspects {
    private static Suspects suspects = null;
    private static ArrayList<Suspect> suspectList = new ArrayList<>();

    private Suspects() {
        suspectList = DataLoader.loadSuspects();
    }

    public static Suspects getInstance() {
        if (suspects == null) {
            suspects = new Suspects();
        }
        return suspects;
    }

    public ArrayList<Suspect> getSuspects() {
        return suspectList;
    }

    public void addSuspect(String firstName, String lastName, String phoneNumber, String address, String nickName,
            int age, int weight, String height, String race, String gender, String eyeColor, double shoeSize,
            String naturalHairColor, String hairLength, String facialHairDesc, String clothesDesc, boolean tattoed,
            boolean hasCar, String carSpecs, String licensePlate) {
        suspectList.add(new Suspect(firstName, lastName, phoneNumber, address, nickName, age, weight, height, race,
                gender, eyeColor, shoeSize, naturalHairColor, hairLength, facialHairDesc, clothesDesc, tattoed, hasCar,
                carSpecs, licensePlate));
        DataWriter.saveSuspects();
    }

    public void addSuspect(Suspect suspect) {
        suspectList.add(suspect);
        DataWriter.saveSuspects();
    }

    public Suspect getSuspect(UUID id) {
        for (Suspect suspect : suspectList)
            if (suspect.getId().equals(id))
                return suspect;
        return null;
    }
}
