package parking_lot;

import java.util.ArrayList;

public class TestCommandQuerySlotForCarPlate_Base extends TestCommandQueryPlateForCarColour_Base {

	protected String getSlotForCarPlate(String aPlate) {
		BaseCommand lCommand = new CommandQuerySlotForCarPlate();
		ArrayList<String> lArgs = new ArrayList<String>();
		lArgs.add(aPlate);
		String lResult = lCommand.run(lArgs);
		return lResult;
	}
	
}
