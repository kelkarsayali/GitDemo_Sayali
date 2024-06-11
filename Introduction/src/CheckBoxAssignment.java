import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAssignment {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Chrome driver 114\\chromedriver.exe");
		WebDriver driver = new ChromeDriver( );
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption1")).click();
	    System.out.println(	driver.findElement(By.id("checkBoxOption1")).isSelected());
		Thread.sleep(3000);
		driver.findElement(By.id("checkBoxOption1")).click();
	    System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
	    
	    System.out.print(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

	}

}
