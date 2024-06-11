import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException  {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Chrome driver 114\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Chrome driver 118\\chromedriver-win64\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver( );
		//driver.manage().window().maximize();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Udemy_Selenium\\SeleniumTraining\\Introduction\\DriversFolder\\chromedriver.exe");
		ChromeOptions Chrome = new ChromeOptions();
		Chrome.setBinary("C:\\Selenium_Chrome Browser\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(Chrome);
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(10000);
		List<WebElement> options =  driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	    for(WebElement option : options)   
	    {
	      if(option.getText().equalsIgnoreCase("India"))
	      {
	    	  option.click();
	      break;
	      }
	    
	    
		
		
		
		
		
		
		
	}}
}

