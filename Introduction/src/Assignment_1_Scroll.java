import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Assignment_1_Scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Udemy_Selenium\\SeleniumTraining\\Introduction\\DriversFolder\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Selenium_Chrome Browser\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		
		List<WebElement> price =driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));
		int sum = 0;
		for(int i=0;i<price.size();i++)
		{
			 System.out.println(Integer.parseInt(price.get(i).getText()));
			 sum = sum+Integer.parseInt(price.get(i).getText());
		}
		System.out.println(sum);

	}

}
