package parking_lot;

import org.junit.Before;

public class TestCar_Base {

	protected Car mCar;
	protected static String cCreatedColour = "White";
	protected static String cCreatedPlate = "KA-01-HH-1234"; 
	
	@Before
	public void setup() {
		mCar = new Car(cCreatedColour, cCreatedPlate);
	}

}
