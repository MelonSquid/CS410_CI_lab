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
        myString.setString("Have you tried setting it to Wumbo?");
        assertTrue(myString.detectCapitalUse());
    }

    //general use case -- false expected
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("HaVe yOu TrIeD sEtTiNg It To WuMbO?");
        assertFalse(myString.detectCapitalUse());
    }

    //tests all caps and only leading letter capped
    @Test
    public void detectCapitalUseTest3() {
        myString.setString("HAVE YOU tried SETTING IT To wumbo?");
        assertTrue(myString.detectCapitalUse());
    }

}
