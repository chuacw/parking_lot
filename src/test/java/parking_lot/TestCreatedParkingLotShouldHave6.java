package parking_lot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCreatedParkingLotShouldHave6 extends TestCreateParkingLotBase {

    @Test
    public void test() {
    	String lExpectedOutput = String.format(CommandCreateParkingLot.cOutputFormat, mCreateSlots);
    	String lShould = String.format("Car park should have %d slots", mCreateSlots);
    	assertEquals(lShould, mCommandResult, lExpectedOutput);
    }
}
