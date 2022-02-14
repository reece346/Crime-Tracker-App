// Tested by Petros Yiannikouros

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataLoaderTest {
    private Officers officers = Officers.getInstance();
    private ArrayList<Officer> officerList = officers.getOfficers();
    private Detectives detectives = Detectives.getInstance();
    private ArrayList<Detective> detectiveList = detectives.getDetectives();
    private Suspects suspects = Suspects.getInstance();
    private ArrayList<Suspect> suspectList = suspects.getSuspects();
    private Criminals criminals = Criminals.getInstance();
    private ArrayList<Criminal> criminalList = criminals.getCriminals();
    private Victims victims = Victims.getInstance();
    private ArrayList<Victim> victimList = victims.getVictims();
    private Witnesses witnesses = Witnesses.getInstance();
    private ArrayList<Witness> witnessList = witnesses.getWitnesses();
    private Crimes crimes = Crimes.getInstance();
    private ArrayList<Crime> crimeList = crimes.getCrimes();
    private Evidences evidences = Evidences.getInstance();
    private ArrayList<Evidence> evidenceList = evidences.getEvidences();

    @BeforeEach
    public void setup() {
        officerList.clear();
        detectiveList.clear();
        suspectList.clear();
        criminalList.clear();
        victimList.clear();
        witnessList.clear();
        crimeList.clear();
        evidenceList.clear();
        officerList.add(new Officer("Sam", "Smith", "sammy", "boy1234!", "North Columbia", "State Troopers", 5,
                "Corporal", "4810"));
        officerList.add(new Officer("Keenan", "Stone", "kstone", "mountian56", "West Columbia", "City Police", 3,
                "Deputy", "6918"));
        detectiveList.add(new Detective("John", "Johnson", "JJshepherd", "csce146", "Downtown Columbia",
                "County Sherriffs", 15, "Sergeant", "6823", 0, 0));
        detectiveList.add(new Detective("Chris", "Farley", "kungfu", "fighting", "Uptown Columbia", "DEA", 13, "Chief",
                "8401", 0, 0));
        suspectList.add(new Suspect("Joey", "Pearson", "555-555-3983", "4016 Pooh Bear Lane", "Smokey", 25, 200,
                "6'1\"", "White", "Male", "Blue", 11.0, "Blonde", "Short", "Clean", "Baggy", true, true,
                "2004 Honda Civic", "LV9-Z4D"));
        suspectList.add(new Suspect("Vincent", "Howard", "555-717-4475", "465 Camden Place", "Killer", 30, 260, "6'7\"",
                "White", "Male", "Brown", 17.0, "Brown", "To shoulders", "Scruffy", "Varies", true, true,
                "2012 Dodge Charger", "NRK-385"));
        criminalList.add(new Criminal("Benjamin", "Lariviere", "555-746-8803", "419 Broadway Street", "Benchode", 23,
                155, "5'5\"", "White", "Male", "Blue", 8.0, "Black", "Short", "Clean", "Varies", true, false, "No car",
                "No car", true));
        criminalList.add(new Criminal("Daniel", "Lindquist", "555-840-5240", "230 Emily Drive", "The German", 44, 300,
                "6'0\'", "White", "Male", "Blue", 10.0, "Blonde", "Short", "Long Beard", "Raggedy", false, true,
                "2015 Mercedes AMG", "KRW-484", false));
        victimList.add(new Victim("Norris", "Hernandez", "555-695-8005", "3483 Hillview Street",
                "Was walking back to house and robbed at gunpoint",
                "Tall and lanky, wearing baggy jeans and a tank-top"));
        victimList.add(new Victim("Kelly", "Major", "555-200-6535", "2997 Mill Street",
                "Saw group of people shoplift in her store", "Sent us the camera footage"));
        witnessList.add(new Witness("Richard", "Hogan", "555-810-5977", "3308 Tiger Lane", true,
                "Was across the street and saw the robbery take place"));
        witnessList.add(new Witness("Georgianna", "Schell", "555-357-2047", "3138 Wexford Way", true,
                "Was in the store, saw and overheard the plan to shoplift"));
        crimeList.add(new Crime(673, TypesOfCrimes.PERSONAL, "Robbery at gunpoint", "03-30-2021 02:00 - 02:30",
                "Hillview Street", "none"));
        crimeList.add(new Crime(830, TypesOfCrimes.PROPERTY, "Shoplifting conspiracy", "04-04-2021 11:30 - 12:30",
                "3511 Mill Street", "none"));
        evidenceList.add(new Evidence("Camera Footage", "A doorbell camera showing the attack", 1));
        evidenceList.add(new Evidence("Camera Footage", "Store footage from multiple angles", 3));
        DataWriter.saveOfficers();
        DataWriter.saveDetectives();
        DataWriter.saveSuspects();
        DataWriter.saveCriminals();
        DataWriter.saveVictims();
        DataWriter.saveWitnesses();
        DataWriter.saveCrimes();
        DataWriter.saveEvidences();
    }

    @AfterEach
    public void tearDown() {
        Officers.getInstance().getOfficers().clear();
        Detectives.getInstance().getDetectives().clear();
        Suspects.getInstance().getSuspects().clear();
        Criminals.getInstance().getCriminals().clear();
        Victims.getInstance().getVictims().clear();
        Witnesses.getInstance().getWitnesses().clear();
        Crimes.getInstance().getCrimes().clear();
        Evidences.getInstance().getEvidences().clear();
        DataWriter.saveOfficers();
        DataWriter.saveDetectives();
        DataWriter.saveSuspects();
        DataWriter.saveCriminals();
        DataWriter.saveVictims();
        DataWriter.saveWitnesses();
        DataWriter.saveCrimes();
        DataWriter.saveEvidences();
    }

    // Officer test sections
    @Test
    void testGetOfficersSize() {
        officerList = DataLoader.loadOfficers();
        assertEquals(2, officerList.size());
    }

    @Test
    void testGetOfficersSizeZero() {
        Officers.getInstance().getOfficers().clear();
        DataWriter.saveOfficers();
        assertEquals(0, officerList.size());
    }

    @Test
    void testGetOfficerFirstName() {
        officerList = DataLoader.loadOfficers();
        assertEquals("Sam", officerList.get(0).getFirstName());
    }

    // Detective test sections
    @Test
    void testGetDetectivesSize() {
        detectiveList = DataLoader.loadDetectives();
        assertEquals(2, detectiveList.size());
    }

    @Test
    void testGetDetectivesSizeZero() {
        Detectives.getInstance().getDetectives().clear();
        DataWriter.saveDetectives();
        assertEquals(0, detectiveList.size());
    }

    @Test
    void testGetDetectiveFirstName() {
        detectiveList = DataLoader.loadDetectives();
        assertEquals("John", detectiveList.get(0).getFirstName());
    }

    // Suspect test sections
    @Test
    void testGetSuspectsSize() {
        suspectList = DataLoader.loadSuspects();
        assertEquals(2, suspectList.size());
    }

    @Test
    void testGetSuspectsSizeZero() {
        Suspects.getInstance().getSuspects().clear();
        DataWriter.saveSuspects();
        assertEquals(0, suspectList.size());
    }

    @Test
    void testGetSuspectFirstName() {
        suspectList = DataLoader.loadSuspects();
        assertEquals("Joey", suspectList.get(0).getFirstName());
    }

    // Criminal test sections
    @Test
    void testGetCriminalsSize() {
        criminalList = DataLoader.loadCriminals();
        assertEquals(2, criminalList.size());
    }

    @Test
    void testGetCriminalsSizeZero() {
        Criminals.getInstance().getCriminals().clear();
        DataWriter.saveCriminals();
        ;
        assertEquals(0, criminalList.size());
    }

    @Test
    void testGetCriminalFirstName() {
        criminalList = DataLoader.loadCriminals();
        assertEquals("Benjamin", criminalList.get(0).getFirstName());
    }

    // Victim test sections
    @Test
    void testGetVictimsSize() {
        victimList = DataLoader.loadVictims();
        assertEquals(2, victimList.size());
    }

    @Test
    void testGetVictimsSizeZero() {
        Victims.getInstance().getVictims().clear();
        DataWriter.saveVictims();
        ;
        assertEquals(0, victimList.size());
    }

    @Test
    void testGetVictimFirstName() {
        victimList = DataLoader.loadVictims();
        assertEquals("Norris", victimList.get(0).getFirstName());
    }

    // Witness test sections
    @Test
    void testGetWitnessesSize() {
        witnessList = DataLoader.loadWitnesses();
        assertEquals(2, witnessList.size());
    }

    @Test
    void testGetWitnessesSizeZero() {
        Witnesses.getInstance().getWitnesses().clear();
        DataWriter.saveWitnesses();
        ;
        assertEquals(0, witnessList.size());
    }

    @Test
    void testGetWitnessFirstName() {
        witnessList = DataLoader.loadWitnesses();
        assertEquals("Richard", witnessList.get(0).getFirstName());
    }

    // Crime test sections
    @Test
    void testGetCrimesSize() {
        crimeList = DataLoader.loadCrimes();
        assertEquals(2, crimeList.size());
    }

    @Test
    void testGetCrimesSizeZero() {
        Crimes.getInstance().getCrimes().clear();
        DataWriter.saveCrimes();
        assertEquals(0, crimeList.size());
    }

    @Test
    void testGetCrimeCaseNumber() {
        crimeList = DataLoader.loadCrimes();
        assertEquals(673, crimeList.get(0).getCaseNumber());
    }

    // Evidence test sections
    @Test
    void testGetEvidenceseSize() {
        evidenceList = DataLoader.loadEvidences();
        assertEquals(2, evidenceList.size());
    }

    @Test
    void testGetEvidencesSizeZero() {
        Evidences.getInstance().getEvidences().clear();
        DataWriter.saveEvidences();
        assertEquals(0, evidenceList.size());
    }

    @Test
    void testGetEvidenceType() {
        evidenceList = DataLoader.loadEvidences();
        assertEquals("Camera Footage", evidenceList.get(0).getType());
    }
}