package parking_lot;

import java.util.ArrayList;

public class StatusQuerySlot extends StatusQuery {

	protected String mToString;
	protected ArrayList<Integer> mSlotsUsed;
	
	public StatusQuerySlot(ArrayList<Integer> lSlotsUsed) {
		mSlotsUsed = lSlotsUsed;
		mToString = null;
	}

	public StatusQuerySlot(int lSlotNumber) {
		mSlotsUsed = new ArrayList<Integer>();
		mSlotsUsed.add(lSlotNumber);
		mToString = null;
	}

	@Override
	public String toString() {
		if (mToString == null) {
			StringBuilder lSB = new StringBuilder();
			for (Integer i: mSlotsUsed) {
				String lSlotNumber = String.valueOf(i);
				if (lSB.length() > 0) {
					lSB.append(", ");
				}
				lSB.append(lSlotNumber);
			}
			mToString = lSB.toString();
		}
		return mToString;
	}

}
