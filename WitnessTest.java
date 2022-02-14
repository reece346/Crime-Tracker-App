// Tested by Reece Peters

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class WitnessTest {
    //test constructors since no functions other than getters and setters
    @Test
    public void constructorTest() {
        String firstName = "Karie";
        String lastName = "Boogy";
        String phoneNumber = "9443335452";
        String address = "3623 South End";
        boolean proof = true;
        String story = "Saw man robbed by tall man in park";


        Witness witness = new Witness(firstName, lastName, phoneNumber, address, 
            proof, story);
    
        assertEquals(firstName, witness.getFirstName);
        assertEquals(lastName, witness.getLastName);
        assertEquals(phoneNumber, witness.getPhoneNumber);
        assertEquals(address, witness.getAddress);
        assertEquals(proof, witness.hasProof);
        assertEquals(story, witness.getStory);
        
    }
}
