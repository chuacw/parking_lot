package parking_lot;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class TestCommandQuerySlotForCarColour_ColourNotFound extends TestCommandQuerySlotForCarColour_Base {

	private static String cImpossibleColour = "ThisDoesn'tExist";
	
	private String getSlotForCarColour() {
		BaseCommand lCommand = new CommandQuerySlotForCarColour();
		ArrayList<String> lArgs = new ArrayList<String>();
		lArgs.add(cImpossibleColour);
		String lResult = lCommand.run(lArgs);
		return lResult;
	}
	
	/**
	 * Look for an impossible colour.
	 * The expected result is Not found
	 *  
	 */
	@Test
    public void test() {
		String lShould = "Should have no matches";
		String lExpected = CommandQuerySlotForCarColour.cNotFound;
		String lActual = getSlotForCarColour();
		assertEquals(lShould, lExpected, lActual);
    }

}
