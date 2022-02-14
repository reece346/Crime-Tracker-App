import java.util.UUID;

/**
 * A witness to a crime. At or near the scene of the crime
 */
public class Witness extends Person {
    private boolean proof;
    private String story;

    /**
     * Constructor of witness object
     */
    public Witness() {

    }

    public Witness(String firstName, String lastName, String phoneNumber, String address, boolean proof, String story) {
        super(firstName, lastName, phoneNumber, address);
        this.proof = proof;
        this.story = story;
    }

    public Witness(UUID id, String firstName, String lastName, boolean deceased, String phoneNumber, String address,
            boolean proof, String story) {
        super(id, firstName, lastName, deceased, phoneNumber, address);
        this.proof = proof;
        this.story = story;
    }

    // getters -----------------------------------------------------

    /**
     * 
     * @return
     */
    public boolean hasProof() {
        return this.proof;
    }

    /**
     * 
     * @return
     */
    public String getStory() {
        return this.story;
    }

    // setters -----------------------------------------------------

    /**
     * 
     * @param familyMembers
     */
    public void setProof(boolean proof) {
        this.proof = proof;
    }

    /**
     * 
     * @param story
     */
    public void setStory(String story) {
        this.story = story;
    }
}
