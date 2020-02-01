package parking_lot;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * This tests the case when the car park is full, and the user
 * tries to park a car.
 * 
 * @author chuacw
 *
 */
public class TestCommandPark_Full1 extends TestCommandPark_Base {

	@Before
	public void setup() {
		createParkingLots(0);
		mResult = runPark("KA-01-HH-1234", "White"); 
	}

	@Test
	public void test() {
		String lExpected = CommandPark.cParkFull;
		assertEquals("Should have no parking lots available", lExpected, mResult);
	}
	
}
