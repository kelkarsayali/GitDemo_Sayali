import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Udemy_Selenium\\SeleniumTraining\\Introduction\\DriversFolder\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Selenium_Chrome Browser\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		 System.out.println(driver.findElements(By.tagName("iframe")).size()); //to get total frames in application
		 //switch to frame using web element
	//	driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		 //switch to frame using index
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("draggable"));	
		WebElement target = driver.findElement(By.id("droppable"));	
		Actions a = new Actions(driver); 
		a.dragAndDrop(source, target).build().perform();
		//navigate back to out of frame
		driver.switchTo().defaultContent();
		
	}

}