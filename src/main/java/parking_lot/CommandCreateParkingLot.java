package parking_lot;

import java.util.ArrayList;

public class CommandCreateParkingLot extends BaseCommand {

	public static String cOutputFormat = "Created a parking lot with %d slots";
	
	public CommandCreateParkingLot() {
		super(BaseCommand.cCreateParkingLot, 1);
	}

	@Override
	public String run(ArrayList<String> args) {
		int lNumSlots = Integer.parseInt(args.get(0));
		Owner.createParkingLot(lNumSlots);
		int lActualSlots = Owner.getParkingLot().getCapacity();
		String lresult = String.format(cOutputFormat, lActualSlots);
		return lresult;
	}
}
