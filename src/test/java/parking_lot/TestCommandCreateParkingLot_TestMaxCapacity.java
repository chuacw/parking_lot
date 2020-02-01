package parking_lot;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestCommandCreateParkingLot_TestMaxCapacity extends TestCommandPark_Base {

	@Before
    public void setup(){
    	mCreateSlots = 3;
		mCommandResult = createParkingLots(mCreateSlots);
    }

	@Test
    public void test() {
		String lShould = String.format("Car park should be able to park %d cars.", mCreateSlots);

		String lResult1 = parkCar("XXX", "Black");
		String lResult2 = parkCar("YYY", "White");
		String lResult3 = parkCar("ZZZ", "Yellow");

		String lExpected1 = String.format(CommandPark.cAllocatedSlot, 1);
		String lExpected2 = String.format(CommandPark.cAllocatedSlot, 2);
		String lExpected3 = String.format(CommandPark.cAllocatedSlot, 3);
		
		String lTotalActualResult = lResult1 + lResult2 + lResult3;
		String lTotalExpectedResult = lExpected1 + lExpected2 + lExpected3;
		
		assertEquals(lShould, lTotalExpectedResult, lTotalActualResult);
    }
	
}
