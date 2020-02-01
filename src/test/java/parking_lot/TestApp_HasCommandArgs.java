package parking_lot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestApp_HasCommandArgs extends TestApp_Base {

    @Test
    public void test() {
    	assertEquals("App should have command arguments", commandlineParser.hasCommandArgs(), true);
    }
    
}
