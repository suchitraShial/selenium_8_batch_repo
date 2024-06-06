package extentreport;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReport {
	@Test
	
	public void report() {
	 String TIME=LocalDateTime.now().toString().replace(":", "-");
//step-1:create ExtentSparkReporter object
		ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_reports/extentReport"+TIME+".html");
		//step-2: create extentReports object
		ExtentReports extReport=new ExtentReports();
		//step-3:attach spark reporter to ExtentReports
		extReport.attachReporter(spark);
		//step-4:create extentTest object
		ExtentTest test= extReport.createTest("report");
		
		//step-5:call log() to provide status
		test.log(Status.PASS, "log message added into extent reports");
		
		//step-6:call flush() to write report into destination
		extReport.flush();

	}
}
