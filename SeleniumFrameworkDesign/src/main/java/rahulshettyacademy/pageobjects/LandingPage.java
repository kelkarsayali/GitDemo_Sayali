package rahulshettyacademy.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.AbstractComponents.AbstractComponent;

public class LandingPage extends AbstractComponent {
	
	WebDriver driver;	
	
	public LandingPage(WebDriver driver)
	{
		super(driver);
		//initilization
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
//	WebElement Email = driver.findElement(By.id("userEmail"));
	
	//Page factory
	@FindBy(id ="userEmail")
	WebElement Email;
	
	@FindBy(id ="userPassword")
	WebElement Password;
	
	@FindBy(id ="login")
	WebElement Submit;
	
	//@FindBy(css ="[class*='flyInOut']")
	//WebElement errorMessage;
	
	@FindBy(xpath ="//div[@id='toast-container']")
	WebElement errorMessage;
	
	
	
	

	public ProductCataloague loginApplication(String EmailId, String Pwd)
	{
		Email.sendKeys(EmailId);
		Password.sendKeys(Pwd);
		Submit.click();
		ProductCataloague productCataloague = new ProductCataloague(driver);	
		return productCataloague;
	}
	
	
	public String getErrorMessage()
	{
		waitForWebElementToAppear(errorMessage);
		return errorMessage.getText();
	//	errorMessage.getText();
	//return errorMessage;
	
		
	}
	
	
	public void goTo()
	{
		driver.get("https://rahulshettyacademy.com/client");
	}
	
	
	
}
