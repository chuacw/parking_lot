package parking_lot;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

/**
 * This tests parking of 3 cars, but 2 with cColour1
 * and checks that when querying status, the plates returned
 * are as expected.
 * 
 * @author chuacw
 *
 */
public class TestCommandQueryPlateForCarColour_ColourFound extends TestCommandQueryPlateForCarColour_Base {

	private String getActualResult() {
		BaseCommand lCommand = new CommandQueryPlateForCarColour();
		ArrayList<String> lArgs = new ArrayList<String>();
		lArgs.add(cColour1);
		String lResult = lCommand.run(lArgs);
		return lResult;
	}
	
	/**
	 * Plate 1 and Plate 3 should be the same colour.
	 * This is encoded in the ancestor class. 
	 */
	@Test
    public void test() {
		String lShould = String.format("Should have 2 %s", cColour1);
		String lExpected = cPlate1 + ", " + cPlate3;
		String lActual = getActualResult();
		assertEquals(lShould, lExpected, lActual);
    }
	
}
