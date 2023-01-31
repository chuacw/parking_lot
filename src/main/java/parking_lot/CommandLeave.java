package parking_lot;

import java.util.ArrayList;

public class CommandLeave extends BaseCommand {

	protected static String cLeave = "leave";
	protected static String cSlotFree = ParkingLot.cSlotFree;

	public CommandLeave() {
		super(CommandLeave.cLeave, 1);
	}

	@Override
	public String run(ArrayList<String> aArgs) {
		int lIndex = Integer.parseInt(aArgs.get(0));
		String lResult = Owner.getParkingLot().removeCar(lIndex);
		return lResult;
	}
	
	@Override
	public BaseStatus runStatus(ArrayList<String> aArgs) {
		int lIndex = Integer.parseInt(aArgs.get(0));
		BaseStatus lResult = Owner.getParkingLot().removeCarStatus(lIndex);
		return lResult;
	}

}
