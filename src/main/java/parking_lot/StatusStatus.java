package parking_lot;

public class StatusStatus extends BaseStatus {

	protected String mStatus;
	
	public StatusStatus(String lStatus) {
		mStatus = lStatus;
	}

	@Override
	public String toString() {
		return mStatus;
	}
	
}
