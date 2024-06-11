import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.commons.io.FileUtils;

public class Miscelleanous {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Udemy_Selenium\\SeleniumTraining\\Introduction\\DriversFolder\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Selenium_Chrome Browser\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.get("https://www.google.com");
		
		
		
		//rearrange a screenshot by date and time
		Date Currentdate = new Date(0);
		System.out.println(Currentdate);
		String currentdate =	Currentdate.toString().replace("-", ":");
		
		//screenshot
				File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src,new File("C:\\Sayali\\screenshot" +"currentdate" +".png"));
	}
	

}
