import java.util.ArrayList;
import java.util.UUID;

public class TestMain {
        public static void main(String[] args) {
                // Suspects suspects = Suspects.getInstance();
                // ArrayList<String> tattoos = new ArrayList<>();
                // tattoos.add("Cobra on left shoulder");
                // tattoos.add("UFC belt on right shoulder");
                // suspects.addSuspect("Sam", "Alvey", "555-8127-8123", "Smiling", 35, 205,
                // "6'2\"", "White", "Male", 14,
                // "Red", "Short", "Scruffy", "Shorts and short shirt", true, true, "2014 Ford
                // Mustang",
                // "Unknown");
                // ArrayList<Criminal> results = Criminals.search("", 30, "black", "6'2\"");
                // for (Criminal criminal : results) {
                // System.out.println(criminal.getId());
                // }

                // Crime crime = Crimes.search(139);
                // for (Evidence evidence : crime.getEvidence())
                // System.out.println(evidence.getDescription());

                // ArrayList<Crime> crimes = Crimes.getInstance().getCrimes();
                // for (Crime crime : crimes)
                // System.out.println(crime.getDate());

                // Detectives test = Detectives.getInstance();
                // // test.getDetectives();
                Crimes crimes = Crimes.getInstance();
                Crime crime = new Crime(100, TypesOfCrimes.PROPERTY, "Theft of X Gaming Console and 20 games",
                                "03-03-2021 19:00", "1725 Harbinson Blvd", "edf66144-0dcb-40d1-b4f2-6cc1d60b1bc6");
                Suspect suspect = new Suspect("", "", "", "", "", 18, 150, "5'9\"", "White", "Male", "Blue", 10,
                                "Brown", "Shoulder", "", "Gray hoodie", false, true, "Blue mini-van", "");
                // "", "", "", "", 18, 150, "5'9\"", "White", "Male", "Blue", 10, "Brown",
                // "Shoulder length", "", "Gray hoodie", false, false, "", ""
                crime.addSuspect(suspect);
                Suspects suspects = Suspects.getInstance();
                suspects.addSuspect(suspect); // can do this in back end as well (Crime class)
                Victim victim = new Victim("Henry", "Clemont", "803-898-7766", "123 Gervais St., Columbia SC, 29210",
                                "Was at the front of the store when the suspect conducted his crime. He said that the man came in with the gun, and Henry hid behind the cash register. He saw him leaving in a blue mini-van.",
                                "");
                crime.addVictim(victim);
                Victims victims = Victims.getInstance();
                victims.addVictim(victim); // can do this in back end as well (Crime class)
                crimes.addCrime(crime);
        }
}
