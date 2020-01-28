package exercises.technologytests;

import exercises.technology.SmartPhone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmartPhoneTest {

    SmartPhone test_smartphone;

    @Before
    public void createSmartPhoneObject() {test_smartphone = new SmartPhone("Test", "SmartPhone", 8, 6.3, false);}

    @Test
    public void testFirstSmartPhone() {
        assertEquals("Test", test_smartphone.getBrand());
        assertEquals("SmartPhone", test_smartphone.getModel());
        assertEquals(8, test_smartphone.getRam());
        assertEquals(6.3, test_smartphone.getDisplay(), .001);
        assertEquals(false, test_smartphone.hasFacebook);
    }

    @Test
    public void testInstallFacebook() {
        test_smartphone.installFacebook(true);
        assertEquals(true, test_smartphone.hasFacebook);
    }
}
