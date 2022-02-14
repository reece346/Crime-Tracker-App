// Tested by Reece Peters

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jdk.jfr.Timestamp;


public class VictimTest {

    //test constructors since no functions other than getters and setters
    @Test
	public void constructorTest() {
        String firstName = "Karl";
        String lastName = "Baker";
        String phoneNumber = "9447387622";
        String address = "7223 North End";
        String story = "Laying outside, bag was taken";
        String criminalDesc = "black male, late 30's wearing black mask";


        Victim victim = new Victim(firstName, lastName, phoneNumber, address, 
        story, criminalDesc);
        
        assertEquals(firstName, victim.getFirstName);
        assertEquals(lastName, victim.getLastName);
        assertEquals(phoneNumber, victim.getPhoneNumber);
        assertEquals(address, victim.getAddress);
        assertEquals(story, victim.getStory);
        assertEquals(criminalDesc, victim.getCriminalDesc);
	}

}

