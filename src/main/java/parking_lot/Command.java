package parking_lot;

public class Command {
	protected int mArgLen;

	public int getRequiredArgLen() {
		return mArgLen;
	}
	
	public Command(int aArgLen) {
		mArgLen = aArgLen;	
	}
}
