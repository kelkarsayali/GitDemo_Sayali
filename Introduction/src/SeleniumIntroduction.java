import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
public class SeleniumIntroduction {

	public static void main(String[] args) {
		
	//ChromeDriver driver = new ChromeDriver( );
	System.setProperty("webdriver.chrome.driver", "C:\\Chrome driver 114\\chromedriver.exe");
	WebDriver driver = new ChromeDriver( );
	
	
	
	//WebDriver driver = new FirefoxDriver( );
	System.setProperty("webdriver.gecko.driver", "C:\\Udemy_Selenium\\geckodriver");
	
//	Webdriver.driver = new 
	driver.get("https://rahulshettyacademy.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.close(); 

	
	
	
		

}
}
