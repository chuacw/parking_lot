package parking_lot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestApp_NextCommandArgsArgument2 extends TestAppBase {

    @Test
    public void test() {
    	String[] commandArgs = commandlineParser.nextCommandArgs();
    	assertEquals("The command should be equal", commandArgs[1], verbTest);
    }
        
}
