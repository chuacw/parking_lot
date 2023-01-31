package parking_lot;

import java.util.HashMap;
import java.util.Map;

public enum DispatchStrategy {
	FillFirst("fill_first"), // Calls #1, associating the enum FillFirst with the string "fill_first"
	EvenDistribution("even_distribution"); // Calls #1, associating the enum EvenDistribution
										   // with the string "even_distribution"
	
	private String mStrategy;
	
	DispatchStrategy(String aStrategy) { // #1
		this.mStrategy = aStrategy;
	}
	
	private static final Map<String, DispatchStrategy> mLookup;
	
	static {
		mLookup = new HashMap<String, DispatchStrategy>();
		for (DispatchStrategy lStrategy: DispatchStrategy.values()) {
			mLookup.put(lStrategy.getStrategy(), lStrategy);
		}
	}
	
	@Override
	public String toString() {
		return mStrategy;
	}
	
	public String getStrategy() {
		return mStrategy;
	}
	
	public static DispatchStrategy getStrategy(String aStrategy) {
		DispatchStrategy lResult = mLookup.get(aStrategy);
		return lResult;
	}
	
}
