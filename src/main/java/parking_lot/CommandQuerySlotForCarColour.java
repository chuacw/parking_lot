package parking_lot;

import java.util.ArrayList;

public class CommandQuerySlotForCarColour extends BaseCommandQuery {

	protected static String cQuerySlotForCarColour = "slot_numbers_for_cars_with_colour";

	public CommandQuerySlotForCarColour() {
		super(CommandQuerySlotForCarColour.cQuerySlotForCarColour, 1);
	}
	
	@Override
	public String run(ArrayList<String> aArgs) {
		String lColour = aArgs.get(0);
		StringBuilder lSB = new StringBuilder();
		ParkingLot lParkingLot = Owner.getParkingLot(); 
		int lUsed = lParkingLot.getUsed();
		for (int i = 1; i <= lUsed; i++) {
			Car lCar = lParkingLot.getCar(i);
			String lCarColour = lCar.getColour();
			if (lCarColour.equalsIgnoreCase(lColour)) {
				String lSlotNumber = String.valueOf(i);
				if (lSB.length() > 0) {
					lSB.append(", ");
				}
				lSB.append(lSlotNumber);
			}
		}
		if (lUsed == 0) {
			lSB.append(cNotFound);
		}
		String lResult = lSB.toString();
		return lResult;
	}

}
