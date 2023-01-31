package parking_lot;

import java.util.ArrayList;

public class CommandPark extends BaseCommand {

	public static String cParkFull = "Sorry, parking lot is full";
	public static String cAllocatedSlot = "Allocated slot number: %d";
	protected static String cPark = "park";

	public CommandPark() {
		super(CommandPark.cPark, 2);
	}

	@Override
	public String run(ArrayList<String> aArgs) {
		ParkingLot lParkingLot = Owner.getParkingLot();
		// park KA-01-HH-1234 White
		String lPlate = aArgs.get(0);
		String lColour = aArgs.get(1);

 		if (lParkingLot.getAvailable() > 0) {
			Car lCar = new Car(lColour, lPlate);
			Ticket lTicket = lParkingLot.parkCar(lCar);

			String lResult = String.format(cAllocatedSlot, lTicket.getSlotNumber());
			return lResult;
		} else {
			String lResult = cParkFull;
			return lResult;
		}
	}

	@Override
	public BaseStatus runStatus(ArrayList<String> aArgs) {
		ParkingLot lParkingLot = Owner.getParkingLot();
		// park KA-01-HH-1234 White
		String lPlate = aArgs.get(0);
		String lColour = aArgs.get(1);

 		BaseStatus lStatus;
		if (lParkingLot.getAvailable() > 0) {
			Car lCar = new Car(lColour, lPlate);
			Ticket lTicket = lParkingLot.parkCar(lCar);

			lStatus = new StatusParkAllocatedSlot(lTicket.getSlotNumber());
		} else {
			lStatus = new StatusParkFull();
		}
		return lStatus;
	}	
	
}