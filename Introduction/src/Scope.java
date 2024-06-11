import java.util.Set;
import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Udemy_Selenium\\SeleniumTraining\\Introduction\\DriversFolder\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Selenium_Chrome Browser\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com/practice.php");
	//1. give me the no. of count of links on the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
	//2. Give me the count of links in footer section
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
	    System.out.println(footerdriver.findElements(By.tagName("a")).size());
	    
	//3. Give me the count of links in 1st column of footer section
	    WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	    System.out.println(columndriver.findElements(By.tagName("a")).size());
	    
	 //4. Click on each link of the 1st column
	    for(int i =1;i<=columndriver.findElements(By.tagName("a")).size();i++)
	    {
	    	//Click Control+enter to open a link in new tab
	    	String ClickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER); 
	    	columndriver.findElements(By.tagName("a")).get(i).sendKeys(ClickonlinkTab);
	    	Thread.sleep(5000);
	    }
	  //5. Get the title of each page
	    	Set <String> abc = driver.getWindowHandles();
	    	Iterator <String> it = 	abc.iterator();
	    	
	    	while(it.hasNext())
	    	{
	    		driver.switchTo().window(it.next());
	    		System.out.println(driver.getTitle());
	    		
	    		
	    	}
	    	
	    	}
	    
	 
	    
}

