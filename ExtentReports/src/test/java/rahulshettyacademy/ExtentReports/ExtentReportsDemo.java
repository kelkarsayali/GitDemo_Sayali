package rahulshettyacademy.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsDemo {
	
	ExtentReports extent;
	
	
	@BeforeTest
	public void config()	
	{
		
		//ExtentReport, ExtentSparkReporter		
	    //For some basic configuration like create a folder, giving a name for report etc
		
		String path = System.getProperty("user.dir")+"//reports//index.html";
	    ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web AutmationResults");
		reporter.config().setDocumentTitle("Test Results");
		
		
		//For attaching a report
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Sayali");
		
		
		
	}

	@Test
	
	public void initialDemo()
	{
		ExtentTest test = extent.createTest("Initial Demo");		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Chrome driver 118\\chromedriver-win64\\Chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		driver.close();
		test.fail("result do no match");
	
        extent.flush();
		
		
		
	}
}
