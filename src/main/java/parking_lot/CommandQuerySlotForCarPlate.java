package parking_lot;

import java.util.ArrayList;

public class CommandQuerySlotForCarPlate extends BaseCommandQuery {

	protected static String cQuerySlotForCarPlate = "slot_number_for_registration_number";
	
	public CommandQuerySlotForCarPlate() {
		super(cQuerySlotForCarPlate, 1);
	}
	
	@Override
	public String run(ArrayList<String> args) {
		String lPlate = args.get(0);
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

}
