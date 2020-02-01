package parking_lot;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class TestCommandQueryPlateForCarColour_ColourNotFound extends TestCommandQueryPlateForCarColour_Base {

	private static String cColour3 = "Orange";

	private String queryPlateForCarColour() {
		BaseCommand lCommand = new CommandQueryPlateForCarColour();
		ArrayList<String> lArgs = new ArrayList<String>();
		lArgs.add(cColour3);
		String lResult = lCommand.run(lArgs);
		return lResult;
	}
	
	/**
	 * Test for no matches.
	 *  
	 */
	@Test
    public void test() {
		String lShould = "Shouldn't have any matches";
		String lExpected = CommandQueryPlateForCarColour.cNotFound;
		String lActual = queryPlateForCarColour();
		assertEquals(lShould, lExpected, lActual);
    }
}
