// Tested by Rahul Subramanian

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EvidenceTest {
	private Evidences evidences = Evidences.getInstance();
	private ArrayList<Evidence> evidenceList = evidences.getEvidences();

	@BeforeEach
	public void setup() {
		evidenceList.clear();
		evidenceList.add(new Evidence("Camera Footage", "A doorbell camera showing the attack", 1));
		evidenceList.add(new Evidence("Camera Footage", "Store footage from multiple angles", 3));
		DataWriter.saveEvidences();
	}

	@AfterEach
	public void tearDown() {
		Evidences.getInstance().getEvidences().clear();
		DataWriter.saveEvidences();
	}

	@Test
	void testAddEvidence() {
		String type = "forensic";
		String description = "hair of suspect";
		int amount = 5;
		evidences.addEvidence(type, description, amount);
		assertEquals("Forensic", evidenceList.get(2).getType());
	}

}