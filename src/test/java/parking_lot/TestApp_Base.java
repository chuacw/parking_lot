package parking_lot;

import org.junit.Before;

public class TestApp_Base {

	protected App commandlineParser;
	protected static String verbPark = "park";
	protected static String verbTest = "test";
	
    @Before
    public void setup(){
    	commandlineParser = new App();
    	commandlineParser.initScanner(verbPark + App.delimiter + verbTest);
    }

}
