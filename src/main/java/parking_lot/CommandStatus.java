package parking_lot;

import java.util.ArrayList;

/**
 * Returns the slot number used by all cars, its plate number, and colour.
 * If there are no cars available, return an empty string.
 * @author Administrator
 *
 */
public class CommandStatus extends BaseCommand {

	protected static String cStatus = "status";
	public static String cHeader = "Slot No.    Registration No    Colour";
	public static String cOutputFormat = "%d           %s      %s";

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

		boolean lAddLine = false;
		ParkingLot lParkingLot = Owner.getParkingLot();
		int lUsed = lParkingLot.getUsed();
		String lLineSep = System.lineSeparator();
		for (int i = 1; i <= lUsed; i++) {
			if ((lAddLine) && (lSBDetails.length() > 0)) {
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
		String lResult;
		if (lSBDetails.length() > 0 ) {
			StringBuilder lSBHeader = new StringBuilder();
			lSBHeader.append(cHeader);
			lSBHeader.append(lLineSep);
			lSBHeader.append(lSBDetails.toString());
			lResult = lSBHeader.toString();
		} else {
			lResult = "";
		}
		return lResult;
	}

	@Override
	public BaseStatus runStatus(ArrayList<String> aArgs) {
		StringBuilder lSBDetails = new StringBuilder();

//		Slot No. Registration No Colour 
//		1      KA-01-HH-1234      White 
//		2      KA-01-HH-9999      White 
//		3      KA-01-BB-0001      Black 
//		5      KA-01-HH-2701       Blue 
//		6      KA-01-HH-3141      Black

		boolean lAddLine = false;
		ParkingLot lParkingLot = Owner.getParkingLot();
		int lUsed = lParkingLot.getUsed();
		String lLineSep = System.lineSeparator();
		for (int i = 1; i <= lUsed; i++) {
			if ((lAddLine) && (lSBDetails.length() > 0)) {
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
		String lResult;
		if (lSBDetails.length() > 0 ) {
			StringBuilder lSBHeader = new StringBuilder();
			lSBHeader.append(cHeader);
			lSBHeader.append(lLineSep);
			lSBHeader.append(lSBDetails.toString());
			lResult = lSBHeader.toString();
		} else {
			lResult = "";
		}
		return new StatusStatus(lResult);
	}	
	
}
