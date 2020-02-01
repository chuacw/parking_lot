package parking_lot;

import static org.junit.Assert.assertArrayEquals;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;

import org.junit.Before;
import org.junit.Test;

public class TestApp_initScanner_File {

	protected App mApp;

	@Before
	public void setup() {
		mApp = new App();

		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("file/test.xml").getFile());		
	}

	@Test
	public void test() {
		String[] lActualCommandArg = mApp.nextCommandArgs();
		String[] lExpectedArg = { "add", "5" };
		assertArrayEquals("Should be 'add 5'", lExpectedArg, lActualCommandArg);
	}

}
