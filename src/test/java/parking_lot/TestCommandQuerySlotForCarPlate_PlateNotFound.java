package parking_lot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCommandQuerySlotForCarPlate_PlateNotFound extends TestCommandQuerySlotForCarPlate_Base {

	/**
	 * Query the slot for an impossible plate.
	 * The expected answer should be Not found. 
	 */
	@Test
    public void test() {
		String lShould = "Should be not found";
		String lExpected = CommandQuerySlotForCarPlate.cNotFound;
		String lActual = getSlotForCarPlate("UNIQUE_PLATE");
		assertEquals(lShould, lExpected, lActual);
    }
	
}
