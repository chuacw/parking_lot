package parking_lot;

import java.util.ArrayList;

/**
 * Finds the specific slot used up by a car with a specific plate number.
 * 
 * @author chuacw
 *
 */
public class CommandQuerySlotForCarPlate extends BaseCommandQuery {

	protected static String cQuerySlotForCarPlate = "slot_number_for_registration_number";
	
	public CommandQuerySlotForCarPlate() {
		super(cQuerySlotForCarPlate, 1);
	}
	
	@Override
	public String run(ArrayList<String> aArgs) {
		String lPlate = aArgs.get(0);
		StringBuilder lSB = new StringBuilder();
		ParkingLot lParkingLot = Owner.getParkingLot(); 
		int lUsed = lParkingLot.getUsed();
		boolean lFound = false;
		for (int i = 1; i <= lUsed; i++) {
			Car lCar = lParkingLot.getCar(i);
			String lCarPlate = lCar.getPlate();
			if (lCarPlate.equals(lPlate)) {
				String lSlotNumber = String.valueOf(i);
				lSB.append(lSlotNumber);
				lFound = true;
				break;
			}
		}
		if (!lFound) {
			lSB.append(cNotFound);
		}
		String lResult = lSB.toString();
		return lResult;
	}
	
	@Override
	public BaseStatus runStatus(ArrayList<String> aArgs) {
		String lPlate = aArgs.get(0);
		ParkingLot lParkingLot = Owner.getParkingLot(); 
		int lUsed = lParkingLot.getUsed();
		boolean lFound = false; int lSlotNumber = 0;
		for (int i = 1; i <= lUsed; i++) {
			Car lCar = lParkingLot.getCar(i);
			String lCarPlate = lCar.getPlate();
			if (lCarPlate.equals(lPlate)) {
				lSlotNumber = i;
				lFound = true;
				break;
			}
		}
		BaseStatus lResult;
		if (!lFound) {
			lResult = new StatusNotFound();
		} else {
			lResult = new StatusQuerySlot(lSlotNumber);
		}
		return lResult;
	}

}
