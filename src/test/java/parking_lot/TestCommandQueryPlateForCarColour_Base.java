package parking_lot;

import org.junit.Before;

public class TestCommandQueryPlateForCarColour_Base extends TestCommandPark_Base {

	protected String mResult2;
	protected String mResult3;
	
	protected static String cPlate1  = "KA-01-HH-1234";
	protected static String cColour1 = "White";
	protected static String cPlate2  = "KA-03-JJ-2346";
	protected static String cColour2 = "Black";
	protected static String cPlate3  = "KA-02-KK-2345"; 
	
    @Before
    public void setup(){
		createParkingLots(3);
		mResult  = runPark(cPlate1, cColour1);
		mResult2 = runPark(cPlate2, cColour2);
		mResult3 = runPark(cPlate3, cColour1);
    }

}
