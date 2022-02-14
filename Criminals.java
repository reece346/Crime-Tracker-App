import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Criminals {
    private static Criminals criminals = null;
    private static ArrayList<Criminal> criminalList = new ArrayList<>();

    private Criminals() {
        criminalList = DataLoader.loadCriminals();
    }

    public static Criminals getInstance() {
        if (criminals == null) {
            criminals = new Criminals();
        }
        return criminals;
    }

    public ArrayList<Criminal> getCriminals() {
        return criminalList;
    }

    public void addCriminal(String firstName, String lastName, String phoneNumber, String address, String nickName,
            int age, int weight, String height, String race, String gender, String eyeColor, double shoeSize,
            String naturalHairColor, String hairLength, String facialHairDesc, String clothesDesc, boolean tattoed,
            boolean hasCar, String carSpecs, String licensePlate, boolean inJail) {
        criminalList.add(new Criminal(firstName, lastName, phoneNumber, address, nickName, age, weight, height, race,
                gender, eyeColor, shoeSize, naturalHairColor, hairLength, facialHairDesc, clothesDesc, tattoed, hasCar,
                carSpecs, licensePlate, inJail));
        DataWriter.saveCriminals();
    }

    public Criminal getCriminal(UUID id) {
        for (int i = 0; i < criminalList.size(); i++) {
            Criminal criminal = criminalList.get(i);
            if (criminal.getId().equals(id))
                return criminal;
        }
        return null;
    }

    /**
     * Searches criminal database based on user input
     * 
     * @param tattooQuery search by tattoos
     * @return
     */
    public static ArrayList<Criminal> search(String tattooQuery) {
        return search(tattooQuery, 0, "", "");
    }

    /**
     * Searches criminal database based on user input
     * 
     * @param tattooQuery search by tattoos
     * @param age         search by age
     * @param hairColor   search by hair color
     * @param height      search by height
     * @return
     */
    public static ArrayList<Criminal> search(String tattooQuery, int age, String hairColor, String height) {
        ArrayList<Criminal> criminals = Criminals.getInstance().getCriminals();
        ArrayList<Criminal> results = new ArrayList<>();

        if (!tattooQuery.isEmpty()) {
            for (Criminal criminal : criminals) {
                List<String> tattooes = criminal.getTattoos();
                for (String tattoo : tattooes)
                    if (tattoo.toLowerCase().contains(tattooQuery.toLowerCase()))
                        results.add(criminal);
            }
        }

        if (age > 0 && !hairColor.isEmpty() && !height.isEmpty()) {
            for (Criminal criminal : criminals) {
                if (criminal.getAge() >= age && criminal.getNaturalHairColor().equalsIgnoreCase(hairColor)
                        && criminal.getHeight().equalsIgnoreCase(height))
                    results.add(criminal);
            }
        }

        return results;
    }
}
