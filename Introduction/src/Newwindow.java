import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Newwindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Udemy_Selenium\\SeleniumTraining\\Introduction\\DriversFolder\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Selenium_Chrome Browser\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.WINDOW);
	    Set<String> handles = driver.getWindowHandles();
	    Iterator<String> it=  handles.iterator();
	   String parentWindowID =  it.next();
	   String childWindowID = it.next();		
	   driver.switchTo().window(childWindowID);
	   driver.get("https://rahulshettyacademy.com/");
	   String name =  driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']")).get(1).getText();
	   driver.switchTo().window(parentWindowID);
	   driver.findElement(By.xpath("//input[@name='name']")).sendKeys(name);
	   
		

	}

}
