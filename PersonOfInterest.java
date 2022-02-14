import java.util.List;
import java.util.UUID;
import java.util.ArrayList;

public abstract class PersonOfInterest extends Person {
    private String nickName;
    private int age;
    private int weight;
    private String height;
    private String race;
    private String gender;
    private String eyeColor;
    private double shoeSize;
    private String naturalHairColor;
    private String hairLength;
    private String facialHairDesc;
    private String clothesDesc;
    private boolean tattooed;
    private List<String> tattoos;
    private boolean hasCar;
    private String carDescription;
    private String licensePlate;

    /**
     * default constructor for POI
     */
    public PersonOfInterest() {

    }

    public PersonOfInterest(String firstName, String lastName, String phoneNumber, String address, String nickName,
            int age, int weight, String height, String race, String gender, String eyeColor, double shoeSize,
            String naturalHairColor, String hairLength, String facialHairDesc, String clothesDesc, boolean tattooed,
            boolean hasCar, String carDescription, String licensePlate) {
        super(firstName, lastName, phoneNumber, address);
        this.nickName = nickName;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.race = race;
        this.gender = gender;
        this.eyeColor = eyeColor;
        this.shoeSize = shoeSize;
        this.naturalHairColor = naturalHairColor;
        this.hairLength = hairLength;
        this.facialHairDesc = facialHairDesc;
        this.clothesDesc = clothesDesc;
        this.tattooed = tattooed;
        this.tattoos = new ArrayList<>();
        this.hasCar = hasCar;
        if (hasCar) {
            this.carDescription = carDescription;
            this.licensePlate = licensePlate;
        } else {
            this.carDescription = "Not known";
            this.licensePlate = "Not known";
        }
    }

    // Helps retrieve actual UUID and not create another random one
    public PersonOfInterest(UUID id, String firstName, String lastName, boolean deceased, String phoneNumber,
            String address, String nickName, int age, int weight, String height, String race, String gender,
            String eyeColor, double shoeSize, String naturalHairColor, String hairLength, String facialHairDesc,
            String clothesDesc, boolean tattooed, ArrayList<String> tattoos, boolean hasCar, String carDescription,
            String licensePlate) {
        super(id, firstName, lastName, deceased, phoneNumber, address);
        this.nickName = nickName;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.race = race;
        this.gender = gender;
        this.eyeColor = eyeColor;
        this.shoeSize = shoeSize;
        this.naturalHairColor = naturalHairColor;
        this.hairLength = hairLength;
        this.facialHairDesc = facialHairDesc;
        this.clothesDesc = clothesDesc;
        this.tattooed = tattooed;
        this.tattoos = tattoos;
        this.hasCar = hasCar;
        if (hasCar) {
            this.carDescription = carDescription;
            this.licensePlate = licensePlate;
        } else {
            this.carDescription = "Not known or N/A";
            this.licensePlate = "Not known or N/A";
        }
    }

    // getter section -----------------------------------------------
    /**
     * 
     * /** get POI's nickname
     * 
     * @return string nickName
     */
    public String getNickName() {
        return this.nickName;
    }

    /**
     * get POI's age
     * 
     * @return int age
     */
    public int getAge() {
        return this.age;
    }

    /**
     * get POI's weight
     * 
     * @return double weight
     */
    public int getWeight() {
        return this.weight;
    }

    /**
     * get POI's height
     * 
     * @return double height
     */
    public String getHeight() {
        return this.height;
    }

    /**
     * get POI's race
     * 
     * @return String race
     */
    public String getRace() {
        return this.race;
    }

    public String getGender() {
        return this.gender;
    }

    public String getEyeColor() {
        return this.eyeColor;
    }

    /**
     * get POI's shoe size
     * 
     * @return shoe size of type double
     */
    public double getShoeSize() {
        return this.shoeSize;
    }

    /**
     * 
     * @return
     */
    public String getNaturalHairColor() {
        return this.naturalHairColor;
    }

    /**
     * 
     * @return
     */
    public String getHairLength() {
        return this.hairLength;
    }

    /**
     * 
     * @return
     */
    public String getFacialHairDesc() {
        return this.facialHairDesc;
    }

    /**
     * 
     * @return
     */
    public String getClothesDesc() {
        return this.clothesDesc;
    }

    /**
     * get status or whether POI is tattoed or not
     * 
     * @return boolean tattooed
     */
    public boolean isTattooed() {
        return this.tattooed;
    }

    /**
     * get list of POI's tattoos
     * 
     * @return ArrayList tattoos
     */
    public List<String> getTattoos() {
        return this.tattoos;
    }

    /**
     * get status of whether POI has car or not
     * 
     * @return boolean hasCar
     */
    public boolean hasCar() {
        return hasCar;
    }

    /**
     * get POI's car specifications
     * 
     * @return String desription of carSpecs
     */
    public String getCarDesc() {
        return this.carDescription;
    }

    /**
     * 
     * @return
     */
    public String getLicense() {
        return this.licensePlate;
    }

    // setter section -----------------------------------------------

    /**
     * set nick name for POI
     * 
     * @param String nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * set age for POI
     * 
     * @param int age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * set weight for POI
     * 
     * @param int weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * set height for POI
     * 
     * @param double height
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * set race for POI
     * 
     * @param String race
     */
    public void setRace(String race) {
        this.race = race;
    }

    public void setShoeSize(double shoeSize) {
        this.shoeSize = shoeSize;
    }

    /**
     * 
     * @param naturalHairColor
     */
    public void setNaturalHairColor(String naturalHairColor) {
        this.naturalHairColor = naturalHairColor;
    }

    /**
     * 
     * @param hairLength
     */
    public void setHairLength(String hairLength) {
        this.hairLength = hairLength;
    }

    /**
     * 
     * @param facialHairDesc
     */
    public void setFacialHairDesc(String facialHairDesc) {
        this.facialHairDesc = facialHairDesc;
    }

    /**
     * 
     * @param clothesDesc
     */
    public void setClothesDesc(String clothesDesc) {
        this.clothesDesc = clothesDesc;
    }

    /**
     * set tattoo status for POI true = tattooed false = no tattoos
     * 
     * @param booleam tattooed
     */
    public void setTattooed(boolean tattooed) {
        this.tattooed = tattooed;
    }

    /**
     * create array list of tatttoos probably not needed an append would be more
     * apporpiate
     * 
     * @param ArrayList tattoos
     */
    public void setTattoos(List<String> tattoos) {
        this.tattoos = tattoos;
    }

    /**
     * set status of wheter POI has a vehicle or not
     * 
     * @param boolean hasCar
     */
    public void setHasCar(boolean hasCar) {
        this.hasCar = hasCar;
    }

    /**
     * set License plate for POI
     * 
     * @param String licensePlate
     */
    public void setCarSpecs(String carSpecs) {
        this.carDescription = carSpecs;
    }

    /**
     * 
     * @param license
     */
    public void setLicense(String license) {
        this.licensePlate = license;
    }

    public void addTattoo(String tattoo) {
        this.tattoos.add(tattoo);
    }
}
