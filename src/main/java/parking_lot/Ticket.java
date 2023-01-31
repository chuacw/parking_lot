package parking_lot;

public class Ticket {
	
//	private String mPlate;
//	private String mColour;
	private int mSlotNumber;
	private Car mCar;
	
	public Ticket(Car aCar, int aSlotNumber) {
		mCar = aCar;
//		mColour = aCar.getColour();
//		mPlate = aCar.getPlate();
		mSlotNumber = aSlotNumber;
	}
	
	public String getPlate() {
		String lPlate = mCar.getPlate();
		return lPlate;
//		return mPlate;
	}
	
	public String getColour() {
		String lColour = mCar.getColour();
		return lColour;
//		return mColour;
	}
	
	public int getSlotNumber() {
		return mSlotNumber;
	}
	
}
