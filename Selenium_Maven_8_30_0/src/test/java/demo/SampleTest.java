package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest {
@Test
	
	public  void test() 
	{
	Reporter.log("sampletest class is executed....", true);	
        Reporter.log("sampletest class is modified....", true);	
        Reporter.log("sampletest class is added....", true);
	 Reporter.log("sampletest class is added", true);
	 Reporter.log("sampletest class is added again", true);	
		
	}
}
