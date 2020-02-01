package parking_lot;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestCommandStatus_NoCarsParked extends TestCommandPark_Base {

	@Before
	public void setup() {
		createParkingLots(1);
	}
	
	private void getStatus() {
		BaseCommand lStatus = new CommandStatus();
		mResult = lStatus.run(null);
	}
	
	@Test
	public void test() {
		getStatus();
		String lExpected = "";
		
		assertEquals("Should be an empty string", lExpected, mResult);
	}

}
