package parking_lot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCar_Colour extends TestCar_Base {

	@Test
	public void test() {
		String lActualColour = mCar.getColour();
		String lShould = String.format("Colour should be %s", cCreatedColour); 
		assertEquals(lShould, cCreatedColour, lActualColour);
	}
}
