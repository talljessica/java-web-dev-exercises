package exercises.technologytests;

import exercises.technology.Laptop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LaptopTest {

    Laptop test_laptop;

    @Before
    public void createLaptopObject() {test_laptop = new Laptop("Test", "Laptop", 8, false, 10, false );}

    @Test
    public void testFirstLaptop() {
        assertEquals("Test", test_laptop.getBrand());
        assertEquals("Laptop", test_laptop.getModel());
        assertEquals(8, test_laptop.getRam());
        assertEquals(false, test_laptop.isFirewallProtected());
        assertEquals(10, test_laptop.getBatteryLife(), .001);
        assertEquals(false, test_laptop.isTouchScreen());
    }

    @Test
    public void testBatteryLifeUsed() {
        assertEquals(3, test_laptop.useLaptop(7), .001);
    }
}
