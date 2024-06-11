package rahulshettyacademy.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.AbstractComponents.AbstractComponent;

public class CheckoutPage extends AbstractComponent {

	WebDriver driver;
	public CheckoutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy(css = (".actions a"))
	//@FindBy(css = (".action__submit"))
	//@FindBy(css =".btnn.action__submit.ng-star-inserted")
	//WebElement Submit;
	
	@FindBy(xpath = ("//input[@placeholder='Select Country']"))
	WebElement Country;
	
	@FindBy(css = (".ta-item:nth-of-type(2)"))
	WebElement SelectCountry;
	
	By results = By.cssSelector(".ta-results");
	
	public void selectCountry(String CountryName)
	{
		Actions a = new Actions(driver);
		a.sendKeys(Country, CountryName).build().perform();
		
		waitForElementToAppear(By.cssSelector(".ta-results"));
		SelectCountry.click();
	}
	
	public confirmationPage submitOrder()
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement ele = driver.findElement(By.cssSelector(".action__submit"));
		jse.executeScript("arguments[0].click()", ele);
		//Submit.click();
		return new confirmationPage(driver);
	}
	

}
