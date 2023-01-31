package parking_lot;

public class StatusSlotFree extends StatusSlot {

	public static final String cSlotFree = "Slot number %d is free";

	protected int mSlot;
	
	public StatusSlotFree(int aSlot) {
		mSlot = aSlot; 
	}
	
	@Override
	public String toString() {
		return String.format(cSlotFree, mSlot);
	}

}
