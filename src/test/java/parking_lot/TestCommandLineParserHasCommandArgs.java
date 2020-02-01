package parking_lot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCommandLineParserHasCommandArgs extends TestCommandLineParserBase1 {

    @Test
    public void test() {
    	assertEquals("App should have command arguments", commandlineParser.hasCommandArgs(), true);
    }
    
}
