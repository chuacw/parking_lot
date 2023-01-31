package parking_lot;

import java.util.ArrayList;

/**
 * Finds all the plate numbers for a specific colour in the parking lots
 * and returns it as a comma separated string.
 * 
 * @author chuacw
 *
 */
public class CommandQueryPlateForCarColour extends BaseCommandQuery {

	protected static String cQueryPlateForCarColour = 
			"registration_numbers_for_cars_with_colour";

	public CommandQueryPlateForCarColour() {
		super(CommandQueryPlateForCarColour.cQueryPlateForCarColour, 1);
	}

	@Override
	public String run(ArrayList<String> aArgs) {
		String lColour = aArgs.get(0);
		StringBuilder lSB = new StringBuilder();
		ParkingLot lParkingLot = Owner.getParkingLot(); 
		int lUsed = lParkingLot.getUsed();
		boolean lNotFound = true;
		for (int i = 1; i <= lUsed; i++) {
			Car lCar = lParkingLot.getCar(i);
			String lCarColour = lCar.getColour();
			if (lCarColour.equalsIgnoreCase(lColour)) {
				String lCarPlate = lCar.getPlate();
				if (lSB.length() > 0) {
					lSB.append(", ");
				}
				lSB.append(lCarPlate);
				lNotFound = false;
			}
		}
		if (lNotFound) {
			lSB.append(cNotFound);
		}
		String lResult = lSB.toString();
		return lResult;
	}
	
	@Override
	public BaseStatus runStatus(ArrayList<String> aArgs) {
		String lColour = aArgs.get(0);
		ParkingLot lParkingLot = Owner.getParkingLot(); 
		int lUsed = lParkingLot.getUsed();
		boolean lNotFound = true;
		ArrayList<String> lCarPlates = new ArrayList<String>();
		for (int i = 1; i <= lUsed; i++) {
			Car lCar = lParkingLot.getCar(i);
			String lCarColour = lCar.getColour();
			if (lCarColour.equalsIgnoreCase(lColour)) {
				String lCarPlate = lCar.getPlate();
				lCarPlates.add(lCarPlate);
				lNotFound = false;
			}
		}
		BaseStatus lResult;
		if (lNotFound) {
			lResult = new StatusNotFound();
		} else {
			lResult = new StatusQueryPlate(lCarPlates);
		}
		return lResult;
	}

}
