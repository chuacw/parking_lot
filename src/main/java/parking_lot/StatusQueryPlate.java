package parking_lot;

import java.util.ArrayList;

public class StatusQueryPlate extends StatusQuery {

	protected ArrayList<String> mCarPlates;
	protected String mToString;
	
	public StatusQueryPlate(ArrayList<String> lCarPlates) {
		mCarPlates = lCarPlates;
		mToString = null;
	}

	@Override
	public String toString() {
		if (mToString == null) {
			StringBuilder lSB = new StringBuilder();
			for (String lCarPlate: mCarPlates) {
				if (lSB.length() > 0) {
					lSB.append(", ");
				}
				lSB.append(lCarPlate);
			}
			mToString = lSB.toString();
		}
		return mToString;
	}

}
