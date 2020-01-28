package exercises.technologytests;

import exercises.technology.Computer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputerTest {

    Computer test_computer;

    @Before
    public void createComputerObject() { test_computer = new Computer("Test", "Computer", 8);}

    @Test
    public void testFirstComputer() {
        assertEquals("Test", test_computer.getBrand());
        assertEquals("Computer", test_computer.getModel());
        assertEquals(8, test_computer.getRam());
        assertEquals(false, test_computer.isFirewallProtected());
    }

    @Test
    public void testInstallFirewall() {
        test_computer.installFirewall();
        assertEquals(true, test_computer.isFirewallProtected());
    }

    @Test
    public void testAddRam() {
        test_computer.addRam(3);
        assertEquals(11, test_computer.getRam());
    }
}
