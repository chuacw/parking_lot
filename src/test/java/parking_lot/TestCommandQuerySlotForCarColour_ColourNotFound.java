package parking_lot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCommandQuerySlotForCarColour_ColourNotFound extends TestCommandQuerySlotForCarColour_Base {

	private static String cImpossibleColour = "ThisDoesn'tExist";
	
	/**
	 * Look for an impossible colour.
	 * The expected result is Not found
	 *  
	 */
	@Test
    public void test() {
		String lShould = "Should have no matches";
		String lExpected = CommandQuerySlotForCarColour.cNotFound;
		String lActual = getSlotForCarColour(cImpossibleColour);
		assertEquals(lShould, lExpected, lActual);
    }

}
