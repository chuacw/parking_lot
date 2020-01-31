package parking_lot;

import java.util.LinkedHashMap;
import java.util.Map;

public class CommandController {
	private Map<String, Class<? extends BaseCommand>> mCommands;
	
	public CommandController() {
		mCommands = new LinkedHashMap<String, Class <? extends BaseCommand>>();
		mCommands.put(BaseCommand.cPark, CommandPark.class);
		mCommands.put(BaseCommand.cLeave, CommandLeave.class);
		mCommands.put(BaseCommand.cStatus, CommandStatus.class);
		mCommands.put(BaseCommand.cQueryPlateForCarColour, CommandQueryPlateForCarColour.class);
		mCommands.put(BaseCommand.cQuerySlotForCarColour, CommandQuerySlotForCarColour.class);
		mCommands.put(BaseCommand.cCreateParkingLot,  CommandCreateParkingLot.class);
	}
	
	public BaseCommand findCommand(String aCommand) {
		Class<? extends BaseCommand> lBaseCommandClass = mCommands.get(aCommand);
		BaseCommand lResult = null;
		try {
			lResult = lBaseCommandClass.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lResult;
	}
}
