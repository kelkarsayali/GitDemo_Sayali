package POC_NatureFit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BMICalculator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Udemy_Selenium\\SeleniumTraining\\Introduction\\DriversFolder\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Selenium_Chrome Browser\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://naturefit.in/profile1");		
				
		//select Gender drop down
		WebElement staticdropdown = driver.findElement(By.xpath("//select[@class='select-options']"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(1);
		
		System.out.print(dropdown.getFirstSelectedOption().getText());
		//enter values in Weight,Height,Neck,Chest,Waist,Hip CIRCUMFERENCE
		driver.findElement(By.id("__BVID__157")).sendKeys("60");
		driver.findElement(By.id("__BVID__158")).sendKeys("5.5");
		driver.findElement(By.id("__BVID__159")).sendKeys("5");
		driver.findElement(By.id("__BVID__160")).sendKeys("38");
		driver.findElement(By.id("__BVID__161")).sendKeys("39");
		driver.findElement(By.id("__BVID__162")).sendKeys("42");
		//click on Calculate BMI button
		driver.findElement(By.xpath("//*[contains(text(),'CALCULATE BMI')]")).click();
		Thread.sleep(5000);
		//click on Calculate Fat button
		driver.findElement(By.xpath("//*[contains(text(),'CALCULATE FAT')]")).click();
		
		
		
	}
	

}
