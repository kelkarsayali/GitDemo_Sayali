import java.time.Duration;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Udemy_Selenium\\SeleniumTraining\\Introduction\\DriversFolder\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Selenium_Chrome Browser\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		//Array
		String[] Mobile = {"iphone X","Samsung Note 8","Nokia Edge","Blackberry"};	
		int j=0;
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
	//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
	
		WebElement staticdropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(2);
		driver.findElement(By.id("signInBtn")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-link btn btn-primary']")));
		
		List <WebElement> products = driver.findElements(By.cssSelector("h4.card-title"));
		for(int i=0;i<products.size();i++)
		{
		 String name = products.get(i).getText();	
		// List MobileList= Arrays.asList(Mobile);
		  //if(MobileList.contains(name))
				  {
			  		driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
			  				
			  		if(j==Mobile.length)
	  				{
	  					break;
	  				}
				  }
			
			
		}
		driver.findElement(By.partialLinkText("Checkout")).click();}
			
		
		
		
	}


