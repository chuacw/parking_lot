package parking_lot;

import java.util.ArrayList;

public class BaseCommand {
	protected static String cCreateParkingLot = "create_parking_lot";
	protected static String cPark = "park";
	protected static String cLeave = "leave";
	protected static String cStatus = "status";
	protected static String cQueryPlateForCarColour = "registration_numbers_for_cars_with_colour";
	protected static String cQuerySlotForCarColour = "slot_numbers_for_cars_with_colour";

	protected int mArgLen;
	protected String mCommand;

	public BaseCommand(String aCommand, int aArgLen) {
		mArgLen = aArgLen;
		mCommand = aCommand;
	}

	public int getRequiredArgLen() {
		return mArgLen;
	}
	
	public String getCommand() {
		return mCommand;
	}
	
	public String run(ArrayList<String> args) {
		return null;
	}
	
}
