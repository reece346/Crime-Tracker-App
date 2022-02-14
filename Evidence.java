import java.util.UUID;

/**
 * The evidence for each crime
 */
public class Evidence {
    private UUID id;
    private String type;
    private String description;
    private int amount;

    /**
     * Constructor for Evidence object
     */

     public Evidence() {
     }

    public Evidence(String type, String description, int amount) {
        this.id = UUID.randomUUID();
        this.type = type;
        this.description = description;
        this.amount = amount;
    }

    public Evidence(UUID id, String type, String description, int amount) {
        this.id = id;
        this.type = type;
        this.description = description;
        this.amount = amount;
    }

    public UUID getId() {
        return this.id;
    }

    public String getType() {
        return this.type;
    }

    public String getDescription() {
        return this.description;
    }

    public int getAmount() {
        return this.amount;
    }

    /**
     * Only Admin will be able to delete evidence
     */
    private void delete() {
        // future functionality
    }
}
