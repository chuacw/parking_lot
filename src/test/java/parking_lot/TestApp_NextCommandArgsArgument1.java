package parking_lot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestApp_NextCommandArgsArgument1 extends TestApp_Base {

    @Test
    public void test() {
    	String[] commandArgs = commandlineParser.nextCommandArgs();
    	assertEquals("The verb should be equal", commandArgs[0], verbPark);
    }
        
}

