import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Date;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class DataLoader extends DataConstants {

    /**
     * 
     * @return
     */
    public static ArrayList<Officer> loadOfficers() {
        ArrayList<Officer> officers = new ArrayList<Officer>();

        try {
            FileReader reader = new FileReader(OFFICER_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray officersJSON = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < officersJSON.size(); ++i) {
                JSONObject officerJSON = (JSONObject) officersJSON.get(i);
                String id = (String) officerJSON.get(OFFICER_ID);
                UUID idUUID = UUID.fromString(id);
                String firstName = (String) officerJSON.get(OFFICER_FIRST_NAME);
                String lastName = (String) officerJSON.get(OFFICER_LAST_NAME);
                String userName = (String) officerJSON.get(OFFICER_USERNAME);
                String password = (String) officerJSON.get(OFFICER_PASSWORD);
                String precinct = (String) officerJSON.get(OFFICER_PRECINCT);
                String department = (String) officerJSON.get(OFFICER_DEPARTMENT);
                int yearsServed = ((Long) officerJSON.get(OFFICER_YEARS_SERVED)).intValue();
                String rank = (String) officerJSON.get(OFFICER_RANK);
                String badgeNumber = (String) officerJSON.get(OFFICER_BADGE_NUMBER);
                officers.add(new Officer(idUUID, firstName, lastName, userName, password, precinct, department,
                        yearsServed, rank, badgeNumber));
            }
            return officers;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<Detective> loadDetectives() {
        ArrayList<Detective> detectives = new ArrayList<>();

        try {
            FileReader reader = new FileReader(DETECTIVE_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray detectivesJSON = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < detectivesJSON.size(); ++i) {
                JSONObject detectiveJSON = (JSONObject) detectivesJSON.get(i);
                String id = (String) detectiveJSON.get(DETECTIVE_ID);
                UUID idUUID = UUID.fromString(id);
                String firstName = (String) detectiveJSON.get(DETECTIVE_FIRST_NAME);
                String lastName = (String) detectiveJSON.get(DETECTIVE_LAST_NAME);
                String userName = (String) detectiveJSON.get(DETECTIVE_USERNAME);
                String password = (String) detectiveJSON.get(DETECTIVE_PASSWORD);
                String precinct = (String) detectiveJSON.get(DETECTIVE_PRECINCT);
                String department = (String) detectiveJSON.get(DETECTIVE_DEPARTMENT);
                int yearsServed = ((Long) detectiveJSON.get(DETECTIVE_YEARS_SERVED)).intValue();
                String rank = (String) detectiveJSON.get(DETECTIVE_RANK);
                String badgeNumber = (String) detectiveJSON.get(DETECTIVE_BADGE_NUMBER);
                int activeCases = ((Long) detectiveJSON.get(DETECTIVE_ACTIVE_CASES)).intValue();
                int solvedCases = ((Long) detectiveJSON.get(DETECTIVE_SOLVED_CASES)).intValue();
                ArrayList<Integer> caseNumbers = (ArrayList<Integer>) detectiveJSON.get(DETECTIVE_ACTIVE_CASES_LIST);
                detectives.add(new Detective(idUUID, firstName, lastName, userName, password, precinct, department,
                        yearsServed, rank, badgeNumber, activeCases, solvedCases, caseNumbers));
            }
            return detectives;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<Suspect> loadSuspects() {
        ArrayList<Suspect> suspects = new ArrayList<>();

        try {
            FileReader reader = new FileReader(SUSPECT_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray suspectsJSON = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < suspectsJSON.size(); ++i) {
                JSONObject suspectJSON = (JSONObject) suspectsJSON.get(i);
                String id = (String) suspectJSON.get(SUSPECT_ID);
                UUID idUUID = UUID.fromString(id);
                String firstName = (String) suspectJSON.get(SUSPECT_FIRST_NAME);
                String lastName = (String) suspectJSON.get(SUSPECT_LAST_NAME);
                boolean deceased = ((Boolean) suspectJSON.get(SUSPECT_DECEASED)).booleanValue();
                String phoneNumber = (String) suspectJSON.get(SUSPECT_PHONE_NUMBER);
                String address = (String) suspectJSON.get(SUSPECT_ADDRESS);
                ArrayList<String> caseNums = (ArrayList<String>) suspectJSON.get(SUSPECT_CASE_NUMS);
                String nickName = (String) suspectJSON.get(SUSPECT_NICK_NAME);
                int age = ((Long) suspectJSON.get(SUSPECT_AGE)).intValue();
                int weight = ((Long) suspectJSON.get(SUSPECT_WEIGHT)).intValue();
                String height = (String) suspectJSON.get(SUSPECT_HEIGHT);
                String race = (String) suspectJSON.get(SUSPECT_RACE);
                String gender = (String) suspectJSON.get(SUSPECT_GENDER);
                String eyeColor = (String) suspectJSON.get(SUSPECT_EYE_COLOR);
                double shoeSize = ((Double) suspectJSON.get(SUSPECT_SHOE_SIZE)).doubleValue();
                String naturalHairColor = (String) suspectJSON.get(SUSPECT_NATURAL_HAIR_COLOR);
                String hairLength = (String) suspectJSON.get(SUSPECT_HAIR_LENGTH);
                String facialHairDesc = (String) suspectJSON.get(SUSPECT_FACIAL_HAIR_DESCRIPTION);
                String clothesDesc = (String) suspectJSON.get(SUSPECT_CLOTHES_DESCRIPTION);
                boolean tattoed = ((Boolean) suspectJSON.get(SUSPECT_TATTOOED)).booleanValue();
                ArrayList<String> tattooList = (ArrayList<String>) suspectJSON.get(SUSPECT_TATTOO_LIST);
                boolean hasCar = ((Boolean) suspectJSON.get(SUSPECT_HAS_CAR)).booleanValue();
                String carDescription = (String) suspectJSON.get(SUSPECT_CAR_DESCRIPTION);
                String licensePlate = (String) suspectJSON.get(SUSPECT_LICENSE_PLATE_NUM);
                ArrayList<String> reasons = (ArrayList<String>) suspectJSON.get(SUSPECT_REASONS);
                suspects.add(new Suspect(idUUID, firstName, lastName, deceased, phoneNumber, address, nickName, age,
                        weight, height, race, gender, eyeColor, shoeSize, naturalHairColor, hairLength, facialHairDesc,
                        clothesDesc, tattoed, tattooList, hasCar, carDescription, licensePlate, reasons));
            }
            return suspects;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<Criminal> loadCriminals() {
        ArrayList<Criminal> criminals = new ArrayList<>();

        try {
            FileReader reader = new FileReader(CRIMINAL_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray criminalsJSON = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < criminalsJSON.size(); ++i) {
                JSONObject criminalJSON = (JSONObject) criminalsJSON.get(i);
                String id = (String) criminalJSON.get(CRIMINAL_ID);
                UUID idUUID = UUID.fromString(id);
                String firstName = (String) criminalJSON.get(CRIMINAL_FIRST_NAME);
                String lastName = (String) criminalJSON.get(CRIMINAL_LAST_NAME);
                boolean deceased = ((Boolean) criminalJSON.get(CRIMINAL_DECEASED)).booleanValue();
                String phoneNumber = (String) criminalJSON.get(CRIMINAL_PHONE_NUMBER);
                String address = (String) criminalJSON.get(CRIMINAL_ADDRESS);
                ArrayList<String> caseNums = (ArrayList<String>) criminalJSON.get(CRIMINAL_CASE_NUMS);
                String nickName = (String) criminalJSON.get(CRIMINAL_NICK_NAME);
                int age = ((Long) criminalJSON.get(CRIMINAL_AGE)).intValue();
                int weight = ((Long) criminalJSON.get(CRIMINAL_WEIGHT)).intValue();
                String height = (String) criminalJSON.get(CRIMINAL_HEIGHT);
                String race = (String) criminalJSON.get(CRIMINAL_RACE);
                String gender = (String) criminalJSON.get(CRIMINAL_GENDER);
                String eyeColor = (String) criminalJSON.get(CRIMINAL_EYE_COLOR);
                double shoeSize = ((Double) criminalJSON.get(CRIMINAL_SHOE_SIZE)).doubleValue();
                String naturalHairColor = (String) criminalJSON.get(CRIMINAL_NATURAL_HAIR_COLOR);
                String hairLength = (String) criminalJSON.get(CRIMINAL_HAIR_LENGTH);
                String facialHairDesc = (String) criminalJSON.get(CRIMINAL_FACIAL_HAIR_DESCRIPTION);
                String clothesDesc = (String) criminalJSON.get(CRIMINAL_CLOTHES_DESCRIPTION);
                boolean tattoed = ((Boolean) criminalJSON.get(CRIMINAL_TATTOOED)).booleanValue();
                ArrayList<String> tattooList = (ArrayList<String>) criminalJSON.get(CRIMINAL_TATTOO_LIST);
                boolean hasCar = ((Boolean) criminalJSON.get(CRIMINAL_HAS_CAR)).booleanValue();
                String carDescription = (String) criminalJSON.get(CRIMINAL_CAR_DESCRIPTION);
                String licensePlate = (String) criminalJSON.get(CRIMINAL_LICENSE_PLATE_NUM);
                boolean inJail = ((Boolean) criminalJSON.get(CRIMINAL_IN_JAIL)).booleanValue();
                ArrayList<String> convictions = (ArrayList<String>) criminalJSON.get(CRIMINAL_CONVICTIONS);
                criminals.add(new Criminal(idUUID, firstName, lastName, deceased, phoneNumber, address, nickName, age,
                        weight, height, race, gender, eyeColor, shoeSize, naturalHairColor, hairLength, facialHairDesc,
                        clothesDesc, tattoed, tattooList, hasCar, carDescription, licensePlate, inJail, convictions));
            }
            return criminals;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<Victim> loadVictims() {
        ArrayList<Victim> victims = new ArrayList<>();

        try {
            FileReader reader = new FileReader(VICTIM_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray victimsJSON = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < victimsJSON.size(); ++i) {
                JSONObject victimJSON = (JSONObject) victimsJSON.get(i);
                String id = (String) victimJSON.get(VICTIM_ID);
                UUID idUUID = UUID.fromString(id);
                String firstName = (String) victimJSON.get(VICTIM_FIRST_NAME);
                String lastName = (String) victimJSON.get(VICTIM_LAST_NAME);
                boolean deceased = ((Boolean) victimJSON.get(VICTIM_DECEASED)).booleanValue();
                String phoneNumber = (String) victimJSON.get(VICTIM_PHONE_NUMBER);
                String address = (String) victimJSON.get(VICTIM_ADDRESS);
                String story = (String) victimJSON.get(VICTIM_STORY);
                String criminalDesc = (String) victimJSON.get(VICTIM_CRIMINAL_DESCRIPTION);
                victims.add(
                        new Victim(idUUID, firstName, lastName, deceased, phoneNumber, address, story, criminalDesc));
            }
            return victims;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<Witness> loadWitnesses() {
        ArrayList<Witness> witnesses = new ArrayList<>();

        try {
            FileReader reader = new FileReader(WITNESS_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray witnessesJSON = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < witnessesJSON.size(); ++i) {
                JSONObject witnessJSON = (JSONObject) witnessesJSON.get(i);
                String id = (String) witnessJSON.get(WITNESS_ID);
                UUID idUUID = UUID.fromString(id);
                String firstName = (String) witnessJSON.get(WITNESS_FIRST_NAME);
                String lastName = (String) witnessJSON.get(WITNESS_LAST_NAME);
                boolean deceased = ((Boolean) witnessJSON.get(WITNESS_DECEASED)).booleanValue();
                String phoneNumber = (String) witnessJSON.get(WITNESS_PHONE_NUMBER);
                String address = (String) witnessJSON.get(WITNESS_ADDRESS);
                boolean proof = ((Boolean) witnessJSON.get(WITNESS_PROOF)).booleanValue();
                String story = (String) witnessJSON.get(WITNESS_STORY);
                witnesses.add(new Witness(idUUID, firstName, lastName, deceased, phoneNumber, address, proof, story));
                            }
            return witnesses;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<User> loadUsers() {
        ArrayList<User> users = new ArrayList<User>();

        try {
            FileReader reader = new FileReader(USER_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray usersJSON = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < usersJSON.size(); ++i) {
                JSONObject userJSON = (JSONObject) usersJSON.get(i);
                String firstName = (String) userJSON.get(USER_FIRST_NAME);
                String lastName = (String) userJSON.get(USER_LAST_NAME);
                String userName = (String) userJSON.get(USER_USERNAME);
                String password = (String) userJSON.get(USER_PASSWORD);
                String precinct = (String) userJSON.get(USER_PRECINCT);
                String department = (String) userJSON.get(USER_DEPARTMENT);
                users.add(new User(firstName, lastName, userName, password, precinct, department));
            }
            return users;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<Administrator> loadAdministrators() {
        ArrayList<Administrator> admins = new ArrayList<Administrator>();

        try {
            FileReader reader = new FileReader(ADMINISTRATOR_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray adminsJSON = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < adminsJSON.size(); ++i) {
                JSONObject adminJSON = (JSONObject) adminsJSON.get(i);
                String firstName = (String) adminJSON.get(ADMINISTRATOR_FIRST_NAME);
                String lastName = (String) adminJSON.get(ADMINISTRATOR_LAST_NAME);
                String userName = (String) adminJSON.get(ADMINISTRATOR_USERNAME);
                String password = (String) adminJSON.get(ADMINISTRATOR_PASSWORD);
                String precinct = (String) adminJSON.get(ADMINISTRATOR_PRECINCT);
                String department = (String) adminJSON.get(ADMINISTRATOR_DEPARTMENT);
                String phoneNumber = (String) adminJSON.get(ADMINISTRATOR_PHONE_NUMBER);
                String email = (String) adminJSON.get(ADMINISTRATOR_EMAIL);
                admins.add(new Administrator(firstName, lastName, userName, password, precinct, department, phoneNumber,
                        email));
            }
            return admins;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<Crime> loadCrimes() {
        ArrayList<Crime> crimes = new ArrayList<>();

        try {
            FileReader reader = new FileReader(CRIME_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray crimesJSON = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < crimesJSON.size(); ++i) {
                JSONObject crimeJSON = (JSONObject) crimesJSON.get(i);
                int caseNumber = ((Long) crimeJSON.get(CRIME_CASE_NUMBER)).intValue();
                String type = ((String) crimeJSON.get(CRIME_TYPE));
                TypesOfCrimes enumType = TypesOfCrimes.valueOf(type);
                String description = (String) crimeJSON.get(CRIME_DESCRIPTION);
                String date = (String) crimeJSON.get(CRIME_DATE);
                String address = (String) crimeJSON.get(CRIME_ADDRESS);
                String assignedId = (String) crimeJSON.get(CRIME_ASSIGNED_ID);
                JSONArray criminals = (JSONArray) crimeJSON.get(CRIME_CRIMINALS);
                ArrayList<Criminal> criminalList = getCriminals(criminals);
                JSONArray suspects = (JSONArray) crimeJSON.get(CRIME_SUSPECTS);
                ArrayList<Suspect> suspectList = getSuspects(suspects);
                JSONArray witnesses = (JSONArray) crimeJSON.get(CRIME_WITNESSES);
                ArrayList<Witness> witnessList = getWitnesses(witnesses);
                JSONArray victims = (JSONArray) crimeJSON.get(CRIME_VICTIMS);
                ArrayList<Victim> victimList = getVictims(victims);
                JSONArray evidences = (JSONArray) crimeJSON.get(CRIME_EVIDENCES);
                ArrayList<Evidence> evidenceList = getEvidence(evidences);
                boolean isSolved = ((Boolean) crimeJSON.get(CRIME_IS_SOLVED)).booleanValue();
                crimes.add(new Crime(caseNumber, enumType, description, date, address, assignedId, criminalList,
                        suspectList, witnessList, victimList, evidenceList));
            }
            return crimes;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<Evidence> loadEvidences() {
        ArrayList<Evidence> evidence = new ArrayList<>();

        try {
            FileReader reader = new FileReader(EVIDENCE_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray evidencesJSON = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < evidencesJSON.size(); ++i) {
                JSONObject evidenceJSON = (JSONObject) evidencesJSON.get(i);
                String id = (String) evidenceJSON.get(EVIDENCE_ID);
                UUID idUUID = UUID.fromString(id);
                String type = (String) evidenceJSON.get(EVIDENCE_TYPE);
                String description = (String) evidenceJSON.get(EVIDENCE_DESCRIPTION);
                int amount = ((Long) evidenceJSON.get(EVIDENCE_AMOUNT)).intValue();
                evidence.add(new Evidence(idUUID, type, description, amount));
            }
            return evidence;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static ArrayList<Witness> getWitnesses(JSONArray items) {
        if (items == null)
            return null;

        ArrayList<Witness> list = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            UUID id = UUID.fromString((String) items.get(i));
            list.add(Witnesses.getInstance().getWitness(id));
        }

        return list;
    }

    private static ArrayList<Victim> getVictims(JSONArray items) {
        if (items == null)
            return null;

        ArrayList<Victim> list = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            UUID id = UUID.fromString((String) items.get(i));
            list.add(Victims.getInstance().getVictim(id));
        }

        return list;
    }

    private static ArrayList<Criminal> getCriminals(JSONArray items) {
        if (items == null)
            return null;

        ArrayList<Criminal> list = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            UUID id = UUID.fromString((String) items.get(i));
            list.add(Criminals.getInstance().getCriminal(id));
        }

        return list;
    }

    private static ArrayList<Suspect> getSuspects(JSONArray items) {
        if (items == null)
            return null;

        ArrayList<Suspect> list = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            UUID id = UUID.fromString((String) items.get(i));
            list.add(Suspects.getInstance().getSuspect(id));
        }

        return list;
    }

    private static ArrayList<Evidence> getEvidence(JSONArray items) {
        if (items == null)
            return null;

        ArrayList<Evidence> list = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            UUID id = UUID.fromString((String) items.get(i));
            list.add(Evidences.getInstance().getEvidence(id));
        }

        return list;
    }
}