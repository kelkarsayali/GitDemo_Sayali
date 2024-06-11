import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Chrome driver 114\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Udemy_Selenium\\SeleniumTraining\\Introduction\\DriversFolder\\chromedriver.exe");
		ChromeOptions Chrome = new ChromeOptions();
		Chrome.setBinary("C:\\Selenium_Chrome Browser\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(Chrome);			
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value=\"BHO\"]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath(" (//a[@value=\"GOI\"])[2]")).click();
		//parent child x path for GOA
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOI']")).click();
		
		//select a current date from Depart date
		//a[@class='ui-state-default ui-state-highlight']
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		

	}

}
