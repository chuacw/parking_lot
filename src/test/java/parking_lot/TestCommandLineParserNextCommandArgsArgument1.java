package parking_lot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCommandLineParserNextCommandArgsArgument1 extends TestCommandLineParserBase1 {

    @Test
    public void test() {
    	String[] commandArgs = commandlineParser.nextCommandArgs();
    	assertEquals("The verb should be equal", commandArgs[0], verbPark);
    }
        
}

