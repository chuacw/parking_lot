package parking_lot;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestBaseCommand1 extends TestBaseCommand {
    @Test
    public void test() {
    	assertEquals("BaseCommand ", mBaseCommand.getCommand(), BaseCommand.cCreateParkingLot);
    }

}
