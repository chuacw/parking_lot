package parking_lot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCommandQuerySlotForCarColour_ColourFound extends TestCommandQuerySlotForCarColour_Base {

	/**
	 * Plate 1 and Plate 3 should be the same colour, so the
	 * expected result should be 1, 3
	 * This is encoded in the ancestor class. 
	 */
	@Test
    public void test() {
		String lShould = "Should have 2 slots";
		String lExpected = "1, 3";
		String lActual = getSlotForCarColour(cColour1);
		assertEquals(lShould, lExpected, lActual);
    }

}
