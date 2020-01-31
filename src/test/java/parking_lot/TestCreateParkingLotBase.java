package parking_lot;

import java.util.ArrayList;

public class TestCreateParkingLotBase {

    protected BaseCommand mBaseCommand;
	protected String mCommandResult;
	protected int mCreateSlots;
	
	public static String createParkingLots(int aNumSlots) {
		BaseCommand lCreateParkingLots = new CommandCreateParkingLot();
		ArrayList<String> args = new ArrayList<String>();
		args.add(Integer.toString(aNumSlots));
		String lResult = lCreateParkingLots.run(args);
		return lResult;
	}

}
