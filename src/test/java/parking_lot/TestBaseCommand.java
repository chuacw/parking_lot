package parking_lot;

import org.junit.Before;

public class TestBaseCommand {

	protected BaseCommand mBaseCommand;
	
    @Before
    public void setup(){
    	mBaseCommand = new BaseCommand(BaseCommand.cCreateParkingLot, 1);
    }

}
