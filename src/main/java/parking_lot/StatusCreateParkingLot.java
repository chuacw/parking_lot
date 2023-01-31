package parking_lot;

public class StatusCreateParkingLot extends BaseStatus {

	protected int mActualSlots;
	public static String cOutputFormat = "Created a parking lot with %d slots";
	
	public StatusCreateParkingLot(int aActualSlots) {
		mActualSlots = aActualSlots;
	}
	
	@Override
	public String toString() {
		String lResult = String.format(cOutputFormat, mActualSlots);
		return lResult;
	}

}
