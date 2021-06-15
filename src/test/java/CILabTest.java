import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    //general use case -- true expected
    @Test
    public void detectCapitalUseTest1() {
        myString.setString("This is the first test String.");
        assertTrue(myString.detectCapitalUse());
    }

    //general use case -- false expected
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("This is the second TEst String.");
        assertFalse(myString.detectCapitalUse());
    }


}
