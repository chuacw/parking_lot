package parking_lot;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestCommandStatus extends TestCommandPark_Base {

	private String mPlate;
	private String mColour;
	
	@Before
	public void setup() {
		createParkingLots(1);
		mPlate = "KA-01-HH-1234";
		mColour = "White";
		mResult = runPark(mPlate, mColour); 
	}
	
	private void getStatus() {
		BaseCommand lStatus = new CommandStatus();
		mResult = lStatus.run(null);
	}
	
	private void appendLine(StringBuilder aSB, String aLine) {
		aSB.append(aLine);
		aSB.append(System.lineSeparator());
	}

	@Test
	public void test() {
		getStatus();
		StringBuilder lSB = new StringBuilder();
		appendLine(lSB, CommandStatus.cHeader);
		String lStatus = String.format(CommandStatus.cOutputFormat, 1, mPlate, mColour);
		lSB.append(lStatus);
		
		String lExpected = lSB.toString();
		
		assertEquals("Should have 1 car parked", lExpected, mResult);
	}

}
