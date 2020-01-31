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
	public String run(ArrayList<String> args) {
		ParkingLot lParkingLot = Owner.getParkingLot();
	}
	
}