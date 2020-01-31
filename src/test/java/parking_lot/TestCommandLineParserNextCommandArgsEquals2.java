package parking_lot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCommandLineParserNextCommandArgsEquals2 extends TestCommandLineParserHasCommandArgs {

    @Test
    public void test() {
    	String[] commandArgs = commandlineParser.nextCommandArgs();
    	assertEquals("The number of arguments should be equal", commandArgs.length, 2);
    }

}

