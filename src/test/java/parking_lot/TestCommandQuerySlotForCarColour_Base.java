package parking_lot;

import java.util.ArrayList;

public class TestCommandQuerySlotForCarColour_Base extends TestCommandQueryPlateForCarColour_Base {

	protected String getSlotForCarColour(String aColour) {
		BaseCommand lCommand = new CommandQuerySlotForCarColour();
		ArrayList<String> lArgs = new ArrayList<String>();
		lArgs.add(aColour);
		String lResult = lCommand.run(lArgs);
		return lResult;
	}
	
}
