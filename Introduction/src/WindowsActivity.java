import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsActivity {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome driver 114\\chromedriver.exe");
		WebDriver driver = new ChromeDriver( );
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.navigate().back();
		driver.navigate().forward();

	}

}
