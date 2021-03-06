package parking_lot;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

/**
 * This test case tests leaving a parking lot.
 * 
 * @author chuacw
 *
 */
public class TestCommandLeave extends TestCommandPark_Base {

	
	private String mLeaveResult;
	private int mLeftSlot;
	
	private void leaveParkingSlot(int index) {
		BaseCommand lCommandLeave = new CommandLeave();
		ArrayList<String> args = new ArrayList<String>();
		mLeftSlot = 1;
		args.add(String.valueOf(mLeftSlot));
		mLeaveResult = lCommandLeave.run(args);
	}

	@Before
	public void setup() {
		createParkingLots(1);
		mResult = parkCar("KA-01-HH-1234", "White");
		leaveParkingSlot(1);
	}

	@Test
	public void test() {
		String lExpected = String.format(CommandLeave.cSlotFree, mLeftSlot);
		assertEquals("Should have left slot 1", lExpected, mLeaveResult);
	}
	
}
