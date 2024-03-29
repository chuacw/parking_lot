package parking_lot;

import java.util.ArrayList;

public class CommandCreateParkingLot extends BaseCommand {

	public static String cOutputFormat = "Created a parking lot with %d slots";
	protected static String cCreateParkingLot = "create_parking_lot";

	public CommandCreateParkingLot() {
		super(CommandCreateParkingLot.cCreateParkingLot, 1);
	}

	@Override
	public String run(ArrayList<String> aArgs) {
		int lNumSlots = Integer.parseInt(aArgs.get(0));
		Owner.createParkingLot(lNumSlots);
		int lActualSlots = Owner.getParkingLot().getCapacity();
		String lResult = String.format(cOutputFormat, lActualSlots);
		return lResult;
	}

	@Override
	public BaseStatus runStatus(ArrayList<String> aArgs) {
		int lNumSlots = Integer.parseInt(aArgs.get(0));
		Owner.createParkingLot(lNumSlots);
		int lActualSlots = Owner.getParkingLot().getCapacity();
		BaseStatus lStatus = new StatusCreateParkingLot(lActualSlots);
		return lStatus;
	}
}
