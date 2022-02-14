
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * A convicted criminal
 */
public class Criminal extends PersonOfInterest {
    private boolean inJail;
    private List<String> convictions;

    /**
     * Constructor for creating a criminal object
     */
    public Criminal() {

    }

    public Criminal(String firstName, String lastName, String phoneNumber, String address, String nickName, int age,
            int weight, String height, String race, String gender, String eyeColor, double shoeSize,
            String naturalHairColor, String hairLength, String facialHairDesc, String clothesDesc, boolean tattoed,
            boolean hasCar, String carDescription, String licensePlate, boolean inJail) {
        super(firstName, lastName, phoneNumber, address, nickName, age, weight, height, race, gender, eyeColor,
                shoeSize, naturalHairColor, hairLength, facialHairDesc, clothesDesc, tattoed, hasCar, carDescription,
                licensePlate);
        this.inJail = inJail;
        this.convictions = new ArrayList<>();
    }

    // Helps retrieve actual UUID and not create another random one
    public Criminal(UUID id, String firstName, String lastName, boolean deceased, String phoneNumber, String address,
            String nickName, int age, int weight, String height, String race, String gender, String eyeColor,
            double shoeSize, String naturalHairColor, String hairLength, String facialHairDesc, String clothesDesc,
            boolean tattoed, ArrayList<String> tattooes, boolean hasCar, String carDescription, String licensePlate,
            boolean inJail, ArrayList<String> convictions) {
        super(id, firstName, lastName, deceased, phoneNumber, address, nickName, age, weight, height, race, gender,
                eyeColor, shoeSize, naturalHairColor, hairLength, facialHairDesc, clothesDesc, tattoed, tattooes,
                hasCar, carDescription, licensePlate);
        this.inJail = inJail;
        this.convictions = convictions;
    }

    // getters ---------------------------------------------------

    /**
     * 
     * @return
     */
    public boolean isInJail() {
        return this.inJail;
    }

    /**
     * 
     * @return
     */
    public List<String> getConvictions() {
        return this.convictions;
    }

    // setters ---------------------------------------------------

    /**
     * 
     * @param jailed
     */
    public void setInJail(boolean jailed) {
        this.inJail = jailed;
    }

    /**
     * 
     * @param convictions
     */
    public void setConvictions(List<String> convictions) {
        this.convictions = convictions;
    }

    /**
     * Adding convictions to a criminal
     * 
     * @param conviction to add to criminal
     */
    public void addConvictions(String conviction) {
        convictions.add(conviction);
    }

    public void displayCriminal() {
        System.out.println("ID: " + getId() + "\n" + "First Name: " + getFirstName() + "\n" + "Last Name: "
                + getLastName() + "\n" + "Deceased: " + getIsDeceased() + "\n" + "Phone Number: " + getPhoneNumber()
                + "\n" + "Address: " + getAddress() + "\n" + "Nick Name: " + getNickName() + "\n" + "Age: " + getAge()
                + "\n" + "Weight: " + getWeight() + "\n" + "Height: " + getHeight() + "\n" + "Race: " + getRace() + "\n"
                + "Shoe Size: " + getShoeSize() + "\n" + "Hair Color: " + getNaturalHairColor() + "\n" + "Hair Length: "
                + getHairLength() + "\n" + "Facial Hair: " + getFacialHairDesc() + "\n" + "Clothes: " + getClothesDesc()
                + "\n" + "Tattoed: " + isTattooed());
        displayTattoos();
        System.out.println("Has vehicle: " + hasCar() + "\n" + "Car Description: " + getCarDesc() + "\n"
                + "License Plate: " + getLicense() + "\n" + "In Jail: " + isInJail());
        displayConvictions();
        System.out.println("***************************");
    }

    public void displayTattoos() {
        System.out.println("Tattoos:");
        for (String tattoo : getTattoos())
            System.out.println(tattoo);
    }

    public void displayConvictions() {
        System.out.println("Convictions:");
        for (String conviction : getConvictions())
            System.out.println(conviction);
    }
}
