package testScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample_2Test {
	@Test
	public void testCase1() {
		Reporter.log("Sample Class 2 tc01 is Excuted", true);
	}
	
	@Test
	public void testCase2() {
		Reporter.log("Sample Class 2 tc02 is Excuted", true);
	}
	//If we didn't give 'Test' at the end of the class that will not get execute while we try to run in pom.xml

}
