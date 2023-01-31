package parking_lot;

public class StatusParkAllocatedSlot extends StatusPark {

	public static String cAllocatedSlot = "Allocated slot number: %d";

	protected int mSlot;

	public StatusParkAllocatedSlot(int aSlot) {
		mSlot = aSlot;
	}

	@Override
	public String toString() {
		String lResult = String.format(cAllocatedSlot, mSlot);
		return lResult;
	}
	
}
