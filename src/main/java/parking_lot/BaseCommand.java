package parking_lot;

import java.util.ArrayList;

public class BaseCommand {
	
	protected int mArgLen;
	protected String mCommand;

	/**
	 * @param aCommand The command name for this Command class.
	 * @param aArgLen The number of arguments required by this Command.
	 */
	public BaseCommand(String aCommand, int aArgLen) {
		mArgLen = aArgLen;
		mCommand = aCommand;
	}

	public int getRequiredArgLen() {
		return mArgLen;
	}

	public String getCommand() {
		return mCommand;
	}

	public String run(ArrayList<String> aArgs) {
		return null;
	}

}
