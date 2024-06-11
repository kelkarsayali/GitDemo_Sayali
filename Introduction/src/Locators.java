import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome driver 114\\chromedriver.exe");
		WebDriver driver = new ChromeDriver( );
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("Sayali");
		driver.findElement(By.name("inputPassword")).sendKeys("hello.123");
		driver.findElement(By.className("signInBtn")).click();		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());		
		driver.findElement(By.linkText("Forgot your password?")).click();		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Sayali");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("kelkarsayali2@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("1234567890");	
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	
	
	    System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	   driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.cssSelector("#inputUsername")).sendKeys("sayali");
	   driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
	   Thread.sleep(1000);
	   driver.findElement(By.id("chkboxOne")).click();
	   driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		
		
		
		
		

	}

}
