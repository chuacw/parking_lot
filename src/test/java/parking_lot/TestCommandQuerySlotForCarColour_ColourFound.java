package parking_lot;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class TestCommandQuerySlotForCarColour_ColourFound extends TestCommandQuerySlotForCarColour_Base {

	private String getSlotForCarColour() {
		BaseCommand lCommand = new CommandQuerySlotForCarColour();
		ArrayList<String> lArgs = new ArrayList<String>();
		lArgs.add(cColour1);
		String lResult = lCommand.run(lArgs);
		return lResult;
	}
	
	/**
	 * Plate 1 and Plate 3 should be the same colour, so the
	 * expected result should be 1, 3
	 * This is encoded in the ancestor class. 
	 */
	@Test
    public void test() {
		String lShould = "Should have 2 slots";
		String lExpected = "1, 3";
		String lActual = getSlotForCarColour();
		assertEquals(lShould, lExpected, lActual);
    }

}
