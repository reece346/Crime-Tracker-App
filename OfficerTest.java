// Tested by Tyler Shatley

import java.util.List;
import java.util.UUID;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class OfficerTest {

    @Test
    public void constructorTest() {
        UUID id = UUID.randomUUID();
        String firstName = "Luke";
        String lastName = "Dowd";
        String username = "LMan69";
        String password = "123";
        String precinct = "Phoenix";
        String department = "Police";
        int yearsServed = 1;
        String rank = "cop";
        String badgeNumber = "197583hg3";

        Officer officer = new Officer(id, firstName, lastName, username, password, precinct, department, yearsServed,
                rank, badgeNumber);

        assertEquals(id, officer.getId());
        assertEquals(firstName, officer.getFirstName());
        assertEquals(lastName, officer.getLastName());
        assertEquals(username, officer.getUserName());
        assertEquals(password, officer.getPassword());
        assertEquals(precinct, officer.getPrecinct());
        assertEquals(department, officer.getDepartment());
        assertEquals(yearsServed, officer.getYearsServed());
        assertEquals(badgeNumber, officer.getBadgeNumber());
    }
}
