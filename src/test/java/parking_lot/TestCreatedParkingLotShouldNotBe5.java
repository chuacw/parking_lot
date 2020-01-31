package parking_lot;

import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class TestCreatedParkingLotShouldNotBe5 extends TestCreateParkingLotBase {

    @Test
    public void test() {
    	String lExpectedOutput = String.format(CommandCreateParkingLot.cOutputFormat, 5);
    	String lShould = String.format("Car park should have %d slots", mCreateSlots);
    	assertNotEquals(lShould, mCommandResult, lExpectedOutput);
    }
}
