package POC;

import org.openqa.selenium.chrome.ChromeOptions;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Udemy_Selenium\\SeleniumTraining\\Introduction\\DriversFolder\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Selenium_Chrome Browser\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
		
		WebDriver driver = new ChromeDriver(options);		
		driver.manage().window().maximize();
		driver.get("https://naturefit.in/");

	}

}