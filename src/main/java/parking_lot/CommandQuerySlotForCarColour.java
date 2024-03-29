package parking_lot;

import java.util.ArrayList;

/**
 * Finds all the slot numbers used by cars with a specific colour in the
 * parking lot.
 * 
 * @author chuacw
 *
 */
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
		boolean lNotFound = true;
		for (int i = 1; i <= lUsed; i++) {
			Car lCar = lParkingLot.getCar(i);
			String lCarColour = lCar.getColour();
			if (lCarColour.equalsIgnoreCase(lColour)) {
				String lSlotNumber = String.valueOf(i);
				if (lSB.length() > 0) {
					lSB.append(", ");
				}
				lSB.append(lSlotNumber);
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
		ArrayList<Integer> lSlotsUsed = new ArrayList<Integer>();
		boolean lNotFound = true;
		for (int i = 1; i <= lUsed; i++) {
			Car lCar = lParkingLot.getCar(i);
			String lCarColour = lCar.getColour();
			if (lCarColour.equalsIgnoreCase(lColour)) {
				lSlotsUsed.add(i);
				lNotFound = false;
			}
		}
		BaseStatus lResult;
		if (!lNotFound) {
			lResult = new StatusQuerySlot(lSlotsUsed);
		} else {
			lResult = new StatusNotFound();
		}
		return lResult;
	}

}
