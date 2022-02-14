// Tested by Reece Peters

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CriminalTest {
    private Criminals criminals = Criminals.getInstance();
    private ArrayList<Criminal> criminalList = criminals.getCriminals();

    @BeforeEach
	public void setup() {
		criminalList.clear();
		// reset, check, add necessary testing parameters
                List<String> convictions = new ArrayList<>(); 
                convictions.add("Harassment");
                convictions.add("Misdimeanor");
        	criminalList.add(new Criminal("Paul", "Humfrey", "7045555555", "42 Sydney St.", "two toes", 32, 146, "5'4", "white", "male", "blue",
                16, "brown", "short", "scruff", "black pants", true, true, "Honda SUV", "l34-a2d", true, convictions));
        	DataWriter.saveCriminals();
	}
	
	@AfterEach
	public void tearDown() {
		Criminals.getInstance().getCriminals().clear();
		DataWriter.saveCriminals();
	}
	
	// test for adding convictions
	@Test
	void testAddConviction() {
        	String conviction = "";
		boolean isConvictionAdded = Criminal.addConviction(conviction);
		assertTrue(isConvictionAdded);
	}

    	@Test
	void testNoConvictionAdded() {
        	String conviction = "";
		boolean isConvictionAdded = Criminal.addConviction(conviction);
		assertFalse(isConvictionAdded);
	}
	
}

