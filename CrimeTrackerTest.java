// Tested by Tyler Shatley and Petros Yiannikouros

import static org.junit.jupiter.api.Assertions.*;
//import org.junit.Test;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CrimeTrackerTest {
    // User Test
    @Test
    public void testLoginExistingAccountUser() {
        String userName = "bigMike69";
        String password = "asedf";
        boolean isLoggedIn = CrimeTracker.loginAccountUser(userName, password);
        assertTrue(isLoggedIn);
    }

    @Test
    public void testLoginInvalidAccountUser() {
        String userName = "";
        String password = "";
        boolean isLoggedIn = CrimeTracker.loginAccountUser(userName, password);
        assertFalse(isLoggedIn);
    }

    @Test
    public void testLoginNullAccountUser() {
        String userName = null;
        String password = null;
        boolean isLoggedIn = CrimeTracker.loginAccountUser(userName, password);
        assertFalse(isLoggedIn);
    }

    // Detective Test
    @Test
    public void testLoginExistingAccountDetective() {
        String userName = "shortstalky";
        String password = "baldman12";
        boolean isLoggedIn = CrimeTracker.loginAccountDetective(userName, password);
        assertTrue(isLoggedIn);
    }

    @Test
    public void testLoginInvalidAccountDetective() {
        String userName = "";
        String password = "";
        boolean isLoggedIn = CrimeTracker.loginAccountDetective(userName, password);
        assertFalse(isLoggedIn);
    }

    @Test
    public void testLoginInvalidNullDetective() {
        String userName = null;
        String password = null;
        boolean isLoggedIn = CrimeTracker.loginAccountDetective(userName, password);
        assertFalse(isLoggedIn);
    }

    // Officer Test
    @Test
    public void testLoginExistingAccountOfficer() {
        String userName = "WopRe";
        String password = "offy246";
        boolean isLoggedIn = CrimeTracker.loginAccountOfficer(userName, password);
        assertTrue(isLoggedIn);
    }

    @Test
    public void testLoginInvalidAccountOfficer() {
        String userName = "";
        String password = "";
        boolean isLoggedIn = CrimeTracker.loginAccountOfficer(userName, password);
        assertFalse(isLoggedIn);
    }

    @Test
    public void testLoginNullAccountOfficer() {
        String userName = null;
        String password = null;
        boolean isLoggedIn = CrimeTracker.loginAccountOfficer(userName, password);
        assertFalse(isLoggedIn);
    }

    @Test
    public void testExistingUserName() {
        assertFalse(CrimeTracker.existingUserName("bigMike69"));
    }

    @Test
    public void testNonExistingUserName() {
        assertTrue(CrimeTracker.existingUserName("nikkiminaj"));
    }

    @Test
    public void testValidEmail() {
        assertTrue(CrimeTracker.validEmail("shatleymtyler@gmail.com"));
    }

    @Test
    public void testInvalidEmail() {
        assertTrue(CrimeTracker.validEmail("shatleymtyler@gmail.com"));
    }
}