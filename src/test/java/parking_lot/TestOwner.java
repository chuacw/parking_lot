package parking_lot;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestOwner {

	protected ParkingLot mParkingLot;
	protected int cNumSlots = 20;
	
    @Before
    public void setup(){
    	Owner.createParkingLot(cNumSlots);
    }

	@Test
    public void test() {
    	int lActualSlots = Owner.getParkingLot().getCapacity();
    	String lShould = String.format("Actual slots should be %d", cNumSlots);
		assertEquals(lShould, cNumSlots, lActualSlots);
    }

}
