package org.launchcode.java.demos.lsn6inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HouseCatTest {
    @Test
    public void inheritsSuperInFirstConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        assertEquals(7, keyboardCat.getWeight(), .001);
    }

    @Test
    public void inheritsDefaultCatInSecondConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat");
        assertEquals(13, keyboardCat.getWeight(), .001);
    }
}
