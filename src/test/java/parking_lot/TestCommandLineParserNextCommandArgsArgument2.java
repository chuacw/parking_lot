package parking_lot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCommandLineParserNextCommandArgsArgument2 extends TestCommandLineParserBase1 {

    @Test
    public void test() {
    	String[] commandArgs = commandlineParser.nextCommandArgs();
    	assertEquals("The command should be equal", commandArgs[1], verbTest);
    }
        
}
