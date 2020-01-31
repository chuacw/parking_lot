package parking_lot;

import java.util.ArrayList;

import org.junit.Before;

public class TestCreateParkingLotBase {

    protected BaseCommand mBaseCommand;
	protected String mCommandResult;
	protected int mCreateSlots;
	
    @Before
    public void setup(){
    	mBaseCommand = new CommandCreateParkingLot();
    	ArrayList<String> args = new ArrayList<String>();
    	mCreateSlots = 6;
    	args.add(Integer.toString(mCreateSlots));
    	mCommandResult = mBaseCommand.run(args);
    }

}
