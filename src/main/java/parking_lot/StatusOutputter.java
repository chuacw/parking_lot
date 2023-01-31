package parking_lot;

public class StatusOutputter {

	protected BaseStatus mStatus;
	
	public StatusOutputter(BaseStatus aStatus) {
		mStatus = aStatus;
	}
	
	@Override
	public String toString() {
		String lResult = mStatus.toString();
		return lResult;
	}
	
}
