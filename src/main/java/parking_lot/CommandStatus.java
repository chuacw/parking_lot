package parking_lot;

import java.util.ArrayList;

/**
 * Returns the slot number used by all cars, its plate number, and colour.
 * @author Administrator
 *
 */
public class CommandStatus extends BaseCommand {

	protected static String cStatus = "status";
	public static String cHeader = "Slot No. Registration No Colour";
	public static String cOutputFormat = "%d      %s      %s";

	public CommandStatus() {
		super(cStatus, 0);
	}

	@Override
	public String run(ArrayList<String> aArgs) {
		StringBuilder lSBDetails = new StringBuilder();

//		Slot No. Registration No Colour 
//		1      KA-01-HH-1234      White 
//		2      KA-01-HH-9999      White 
//		3      KA-01-BB-0001      Black 
//		5      KA-01-HH-2701       Blue 
//		6      KA-01-HH-3141      Black

		boolean lAddLine = true;
		lSBDetails.append(cHeader);
		ParkingLot lParkingLot = Owner.getParkingLot();
		int lUsed = lParkingLot.getUsed();
		for (int i = 1; i <= lUsed; i++) {
			if ((lAddLine) && (lSBDetails.length() > 0)) {
				String lLineSep = System.lineSeparator();
				lSBDetails.append(lLineSep);
			}
			lAddLine = false;
			Car lCar = lParkingLot.getCar(i);
			if (lCar != null) {
				String lPlate = lCar.getPlate();
				String lColour = lCar.getColour();
				int index = i;
				String lLine = String.format(cOutputFormat, index, lPlate, lColour);
				lSBDetails.append(lLine);
				lAddLine = true;
			}
		}

		String lResult = lSBDetails.toString();
		return lResult;
	}

}
