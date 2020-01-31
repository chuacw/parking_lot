package parking_lot;

import java.util.ArrayList;

public class CommandStatus extends BaseCommand {

	protected static String cStatus = "status";
	public static String cHeader = "Slot No. Registration No Colour";
	public static String cOutputFormat = "%d      %s      %s";

	public CommandStatus() {
		super(cStatus, 0);
	}
	
	private StringBuilder mSB;

	private void appendLine(String line) {
		mSB.append(line);
		mSB.append(System.lineSeparator());
	}
	
	@Override
	public String run(ArrayList<String> args) {
		mSB = new StringBuilder();
		
//		Slot No. Registration No Colour 
//		1      KA-01-HH-1234      White 
//		2      KA-01-HH-9999      White 
//		3      KA-01-BB-0001      Black 
//		5      KA-01-HH-2701       Blue 
//		6      KA-01-HH-3141      Black
		
		appendLine(cHeader);
		ParkingLot lParkingLot = Owner.getParkingLot();
		int lUsed = lParkingLot.getUsed();
		for (int i=1; i<=lUsed; i++) {
			Car lCar = lParkingLot.getCar(i);
			String lPlate = lCar.getPlate();
			String lColour = lCar.getColour();
			String lLine = String.format(cOutputFormat, i, lPlate, lColour);
			appendLine(lLine);
		}
		
		String lResult = mSB.toString();
		return lResult;
	}

}
