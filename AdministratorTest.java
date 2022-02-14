// Tested by Tyler Shatley

import java.util.List;
import java.util.UUID;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class AdministratorTest {

    @Test
    public void userCreationTest() {
        String firstName = "Landon";
        String lastName = "Dowd";
        String username = "LandonDaBest";
        String password = "198";
        String precinct = "Columiba";
        String department = "Police";
        String phoneNumber = "864-908-9576";
        String email = "landowndowd@gmail.com";

        Administrator admin = new Administrator(firstName, lastName, username, password, precinct, department,
                phoneNumber, email);

        assertEquals(firstName, admin.getFirstName());
        assertEquals(lastName, admin.getLastName());
        assertEquals(username, admin.getUserName());
        assertEquals(password, admin.getPassword());
        assertEquals(precinct, admin.getPrecinct());
        assertEquals(department, admin.getDepartment());
        assertEquals(phoneNumber, admin.getPhoneNumber());
        assertEquals(email, admin.getEmail());
    }

    @Test
    public void testDeleteCrime() {

    }
}
