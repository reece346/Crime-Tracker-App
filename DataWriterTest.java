// Tested by Petros Yiannikouros

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataWriterTest {
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

        // Officer Test
        @Test
        void testWritingZeroOfficers() {
                officerList = DataLoader.loadOfficers();
                assertEquals(0, officerList.size());
        }

        @Test
        void testWritingOneOfficer() {
                officerList.add(new Officer("Sam", "Smith", "sammy", "boy1234!", "North Columbia", "State Troopers", 5,
                                "Corporal", "4810"));
                DataWriter.saveOfficers();
                assertEquals("sammy", DataLoader.loadOfficers().get(0).getUserName());
        }

        @Test
        void testWritingFiveOfficers() {
                officerList.add(new Officer("Sam", "Smith", "sammy", "boy1234!", "North Columbia", "State Troopers", 5,
                                "Corporal", "4810"));
                officerList.add(new Officer("Sam", "Smith", "sammy1", "boy1234!", "North Columbia", "State Troopers", 5,
                                "Corporal", "4810"));
                officerList.add(new Officer("Sam", "Smith", "sammy2", "boy1234!", "North Columbia", "State Troopers", 5,
                                "Corporal", "4810"));
                officerList.add(new Officer("Sam", "Smith", "sammy3", "boy1234!", "North Columbia", "State Troopers", 5,
                                "Corporal", "4810"));
                officerList.add(new Officer("Sam", "Smith", "sammy4", "boy1234!", "North Columbia", "State Troopers", 5,
                                "Corporal", "4810"));
                DataWriter.saveOfficers();
                assertEquals("sammy4", DataLoader.loadOfficers().get(4).getUserName());
        }

        @Test
        void testWritingEmptyOfficer() {
                officerList.add(new Officer("", "", "", "!", "", "", 0, "", ""));
                DataWriter.saveOfficers();
                assertEquals("", DataLoader.loadOfficers().get(0).getUserName());
        }

        @Test
        void testWritingNullOfficer() {
                officerList.add(new Officer("", "", null, "!", "", "", 0, "", ""));
                DataWriter.saveOfficers();
                assertEquals(null, DataLoader.loadOfficers().get(0).getUserName());
        }

        // Detective Test
        @Test
        void testWritingZeroDetectives() {
                detectiveList = DataLoader.loadDetectives();
                assertEquals(0, detectiveList.size());
        }

        @Test
        void testWritingOneDetective() {
                detectiveList.add(new Detective("John", "Johnson", "JJshepherd", "csce146", "Downtown Columbia",
                                "County Sherriffs", 15, "Sergeant", "6823", 0, 0));
                DataWriter.saveDetectives();
                assertEquals("JJshepherd", DataLoader.loadDetectives().get(0).getUserName());
        }

        @Test
        void testWritingTwoDetectives() {
                detectiveList.add(new Detective("John", "Johnson", "JJshepherd", "csce146", "Downtown Columbia",
                                "County Sherriffs", 15, "Sergeant", "6823", 0, 0));
                detectiveList.add(new Detective("John", "Johnson", "JJshepherd1", "csce146", "Downtown Columbia",
                                "County Sherriffs", 15, "Sergeant", "6823", 0, 0));
                detectiveList.add(new Detective("John", "Johnson", "JJshepherd2", "csce146", "Downtown Columbia",
                                "County Sherriffs", 15, "Sergeant", "6823", 0, 0));
                detectiveList.add(new Detective("John", "Johnson", "JJshepherd3", "csce146", "Downtown Columbia",
                                "County Sherriffs", 15, "Sergeant", "6823", 0, 0));
                detectiveList.add(new Detective("John", "Johnson", "JJshepherd4", "csce146", "Downtown Columbia",
                                "County Sherriffs", 15, "Sergeant", "6823", 0, 0));
                DataWriter.saveDetectives();
                assertEquals("JJshepherd4", DataLoader.loadDetectives().get(4).getUserName());
        }

        @Test
        void testWritingEmptyDetective() {
                detectiveList.add(new Detective("", "", "", "", "", "", 0, "", "", 0, 0));
                DataWriter.saveDetectives();
                assertEquals("", DataLoader.loadDetectives().get(0).getUserName());
        }

        @Test
        void testWritingNullDetective() {
                detectiveList.add(new Detective("", "", null, "", "", "", 0, "", "", 0, 0));
                DataWriter.saveDetectives();
                assertEquals(null, DataLoader.loadDetectives().get(0).getUserName());
        }

        // Suspect Test
        @Test
        void testWritingZeroSuspects() {
                suspectList = DataLoader.loadSuspects();
                assertEquals(0, suspectList.size());
        }

        @Test
        void testWritingOneSuspect() {
                suspectList.add(new Suspect("Joey", "Pearson", "555-555-3983", "4016 Pooh Bear Lane", "Smokey", 25, 200,
                                "6'1\"", "White", "Male", "Blue", 11.0, "Blonde", "Short", "Clean", "Baggy", true, true,
                                "2004 Honda Civic", "LV9-Z4D"));
                DataWriter.saveSuspects();
                assertEquals("Pearson", DataLoader.loadSuspects().get(0).getLastName());
        }

        @Test
        void testWritingFiveSuspects() {
                suspectList.add(new Suspect("Joey", "Pearson", "555-555-3983", "4016 Pooh Bear Lane", "Smokey", 25, 200,
                                "6'1\"", "White", "Male", "Blue", 11.0, "Blonde", "Short", "Clean", "Baggy", true, true,
                                "2004 Honda Civic", "LV9-Z4D"));
                suspectList.add(new Suspect("Joey", "Pearson1", "555-555-3983", "4016 Pooh Bear Lane", "Smokey", 25,
                                200, "6'1\"", "White", "Male", "Blue", 11.0, "Blonde", "Short", "Clean", "Baggy", true,
                                true, "2004 Honda Civic", "LV9-Z4D"));
                suspectList.add(new Suspect("Joey", "Pearson2", "555-555-3983", "4016 Pooh Bear Lane", "Smokey", 25,
                                200, "6'1\"", "White", "Male", "Blue", 11.0, "Blonde", "Short", "Clean", "Baggy", true,
                                true, "2004 Honda Civic", "LV9-Z4D"));
                suspectList.add(new Suspect("Joey", "Pearson3", "555-555-3983", "4016 Pooh Bear Lane", "Smokey", 25,
                                200, "6'1\"", "White", "Male", "Blue", 11.0, "Blonde", "Short", "Clean", "Baggy", true,
                                true, "2004 Honda Civic", "LV9-Z4D"));
                suspectList.add(new Suspect("Joey", "Pearson4", "555-555-3983", "4016 Pooh Bear Lane", "Smokey", 25,
                                200, "6'1\"", "White", "Male", "Blue", 11.0, "Blonde", "Short", "Clean", "Baggy", true,
                                true, "2004 Honda Civic", "LV9-Z4D"));
                DataWriter.saveSuspects();
                assertEquals("Pearson4", DataLoader.loadSuspects().get(4).getLastName());
        }

        @Test
        void testWritingEmptySuspect() {
                suspectList.add(new Suspect("", "", "", "", "", 0, 0, "", "", "", "", 0.0, "", "", "", "", false, false,
                                "", ""));
                DataWriter.saveSuspects();
                assertEquals("", DataLoader.loadSuspects().get(0).getLastName());
        }

        @Test
        void testWritingNullSuspect() {
                suspectList.add(new Suspect(null, null, "", "", "", 0, 0, "", "", "", "", 0.0, "", "", "", "", false,
                                false, "", ""));
                DataWriter.saveSuspects();
                assertEquals(null, DataLoader.loadSuspects().get(0).getLastName());
        }

        // Criminal Test
        @Test
        void testWritingZeroCriminals() {
                criminalList = DataLoader.loadCriminals();
                assertEquals(0, criminalList.size());
        }

        @Test
        void testWritingOneCriminal() {
                criminalList.add(new Criminal("Benjamin", "Lariviere", "555-746-8803", "419 Broadway Street",
                                "Benchode", 23, 155, "5'5\"", "White", "Male", "Blue", 8.0, "Black", "Short", "Clean",
                                "Varies", true, false, "No car", "AKR-583", true));
                DataWriter.saveCriminals();
                assertEquals("Lariviere", DataLoader.loadCriminals().get(0).getLastName());
        }

        @Test
        void testWritingFiveCriminals() {
                criminalList.add(new Criminal("Benjamin", "Lariviere", "555-746-8803", "419 Broadway Street",
                                "Benchode", 23, 155, "5'5\"", "White", "Male", "Blue", 8.0, "Black", "Short", "Clean",
                                "Varies", true, false, "No car", "AKR-583", true));
                criminalList.add(new Criminal("Benjamin", "Lariviere1", "555-746-8803", "419 Broadway Street",
                                "Benchode", 23, 155, "5'5\"", "White", "Male", "Blue", 8.0, "Black", "Short", "Clean",
                                "Varies", true, false, "No car", "AKR-583", true));
                criminalList.add(new Criminal("Benjamin", "Lariviere2", "555-746-8803", "419 Broadway Street",
                                "Benchode", 23, 155, "5'5\"", "White", "Male", "Blue", 8.0, "Black", "Short", "Clean",
                                "Varies", true, false, "No car", "AKR-583", true));
                criminalList.add(new Criminal("Benjamin", "Lariviere3", "555-746-8803", "419 Broadway Street",
                                "Benchode", 23, 155, "5'5\"", "White", "Male", "Blue", 8.0, "Black", "Short", "Clean",
                                "Varies", true, false, "No car", "AKR-583", true));
                criminalList.add(new Criminal("Benjamin", "Lariviere4", "555-746-8803", "419 Broadway Street",
                                "Benchode", 23, 155, "5'5\"", "White", "Male", "Blue", 8.0, "Black", "Short", "Clean",
                                "Varies", true, false, "No car", "AKR-583", true));
                DataWriter.saveCriminals();
                assertEquals("Lariviere4", DataLoader.loadCriminals().get(4).getLastName());
        }

        @Test
        void testWritingEmptyCriminal() {
                criminalList.add(new Criminal("", "", "", "", "", 0, 0, "", "", "", "", 0.0, "", "", "", "", false,
                                false, "", "", false));
                DataWriter.saveCriminals();
                assertEquals("", DataLoader.loadCriminals().get(0).getLastName());
        }

        @Test
        void testWritingNullCriminal() {
                criminalList.add(new Criminal("", null, "", "", "", 0, 0, "", "", "", "", 0.0, "", "", "", "", false,
                                false, "", "", false));
                DataWriter.saveCriminals();
                assertEquals(null, DataLoader.loadCriminals().get(0).getLastName());
        }

        // Victim Test
        @Test
        void testWritingZeroVictims() {
                victimList = DataLoader.loadVictims();
                assertEquals(0, victimList.size());
        }

        @Test
        void testWritingOneVictim() {
                victimList.add(new Victim("Norris", "Hernandez", "555-695-8005", "3483 Hillview Street",
                                "Was walking back to house and robbed at gunpoint",
                                "Tall and lanky, wearing baggy jeans and a tank-top"));
                DataWriter.saveVictims();
                assertEquals("Hernandez", DataLoader.loadVictims().get(0).getLastName());
        }

        @Test
        void testWritingFiveVictims() {
                victimList.add(new Victim("Norris", "Hernandez", "555-695-8005", "3483 Hillview Street",
                                "Was walking back to house and robbed at gunpoint",
                                "Tall and lanky, wearing baggy jeans and a tank-top"));
                victimList.add(new Victim("Norris", "Hernandez1", "555-695-8005", "3483 Hillview Street",
                                "Was walking back to house and robbed at gunpoint",
                                "Tall and lanky, wearing baggy jeans and a tank-top"));
                victimList.add(new Victim("Norris", "Hernandez2", "555-695-8005", "3483 Hillview Street",
                                "Was walking back to house and robbed at gunpoint",
                                "Tall and lanky, wearing baggy jeans and a tank-top"));
                victimList.add(new Victim("Norris", "Hernandez3", "555-695-8005", "3483 Hillview Street",
                                "Was walking back to house and robbed at gunpoint",
                                "Tall and lanky, wearing baggy jeans and a tank-top"));
                victimList.add(new Victim("Norris", "Hernandez4", "555-695-8005", "3483 Hillview Street",
                                "Was walking back to house and robbed at gunpoint",
                                "Tall and lanky, wearing baggy jeans and a tank-top"));
                DataWriter.saveVictims();
                assertEquals("Hernandez4", DataLoader.loadVictims().get(4).getLastName());
        }

        @Test
        void testWritingEmptyVictim() {
                victimList.add(new Victim("", "", "", "", "", ""));
                DataWriter.saveVictims();
                assertEquals("", DataLoader.loadVictims().get(0).getLastName());
        }

        @Test
        void testWritingNullVictim() {
                victimList.add(new Victim("", null, "", "", "", ""));
                DataWriter.saveVictims();
                assertEquals(null, DataLoader.loadVictims().get(0).getLastName());
        }

        // Witness Test
        @Test
        void testWritingZeroWitnesses() {
                witnessList = DataLoader.loadWitnesses();
                assertEquals(0, witnessList.size());
        }

        @Test
        void testWritingOneWitness() {
                witnessList.add(new Witness("Richard", "Hogan", "555-810-5977", "3308 Tiger Lane", true,
                                "Was across the street and saw the robbery take place"));
                DataWriter.saveWitnesses();
                assertEquals("Hogan", DataLoader.loadWitnesses().get(0).getLastName());
        }

        @Test
        void testWritingFiveWitnesses() {
                witnessList.add(new Witness("Richard", "Hogan", "555-810-5977", "3308 Tiger Lane", true,
                                "Was across the street and saw the robbery take place"));
                witnessList.add(new Witness("Richard", "Hogan1", "555-810-5977", "3308 Tiger Lane", true,
                                "Was across the street and saw the robbery take place"));
                witnessList.add(new Witness("Richard", "Hogan2", "555-810-5977", "3308 Tiger Lane", true,
                                "Was across the street and saw the robbery take place"));
                witnessList.add(new Witness("Richard", "Hogan3", "555-810-5977", "3308 Tiger Lane", true,
                                "Was across the street and saw the robbery take place"));
                witnessList.add(new Witness("Richard", "Hogan4", "555-810-5977", "3308 Tiger Lane", true,
                                "Was across the street and saw the robbery take place"));
                DataWriter.saveWitnesses();
                assertEquals("Hogan4", DataLoader.loadWitnesses().get(4).getLastName());
        }

        @Test
        void testWritingEmptyWitness() {
                witnessList.add(new Witness("", "", "", "", false, ""));
                DataWriter.saveWitnesses();
                assertEquals("", DataLoader.loadWitnesses().get(0).getLastName());
        }

        @Test
        void testWritingNullWitness() {
                witnessList.add(new Witness("", null, "", "", false, ""));
                DataWriter.saveWitnesses();
                assertEquals(null, DataLoader.loadWitnesses().get(0).getLastName());
        }

        // Crime Test
        @Test
        void testWritingZeroCrimes() {
                crimeList = DataLoader.loadCrimes();
                assertEquals(0, crimeList.size());
        }

        @Test
        void testWritingOneCrime() {
                crimeList.add(new Crime(673, TypesOfCrimes.PERSONAL, "Robbery at gunpoint", "03-30-2021 02:00 - 02:30",
                                "Hillview Street", "none"));
                DataWriter.saveCrimes();
                assertEquals(673, DataLoader.loadCrimes().get(0).getCaseNumber());
        }

        @Test
        void testWritingFiveCrimes() {
                crimeList.add(new Crime(673, TypesOfCrimes.PERSONAL, "Robbery at gunpoint", "03-30-2021 02:00 - 02:30",
                                "Hillview Street", "none"));
                crimeList.add(new Crime(674, TypesOfCrimes.PERSONAL, "Robbery at gunpoint", "03-30-2021 02:00 - 02:30",
                                "Hillview Street", "none"));
                crimeList.add(new Crime(675, TypesOfCrimes.PERSONAL, "Robbery at gunpoint", "03-30-2021 02:00 - 02:30",
                                "Hillview Street", "none"));
                crimeList.add(new Crime(676, TypesOfCrimes.PERSONAL, "Robbery at gunpoint", "03-30-2021 02:00 - 02:30",
                                "Hillview Street", "none"));
                crimeList.add(new Crime(677, TypesOfCrimes.PERSONAL, "Robbery at gunpoint", "03-30-2021 02:00 - 02:30",
                                "Hillview Street", "none"));
                DataWriter.saveCrimes();
                assertEquals(677, DataLoader.loadCrimes().get(4).getCaseNumber());
        }

        @Test
        void testWritingEmptyCrime() {
                crimeList.add(new Crime(0, TypesOfCrimes.PERSONAL, "", "", "", ""));
                DataWriter.saveCrimes();
                assertEquals(0, DataLoader.loadCrimes().get(0).getCaseNumber());
        }

        @Test
        void testWritingNullCrime() {
                crimeList.add(new Crime(0, TypesOfCrimes.PERSONAL, null, "", "", ""));
                DataWriter.saveCrimes();
                assertEquals(null, DataLoader.loadCrimes().get(0).getDescription());
        }

        // Evidence Test
        @Test
        void testWritingZeroEvidences() {
                evidenceList = DataLoader.loadEvidences();
                assertEquals(0, evidenceList.size());
        }

        @Test
        void testWritingOneEvidence() {
                evidenceList.add(new Evidence("Camera Footage", "A doorbell camera showing the attack", 1));
                DataWriter.saveEvidences();
                assertEquals("Camera Footage", DataLoader.loadEvidences().get(0).getType());
        }

        @Test
        void testWritingFiveEvidences() {
                evidenceList.add(new Evidence("Camera Footage", "A doorbell camera showing the attack", 1));
                evidenceList.add(new Evidence("Camera Footage1", "A doorbell camera showing the attack", 1));
                evidenceList.add(new Evidence("Camera Footage2", "A doorbell camera showing the attack", 1));
                evidenceList.add(new Evidence("Camera Footage3", "A doorbell camera showing the attack", 1));
                evidenceList.add(new Evidence("Camera Footage4", "A doorbell camera showing the attack", 1));
                DataWriter.saveEvidences();
                assertEquals("Camera Footage4", DataLoader.loadEvidences().get(4).getType());
        }

        @Test
        void testWritingEmptyEvidence() {
                evidenceList.add(new Evidence("", "", 0));
                DataWriter.saveEvidences();
                assertEquals("", DataLoader.loadEvidences().get(0).getType());
        }

        @Test
        void testWritingNullEvidence() {
                evidenceList.add(new Evidence(null, "", 0));
                DataWriter.saveEvidences();
                assertEquals(null, DataLoader.loadEvidences().get(0).getType());
        }
}