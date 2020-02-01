package parking_lot;

public class Ticket {
	
	private String mPlate;
	private String mColour;
	private int mSlotNumber;
	
	public Ticket(Car aCar, int aSlotNumber) {
		mColour = aCar.getColour();
		mPlate = aCar.getPlate();
		mSlotNumber = aSlotNumber;
	}
	
	public String getPlate() {
		return mPlate;
	}
	
	public String getColour() {
		return mColour;
	}
	
	public int getSlotNumber() {
		return mSlotNumber;
	}
	
}
