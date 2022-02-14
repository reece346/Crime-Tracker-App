import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.UUID;

public class Witnesses {
    private static Witnesses witnesses = null;
    private static ArrayList<Witness> witnessList = new ArrayList<Witness>();

    private Witnesses() {
        witnessList = DataLoader.loadWitnesses();
    }

    public static Witnesses getInstance() {
        if (witnesses == null) {
            witnesses = new Witnesses();
        }
        return witnesses;
    }

    public ArrayList<Witness> getWitnesses() {
        return witnessList;
    }

    public void addWitness(String firstName, String lastName, String phoneNumber, String address, boolean proof,
            String story) {
        witnessList.add(new Witness(firstName, lastName, phoneNumber, address, proof, story));
        DataWriter.saveWitnesses();
    }

    public void addWitness(Witness witness) {
        witnessList.add(witness);
        DataWriter.saveWitnesses();
    }

    public Witness getWitness(UUID id) {
        for (Witness witness : witnessList)
            if (witness.getId().equals(id))
                return witness;
        return null;
    }
}