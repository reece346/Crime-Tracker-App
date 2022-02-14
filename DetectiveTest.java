// Tested by Tyler Shatley

import java.util.List;
import java.util.UUID;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

public class DetectiveTest {

    @Test
    public void constructorTest() {

        UUID id = UUID.randomUUID();
        String firstName = "Bob";
        String lastName = "Anthony";
        String username = "BigBob69";
        String password = "321";
        String precinct = "Greenville";
        String department = "Detectives";
        int yearsServed = 6;
        String rank = "Lutienuet";
        String badgeNumber = "19758396765";
        int activeCases = 2;
        int solvedCases = 10;
        List<Integer> caseNumbers = new ArrayList<>();
        caseNumbers.add(100);
        caseNumbers.add(666);

        Detective detective = new Detective(id, firstName, lastName, username, password, precinct, department,
                yearsServed, rank, badgeNumber, activeCases, solvedCases, caseNumbers);

        assertEquals(id, detective.getId());
        assertEquals(firstName, detective.getFirstName());
        assertEquals(lastName, detective.getLastName());
        assertEquals(username, detective.getUserName());
        assertEquals(password, detective.getPassword());
        assertEquals(precinct, detective.getPrecinct());
        assertEquals(department, detective.getDepartment());
        assertEquals(yearsServed, detective.getYearsServed());
        assertEquals(badgeNumber, detective.getBadgeNumber());
        assertEquals(activeCases, detective.getActiveCases());
        assertEquals(solvedCases, detective.getSolvedCases());
        assertEquals(caseNumbers, detective.getCaseNumbers());
    }
}
