package parking_lot;

public class StatusSlotInvalid extends StatusSlot {
	
	public static final String cInvalidSlot = "The slot number is invalid";
	protected int mSlotNumber;

	public StatusSlotInvalid(int aSlotNumber) {
		mSlotNumber = aSlotNumber;
	}
	
	@Override
	public String toString() {
		return cInvalidSlot;
	}
	
}
