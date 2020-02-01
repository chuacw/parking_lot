package parking_lot;

import static org.junit.Assert.assertArrayEquals;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;

public class TestApp_initScanner_File {

	protected App mApp;

	@Before
	public void setup() {
		mApp = new App();

		ClassLoader classLoader = getClass().getClassLoader();
		URL lFileResource2 = classLoader.getResource("testfile.txt");
		File lFile = new File(lFileResource2.getFile());	
		mApp.initScanner(lFile);
	}

	@Test
	public void test() {
		String[] lActualCommandArg = mApp.nextCommandArgs();
		String[] lExpectedArg = { "1", "2" };
		assertArrayEquals("Should be '1 2'", lExpectedArg, lActualCommandArg);
	}

}
