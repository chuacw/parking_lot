package parking_lot;

import java.util.ArrayList;

public class CommandQueryPlateForCarColour extends BaseCommandQuery {

	protected static String cQueryPlateForCarColour = "registration_numbers_for_cars_with_colour";

	public CommandQueryPlateForCarColour() {
		super(CommandQueryPlateForCarColour.cQueryPlateForCarColour, 1);
	}

	@Override
	public String run(ArrayList<String> args) {
		String lColour = args.get(0);
		StringBuilder lSB = new StringBuilder();
		ParkingLot lParkingLot = Owner.getParkingLot(); 
		int lUsed = lParkingLot.getUsed();
		for (int i = 1; i <= lUsed; i++) {
			Car lCar = lParkingLot.getCar(i);
			String lCarColour = lCar.getColour();
			if (lCarColour.equalsIgnoreCase(lColour)) {
				String lCarPlate = lCar.getPlate();
				if (lSB.length() > 0) {
					lSB.append(", ");
				}
				lSB.append(lCarPlate);
			}
		}
		if (lUsed == 0) {
			lSB.append(cNotFound);
		}
		String lResult = lSB.toString();
		return lResult;
	}

}