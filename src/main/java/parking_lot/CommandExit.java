package parking_lot;

import java.util.ArrayList;

public class CommandExit extends BaseCommand {
	
	protected static String cExit = "exit";

	public CommandExit() {
		super(CommandExit.cExit, 0);
	}
	
	@Override
	public String run(ArrayList<String> args) {
		System.exit(0);
		return null; // Unused, needed to keep compiler / parser happy
	}
	
}
