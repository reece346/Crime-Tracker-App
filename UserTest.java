// Tested by Tyler Shatley

import java.util.List;
import java.util.UUID;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class UserTest {

    @Test
    public void userCreationTest() {
        UUID id = UUID.randomUUID();
        String firstName = "Tyler";
        String lastName = "Shatley";
        String username = "tdawg";
        String password = "111";
        String precinct = "Phoenix";
        String department = "Police";

        User user = new User(id, firstName, lastName, username, password, precinct, department);

        assertEquals(id, user.getId());
        assertEquals(firstName, user.getFirstName());
        assertEquals(lastName, user.getLastName());
        assertEquals(username, user.getUserName());
        assertEquals(password, user.getPassword());
        assertEquals(precinct, user.getPrecinct());
        assertEquals(department, user.getDepartment());
    }

}
