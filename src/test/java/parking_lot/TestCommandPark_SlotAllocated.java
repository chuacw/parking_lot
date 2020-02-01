package parking_lot;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestCommandPark_SlotAllocated extends TestCommandPark_Base {

	@Before 
	public void setup() {
		createParkingLots(1);
		mResult = runPark("KA-01-HH-1234", "White");
	}
	
	@Test
	public void test() {
		String lExpected = String.format(CommandPark.cAllocatedSlot, 1);
		assertEquals("Should have parked the car", lExpected, mResult);
	}

}
