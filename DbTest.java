/**
 * @author Jared St.Louis, October 17, 2023
 */

// Imports
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The `DbTest` class contains JUnit test cases for the `DatabaseHandler` and `Profile` classes.
 * It tests methods related to writing and reading user data to/from the database, as well as password hashing.
 */
public class DbTest {
    // Attributes
    private static DatabaseHandler dbHandler;
    private static Profile profile;
    public static int counter;


    // Constructor
    public DbTest() {}

    // Methods

    /**
     * BeforeAll method runs once before any test cases in the class.
     * It initializes the dbHandler attribute to null.
     */
    @BeforeAll
    private static void setUp(){
        dbHandler = new DatabaseHandler();
        profile = new Profile();
    }

    /**
     * AfterEach method runs after each individual test case.
     * It increments the counter attribute by 1 and prints the number of tests executed so far.
     */
    @AfterEach
    private void summary(){
        counter++;
        System.out.println("the number of tests: " + counter);
    }

    /**
     * AfterAll method runs once after all test cases in the class.
     * It prints a message indicating that all tests are done.
     */
    @AfterAll
    private static void tearDown(){
        System.out.print("All tests are done");
    }

    
    // Test Cases


    /**
     * Test the writing and reading of user data to and from the database.
     * This test case writes user data to the database and then reads it.
     * It asserts that the stored password is not null.
     */
    @Test
    public void testWriteAndReadUserData() {
        // Test writing user data to the database and then reading it
        String firstName = "John";
        String lastName = "Doe";
        String userName = "testUsername";
        String dateOfBirth = "1990-01-01";
        String password = "password";

        dbHandler.writeUserData(firstName, lastName, userName, dateOfBirth, password);

        // Read the user data and assert that it matches the data written
        String storedPassword = dbHandler.getPasswordbyUsername(userName);

        assertNotNull(storedPassword, "Stored password is null");
    }

    /**
     * Test the password hashing method.
     * This test case checks if the password hashing method in the `Profile` class
     * correctly hashes the plain password and the hashed password is not equal to the plain password.
     */
    @Test
    public void testPasswordHashing() {
        String plainPassword = "mypassword";
        String hashedPassword = profile.hashPassword(plainPassword);

        assertNotNull(hashedPassword);
        assertNotEquals(plainPassword, hashedPassword);
    } 
}
