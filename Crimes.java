import java.util.ArrayList;

public class Crimes {
    private static Crimes crimes = null;
    private static ArrayList<Crime> crimeList = new ArrayList<>();

    private Crimes() {
        crimeList = DataLoader.loadCrimes();
    }

    public static Crimes getInstance() {
        if (crimes == null) {
            crimes = new Crimes();
        }
        return crimes;
    }

    public ArrayList<Crime> getCrimes() {
        return crimeList;
    }

    public void addCrime(int caseNumber, TypesOfCrimes type, String description, String date, String address,
            String assignedId) {
        crimeList.add(new Crime(caseNumber, type, description, date, address, assignedId));
        DataWriter.saveCrimes();
    }

    public void addCrime(Crime crime) {
        crimeList.add(crime);
        DataWriter.saveCrimes();
    }

    public static Crime search(int caseNumber) {
        ArrayList<Crime> crimes = Crimes.getInstance().getCrimes();
        for (Crime crime : crimes)
            if (crime.getCaseNumber() == caseNumber)
                return crime;

        System.out.println("Crime NOT found. Search for another case #");
        return null;
    }
}
