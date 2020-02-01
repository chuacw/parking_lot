package parking_lot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCommandQuerySlotForCarPlate_PlateFound extends TestCommandQuerySlotForCarPlate_Base {

	/**
	 * Query the slot for plate 3.
	 * This is encoded in the ancestor class.
	 * The expected answer should be slot 3. 
	 */
	@Test
    public void test() {
		String lShould = "Should be 3";
		String lExpected = "3";
		String lActual = getSlotForCarPlate(cPlate3);
		assertEquals(lShould, lExpected, lActual);
    }
	
}
