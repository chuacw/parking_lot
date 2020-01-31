package parking_lot;

import java.util.ArrayList;

public class TestParkingLotsBase extends TestCreateParkingLotBase {
	
	protected String mResult;

	public static String runPark(String aPlate, String aColour) {
		BaseCommand lParkingCommand = new CommandPark();
		ArrayList<String> args = new ArrayList<String>();
		args.add(aPlate);
		args.add(aColour);
		String lResult = lParkingCommand.run(args);
		return lResult;
	}

}
