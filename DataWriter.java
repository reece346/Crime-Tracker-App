import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter extends DataConstants {
    public static void saveAdministrators() {
        Administrators administrators = Administrators.getInstance();
        ArrayList<Administrator> administratorList = administrators.getAdministrators();
        JSONArray jsonAdministrators = new JSONArray();

        // creating all the json objects
        for (int i = 0; i < administratorList.size(); i++) {
            jsonAdministrators.add(getAdministratorJSON(administratorList.get(i)));
        }

        // Write JSON file
        try (FileWriter file = new FileWriter(ADMINISTRATOR_FILE_NAME)) {

            file.write(jsonAdministrators.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static JSONObject getAdministratorJSON(Administrator administrator) {
        JSONObject administratorDetails = new JSONObject();
        administratorDetails.put(ADMINISTRATOR_ID, administrator.getId().toString());
        administratorDetails.put(ADMINISTRATOR_FIRST_NAME, administrator.getFirstName());
        administratorDetails.put(ADMINISTRATOR_LAST_NAME, administrator.getLastName());
        administratorDetails.put(ADMINISTRATOR_USERNAME, administrator.getUserName());
        administratorDetails.put(ADMINISTRATOR_PASSWORD, administrator.getPassword());
        administratorDetails.put(ADMINISTRATOR_PRECINCT, administrator.getPrecinct());
        administratorDetails.put(ADMINISTRATOR_DEPARTMENT, administrator.getDepartment());
        administratorDetails.put(ADMINISTRATOR_PHONE_NUMBER, administrator.getPhoneNumber());
        administratorDetails.put(ADMINISTRATOR_EMAIL, administrator.getEmail());

        return administratorDetails;
    }

    public static void saveOfficers() {
        Officers officers = Officers.getInstance();
        ArrayList<Officer> officerList = officers.getOfficers();
        JSONArray jsonOfficers = new JSONArray();

        // creating all the json objects
        for (int i = 0; i < officerList.size(); i++) {
            jsonOfficers.add(getOfficerJSON(officerList.get(i)));
        }

        // Write JSON file
        try (FileWriter file = new FileWriter(OFFICER_FILE_NAME)) {

            file.write(jsonOfficers.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static JSONObject getOfficerJSON(Officer officer) {
        JSONObject officerDetails = new JSONObject();
        officerDetails.put(OFFICER_ID, officer.getId().toString());
        officerDetails.put(OFFICER_FIRST_NAME, officer.getFirstName());
        officerDetails.put(OFFICER_LAST_NAME, officer.getLastName());
        officerDetails.put(OFFICER_USERNAME, officer.getUserName());
        officerDetails.put(OFFICER_PASSWORD, officer.getPassword());
        officerDetails.put(OFFICER_PRECINCT, officer.getPrecinct());
        officerDetails.put(OFFICER_DEPARTMENT, officer.getDepartment());
        officerDetails.put(OFFICER_YEARS_SERVED, officer.getYearsServed());
        officerDetails.put(OFFICER_RANK, officer.getRank());
        officerDetails.put(OFFICER_BADGE_NUMBER, officer.getBadgeNumber());

        return officerDetails;
    }

    public static void saveDetectives() {
        Detectives detectives = Detectives.getInstance();
        ArrayList<Detective> detectiveList = detectives.getDetectives();
        JSONArray jsonDetectives = new JSONArray();

        // creating all the json objects
        for (int i = 0; i < detectiveList.size(); i++) {
            jsonDetectives.add(getDetectiveJSON(detectiveList.get(i)));
        }

        // Write JSON file
        try (FileWriter file = new FileWriter(DETECTIVE_FILE_NAME)) {

            file.write(jsonDetectives.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static JSONObject getDetectiveJSON(Detective detective) {
        JSONObject detectiveDetails = new JSONObject();
        detectiveDetails.put(DETECTIVE_ID, detective.getId().toString());
        detectiveDetails.put(DETECTIVE_FIRST_NAME, detective.getFirstName());
        detectiveDetails.put(DETECTIVE_LAST_NAME, detective.getLastName());
        detectiveDetails.put(DETECTIVE_USERNAME, detective.getUserName());
        detectiveDetails.put(DETECTIVE_PASSWORD, detective.getPassword());
        detectiveDetails.put(DETECTIVE_PRECINCT, detective.getPrecinct());
        detectiveDetails.put(DETECTIVE_DEPARTMENT, detective.getDepartment());
        detectiveDetails.put(DETECTIVE_YEARS_SERVED, detective.getYearsServed());
        detectiveDetails.put(DETECTIVE_RANK, detective.getRank());
        detectiveDetails.put(DETECTIVE_BADGE_NUMBER, detective.getBadgeNumber());
        detectiveDetails.put(DETECTIVE_ACTIVE_CASES, detective.getActiveCases());
        detectiveDetails.put(DETECTIVE_SOLVED_CASES, detective.getSolvedCases());
        detectiveDetails.put(DETECTIVE_ACTIVE_CASES_LIST, detective.getCaseNumbers());

        return detectiveDetails;
    }

    public static void saveCriminals() {
        Criminals criminals = Criminals.getInstance();
        ArrayList<Criminal> criminalList = criminals.getCriminals();
        JSONArray jsonCriminals = new JSONArray();

        // creating all the json objects
        for (int i = 0; i < criminalList.size(); i++) {
            jsonCriminals.add(getCriminalJSON(criminalList.get(i)));
        }

        // Write JSON file
        try (FileWriter file = new FileWriter(CRIMINAL_FILE_NAME)) {

            file.write(jsonCriminals.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static JSONObject getCriminalJSON(Criminal criminal) {
        JSONObject criminalDetails = new JSONObject();
        criminalDetails.put(CRIMINAL_ID, criminal.getId().toString());
        criminalDetails.put(CRIMINAL_FIRST_NAME, criminal.getFirstName());
        criminalDetails.put(CRIMINAL_LAST_NAME, criminal.getLastName());
        criminalDetails.put(CRIMINAL_DECEASED, criminal.getIsDeceased());
        criminalDetails.put(CRIMINAL_PHONE_NUMBER, criminal.getPhoneNumber());
        criminalDetails.put(CRIMINAL_ADDRESS, criminal.getAddress());
        criminalDetails.put(CRIMINAL_NICK_NAME, criminal.getNickName());
        criminalDetails.put(CRIMINAL_AGE, criminal.getAge());
        criminalDetails.put(CRIMINAL_WEIGHT, criminal.getWeight());
        criminalDetails.put(CRIMINAL_HEIGHT, criminal.getHeight());
        criminalDetails.put(CRIMINAL_RACE, criminal.getRace());
        criminalDetails.put(CRIMINAL_GENDER, criminal.getGender());
        criminalDetails.put(CRIMINAL_EYE_COLOR, criminal.getEyeColor());
        criminalDetails.put(CRIMINAL_SHOE_SIZE, criminal.getShoeSize());
        criminalDetails.put(CRIMINAL_NATURAL_HAIR_COLOR, criminal.getNaturalHairColor());
        criminalDetails.put(CRIMINAL_HAIR_LENGTH, criminal.getHairLength());
        criminalDetails.put(CRIMINAL_FACIAL_HAIR_DESCRIPTION, criminal.getFacialHairDesc());
        criminalDetails.put(CRIMINAL_CLOTHES_DESCRIPTION, criminal.getClothesDesc());
        criminalDetails.put(CRIMINAL_TATTOOED, criminal.isTattooed());
        criminalDetails.put(CRIMINAL_TATTOO_LIST, criminal.getTattoos());
        criminalDetails.put(CRIMINAL_HAS_CAR, criminal.hasCar());
        criminalDetails.put(CRIMINAL_CAR_DESCRIPTION, criminal.getCarDesc());
        criminalDetails.put(CRIMINAL_LICENSE_PLATE_NUM, criminal.getLicense());
        criminalDetails.put(CRIMINAL_IN_JAIL, criminal.isInJail());
        criminalDetails.put(CRIMINAL_CONVICTIONS, criminal.getConvictions());

        return criminalDetails;
    }

    public static void saveSuspects() {
        Suspects suspects = Suspects.getInstance();
        ArrayList<Suspect> suspectList = suspects.getSuspects();
        JSONArray jsonSuspects = new JSONArray();

        // creating all the json objects
        for (int i = 0; i < suspectList.size(); i++) {
            jsonSuspects.add(getSuspectJSON(suspectList.get(i)));
        }

        // Write JSON file
        try (FileWriter file = new FileWriter(SUSPECT_FILE_NAME)) {

            file.write(jsonSuspects.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static JSONObject getSuspectJSON(Suspect suspect) {
        JSONObject suspectDetails = new JSONObject();
        suspectDetails.put(SUSPECT_ID, suspect.getId().toString());
        suspectDetails.put(SUSPECT_FIRST_NAME, suspect.getFirstName());
        suspectDetails.put(SUSPECT_LAST_NAME, suspect.getLastName());
        suspectDetails.put(SUSPECT_DECEASED, suspect.getIsDeceased());
        suspectDetails.put(SUSPECT_PHONE_NUMBER, suspect.getPhoneNumber());
        suspectDetails.put(SUSPECT_ADDRESS, suspect.getAddress());
        suspectDetails.put(SUSPECT_CASE_NUMS, suspect.getCases());
        suspectDetails.put(SUSPECT_NICK_NAME, suspect.getNickName());
        suspectDetails.put(SUSPECT_AGE, suspect.getAge());
        suspectDetails.put(SUSPECT_WEIGHT, suspect.getWeight());
        suspectDetails.put(SUSPECT_HEIGHT, suspect.getHeight());
        suspectDetails.put(SUSPECT_RACE, suspect.getRace());
        suspectDetails.put(SUSPECT_GENDER, suspect.getGender());
        suspectDetails.put(SUSPECT_EYE_COLOR, suspect.getEyeColor());
        suspectDetails.put(SUSPECT_SHOE_SIZE, suspect.getShoeSize());
        suspectDetails.put(SUSPECT_NATURAL_HAIR_COLOR, suspect.getNaturalHairColor());
        suspectDetails.put(SUSPECT_HAIR_LENGTH, suspect.getHairLength());
        suspectDetails.put(SUSPECT_FACIAL_HAIR_DESCRIPTION, suspect.getFacialHairDesc());
        suspectDetails.put(SUSPECT_CLOTHES_DESCRIPTION, suspect.getClothesDesc());
        suspectDetails.put(SUSPECT_TATTOOED, suspect.isTattooed());
        suspectDetails.put(SUSPECT_TATTOO_LIST, suspect.getTattoos());
        suspectDetails.put(SUSPECT_HAS_CAR, suspect.hasCar());
        suspectDetails.put(SUSPECT_CAR_DESCRIPTION, suspect.getCarDesc());
        suspectDetails.put(SUSPECT_LICENSE_PLATE_NUM, suspect.getLicense());
        suspectDetails.put(SUSPECT_REASONS, suspect.getReasons());

        return suspectDetails;
    }

    public static void saveWitnesses() {
        Witnesses witnesses = Witnesses.getInstance();
        ArrayList<Witness> witnessList = witnesses.getWitnesses();
        JSONArray jsonWitnesses = new JSONArray();

        // creating all the json objects
        for (int i = 0; i < witnessList.size(); i++) {
            jsonWitnesses.add(getWitnessJSON(witnessList.get(i)));
        }

        // Write JSON file
        try (FileWriter file = new FileWriter(WITNESS_FILE_NAME)) {

            file.write(jsonWitnesses.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static JSONObject getWitnessJSON(Witness witness) {
        JSONObject witnessDetails = new JSONObject();
        witnessDetails.put(WITNESS_ID, witness.getId().toString());
        witnessDetails.put(WITNESS_FIRST_NAME, witness.getFirstName());
        witnessDetails.put(WITNESS_LAST_NAME, witness.getLastName());
        witnessDetails.put(WITNESS_DECEASED, witness.getIsDeceased());
        witnessDetails.put(WITNESS_PHONE_NUMBER, witness.getPhoneNumber());
        witnessDetails.put(WITNESS_ADDRESS, witness.getAddress());
        witnessDetails.put(WITNESS_PROOF, witness.hasProof());
        witnessDetails.put(WITNESS_STORY, witness.getStory());

        return witnessDetails;
    }

    public static void saveVictims() {
        Victims victims = Victims.getInstance();
        ArrayList<Victim> victimList = victims.getVictims();
        JSONArray jsonVictims = new JSONArray();

        // creating all the json objects
        for (int i = 0; i < victimList.size(); i++) {
            jsonVictims.add(getVictimJSON(victimList.get(i)));
        }

        // Write JSON file
        try (FileWriter file = new FileWriter(VICTIM_FILE_NAME)) {

            file.write(jsonVictims.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static JSONObject getVictimJSON(Victim victim) {
        JSONObject victimDetails = new JSONObject();
        victimDetails.put(VICTIM_ID, victim.getId().toString());
        victimDetails.put(VICTIM_FIRST_NAME, victim.getFirstName());
        victimDetails.put(VICTIM_LAST_NAME, victim.getLastName());
        victimDetails.put(VICTIM_DECEASED, victim.getIsDeceased());
        victimDetails.put(VICTIM_PHONE_NUMBER, victim.getPhoneNumber());
        victimDetails.put(VICTIM_ADDRESS, victim.getAddress());
        victimDetails.put(VICTIM_STORY, victim.getStory());
        victimDetails.put(VICTIM_CRIMINAL_DESCRIPTION, victim.getCriminalDesc());

        return victimDetails;
    }

    public static void saveCrimes() {
        Crimes crimes = Crimes.getInstance();
        ArrayList<Crime> crimeList = crimes.getCrimes();
        JSONArray jsonCrimes = new JSONArray();

        // creating all the json objects
        for (int i = 0; i < crimeList.size(); i++) {
            jsonCrimes.add(getCrimeJSON(crimeList.get(i)));
        }

        // Write JSON file
        try (FileWriter file = new FileWriter(CRIME_FILE_NAME)) {

            file.write(jsonCrimes.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static JSONObject getCrimeJSON(Crime crime) {
        JSONObject crimeDetails = new JSONObject();
        crimeDetails.put(CRIME_CASE_NUMBER, crime.getCaseNumber());
        crimeDetails.put(CRIME_TYPE, crime.getType().toString());
        crimeDetails.put(CRIME_DESCRIPTION, crime.getDescription());
        crimeDetails.put(CRIME_DATE, crime.getDate());
        crimeDetails.put(CRIME_ADDRESS, crime.getAddress());
        crimeDetails.put(CRIME_ASSIGNED_ID, crime.getAssignedId());
        crimeDetails.put(CRIME_CRIMINALS, getPeopleIds((List<Person>) (List<? extends Person>) crime.getCriminals()));
        crimeDetails.put(CRIME_SUSPECTS, getPeopleIds((List<Person>) (List<? extends Person>) crime.getSuspects()));
        crimeDetails.put(CRIME_WITNESSES, getPeopleIds((List<Person>) (List<? extends Person>) crime.getWitnesses()));
        crimeDetails.put(CRIME_VICTIMS, getPeopleIds((List<Person>) (List<? extends Person>) crime.getVictims()));
        crimeDetails.put(CRIME_EVIDENCES, getEvidenceIds(crime.getEvidence()));
        crimeDetails.put(CRIME_IS_SOLVED, crime.getIsSolved());

        return crimeDetails;
    }

    public static void saveEvidences() {
        Evidences evidences = Evidences.getInstance();
        ArrayList<Evidence> evidenceList = evidences.getEvidences();
        JSONArray jsonEvidences = new JSONArray();

        // creating all the json objects
        for (int i = 0; i < evidenceList.size(); i++) {
            jsonEvidences.add(getEvidenceJSON(evidenceList.get(i)));
        }

        // Write JSON file
        try (FileWriter file = new FileWriter(CRIMINAL_FILE_NAME)) {

            file.write(jsonEvidences.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static JSONObject getEvidenceJSON(Evidence evidence) {
        JSONObject evidenceDetails = new JSONObject();
        evidenceDetails.put(EVIDENCE_ID, evidence.getId().toString());
        evidenceDetails.put(EVIDENCE_TYPE, evidence.getType());
        evidenceDetails.put(EVIDENCE_DESCRIPTION, evidence.getDescription());
        evidenceDetails.put(EVIDENCE_AMOUNT, evidence.getAmount());

        return evidenceDetails;
    }

    public static JSONObject getUserJSON(User user) {
        JSONObject userDetails = new JSONObject();
        userDetails.put(OFFICER_ID, user.getId().toString());
        userDetails.put(OFFICER_FIRST_NAME, user.getFirstName());
        userDetails.put(OFFICER_LAST_NAME, user.getLastName());
        userDetails.put(OFFICER_USERNAME, user.getUserName());
        userDetails.put(OFFICER_PASSWORD, user.getPassword());
        userDetails.put(OFFICER_PRECINCT, user.getPrecinct());
        userDetails.put(OFFICER_DEPARTMENT, user.getDepartment());

        return userDetails;
    }

    public static void saveUsers() {
        Users users = Users.getInstance();
        ArrayList<User> userList = users.getUsers();
        JSONArray jsonUsers = new JSONArray();

        // creating all the json objects
        for (int i = 0; i < userList.size(); i++) {
            jsonUsers.add(getUserJSON(userList.get(i)));
        }

        // Write JSON file
        try (FileWriter file = new FileWriter(USER_FILE_NAME)) {

            file.write(jsonUsers.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static JSONArray getPeopleIds(List<Person> people) {
        JSONArray jsonPeople = new JSONArray();
        for (Person person : people) {
            jsonPeople.add(person.getId().toString());
        }

        return jsonPeople;
    }

    private static JSONArray getEvidenceIds(List<Evidence> evidences) {
        JSONArray jsonEvidences = new JSONArray();
        for (Evidence evidence : evidences) {
            jsonEvidences.add(evidence.getId().toString());
        }

        return jsonEvidences;
    }
}
