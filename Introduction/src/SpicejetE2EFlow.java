import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SpicejetE2EFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		

		System.setProperty("webdriver.chrome.driver", "C:\\Udemy_Selenium\\SeleniumTraining\\Introduction\\DriversFolder\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Selenium_Chrome Browser\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		//select 'From' dropdown
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value=\"BHO\"]")).click();
		//select 'To' dropdown
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOI']")).click();
		//select current date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		//return date is enabled or not'
				System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
				if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
				{
					System.out.println("is enabled");
					Assert.assertTrue(false);
				}
				else
				{
					Assert.assertTrue(true);
				}
				
		//passenger
				driver.findElement(By.id("divpaxinfo")).click();
				System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
				int i =1;
				while(i<6)
				{
					driver.findElement(By.id("hrefIncAdt")).click();
					i++;
				}
				
				
				driver.findElement(By.id("btnclosepaxoption")).click();
				Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "6 Adult");
				System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
				
				
				//Click on search
				driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();

			}

		
		
		

	}


