package parking_lot;

import java.util.ArrayList;

public class TestCommandPark_Base extends TestCommandCreateParkingLot_Base {
	
	protected String mResult;

	/**
	 * Calls CommandPark to park a car with a specific plate and colour.
	 * @param aPlate Number of plate of car.
	 * @param aColour Colour of car.
	 * @return a string that indicates which slot number it parked at.
	 */
	public static String runPark(String aPlate, String aColour) {
		BaseCommand lParkingCommand = new CommandPark();
		ArrayList<String> args = new ArrayList<String>();
		args.add(aPlate);
		args.add(aColour);
		String lResult = lParkingCommand.run(args);
		return lResult;
	}

}
