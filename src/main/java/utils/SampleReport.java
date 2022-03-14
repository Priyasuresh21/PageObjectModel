package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {
	
	@Test
	public void generateReport() {
		
		// start report
		ExtentReports report = new ExtentReports("./reports/Result.html", false);
		
		// start test
		ExtentTest test = report.startTest("TC005", "To verify IRCTC registration for the new user");
		
		test.assignAuthor("Priya");
		test.assignCategory("Regression");
		
		// log test steps
		test.log(LogStatus.PASS	, "The application got launched successfully with the given url");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given url");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given url");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given url");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given url");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given url");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given url");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given url");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given url");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given url");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given url");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given url");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given url");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given url");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given url");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given url");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given url");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given url");
		test.log(LogStatus.PASS	, "The application got launched successfully with the given url");
		
		
		// end test
		report.endTest(test);
		
		// end report
		report.flush();
		
	}
	
	

}
