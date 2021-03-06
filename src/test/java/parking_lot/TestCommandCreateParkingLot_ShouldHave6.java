package parking_lot;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestCommandCreateParkingLot_ShouldHave6 extends TestCommandCreateParkingLot_Base {

	@Before
    public void setup(){
    	mCreateSlots = 6;
		mCommandResult = createParkingLots(mCreateSlots);
    }

	@Test
    public void test() {
    	String lExpectedOutput = String.format(CommandCreateParkingLot.cOutputFormat, mCreateSlots);
    	String lShould = String.format("Car park should have %d slots", mCreateSlots);
    	assertEquals(lShould, mCommandResult, lExpectedOutput);
    }
	
}
