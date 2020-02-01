package parking_lot;

import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class TestCommandCreateParkingLot_ShouldNotBe5 extends TestCommandCreateParkingLot_Base {

	@Before
    public void setup(){
    	mCreateSlots = 6;
		mCommandResult = createParkingLots(mCreateSlots);
    }

	@Test
    public void test() {
    	String lExpectedOutput = String.format(CommandCreateParkingLot.cOutputFormat, 5);
    	String lShould = String.format("Car park should have %d slots", mCreateSlots);
    	assertNotEquals(lShould, mCommandResult, lExpectedOutput);
    }
	
}
