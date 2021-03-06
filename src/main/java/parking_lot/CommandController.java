package parking_lot;

import java.util.LinkedHashMap;
import java.util.Map;

public class CommandController {
	
	private Map<String, Class<? extends parking_lot.BaseCommand>> mCommands;

	public CommandController() {
		mCommands = new LinkedHashMap<String, Class<? extends BaseCommand>>();
		mCommands.put(CommandPark.cPark, CommandPark.class);
		mCommands.put(CommandLeave.cLeave, CommandLeave.class);
		mCommands.put(CommandStatus.cStatus, CommandStatus.class);
		mCommands.put(CommandQueryPlateForCarColour.cQueryPlateForCarColour, CommandQueryPlateForCarColour.class);
		mCommands.put(CommandQuerySlotForCarColour.cQuerySlotForCarColour, CommandQuerySlotForCarColour.class);
		mCommands.put(CommandQuerySlotForCarPlate.cQuerySlotForCarPlate, CommandQuerySlotForCarPlate.class); 
		mCommands.put(CommandCreateParkingLot.cCreateParkingLot, CommandCreateParkingLot.class);
		mCommands.put(CommandExit.cExit, CommandExit.class);
	}

	@SuppressWarnings("deprecation")
	public BaseCommand findCommand(String aCommand) {
		Class<? extends BaseCommand> lBaseCommandClass = mCommands.get(aCommand);
		BaseCommand lResult = null;
		if (lBaseCommandClass != null) {
			try {
				lResult = lBaseCommandClass.newInstance();
			} catch (InstantiationException | IllegalAccessException e) {
				System.out.println("Unable to create instance of command: " + aCommand);
				e.printStackTrace();
			}
		}
		return lResult;
	}
	
}
