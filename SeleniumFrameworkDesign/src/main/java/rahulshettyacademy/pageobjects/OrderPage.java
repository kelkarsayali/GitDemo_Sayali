package rahulshettyacademy.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import rahulshettyacademy.AbstractComponents.AbstractComponent;

public class OrderPage extends AbstractComponent {
	
	WebDriver driver;	
	
	@FindBy(css = ("tr td:nth-child(3)"))
	private List<WebElement> productNames;
	
	@FindBy(css = (".totalRow button"))
	WebElement checkoutEle;
	
	
	
	public OrderPage(WebDriver driver)
	{
		//initilization
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

			
	
	public Boolean verifyOrderDisplay(String productName)
	{
		
		Boolean match = productNames.stream().anyMatch(CartProduct-> CartProduct.getText().equalsIgnoreCase(productName));
		return match;
	}
	
	
	
	


	

	
	
	
}
