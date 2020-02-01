package parking_lot;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class TestCommandQueryPlateForCarColour_ColourNotFound extends TestCommandQueryPlateForCarColour_Base {

	private static String cColour3 = "Orange";

	/**
	 * Test for no matches.
	 *  
	 */
	@Test
    public void test() {
		String lShould = "Shouldn't have any matches";
		String lExpected = CommandQueryPlateForCarColour.cNotFound;
		String lActual = queryPlateForCarColour(cColour3);
		assertEquals(lShould, lExpected, lActual);
    }
}
