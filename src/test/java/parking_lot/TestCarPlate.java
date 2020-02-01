package parking_lot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCarPlate extends TestCarBase {

	@Test
	public void test() {
		String lActualPlate = mCar.getPlate();
		String lShould = String.format("Plate should be %s", cCreatedPlate); 
		assertEquals(lShould, cCreatedPlate, lActualPlate);
	}
	
}
