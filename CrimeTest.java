// Tested by Rahul Subramanian

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CrimeTest {
	private Crimes crimes = Crimes.getInstance();
	private ArrayList<Crime> crimeList = crimes.getCrimes();

	@BeforeEach
	public void setup() {
		crimeList.clear();
		crimeList.add(new Crime(673, TypesOfCrimes.PERSONAL, "Robbery at gunpoint", "03-30-2021 02:00 - 02:30",
				"Hillview Street", "none"));
		crimeList.add(new Crime(830, TypesOfCrimes.PROPERTY, "Shoplifting conspiracy", "04-04-2021 11:30 - 12:30",
				"3511 Mill Street", "none"));
		DataWriter.saveCrimes();
	}

	@AfterEach
	public void tearDown() {
		Crimes.getInstance().getCrimes().clear();
		DataWriter.saveCrimes();
	}

	@Test
	void testSearchHasValidFirstItem() {
		Crime crime = Crimes.search(673);
		assertEquals("Robbery at gunpoint", crime.getDescription());
	}

	@Test
	void testSearchHasValidLastItem() {
		Crime crime = Crimes.search(830);
		assertEquals("Shoplifting conspiracy", crime.getDescription());
	}

	@Test
	void testSearchHasInValid() {
		Crime crime = Crimes.search(400);
		assertEquals(null, crime);
	}

}