package rahulshettyacademy.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import rahulshettyacademy.AbstractComponents.AbstractComponent;

public class ProductCataloague extends AbstractComponent {
	
	WebDriver driver;	
	
	public ProductCataloague(WebDriver driver)
	{
		//initilization
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	//Page factory
	@FindBy(css =".mb-3")
	List<WebElement> Products;
	
	@FindBy(css =".ng-animating")
	WebElement spinner;
	
	
	By productsBy = By.cssSelector(".mb-3")	;
	By addtocart = By.cssSelector(".card-body button:last-of-type");
	By toastMessage = By.cssSelector("#toast-container");
	
			
	
	public List<WebElement> getProductList()
	{
		waitForElementToAppear(productsBy);
		return Products;
		
	}
	
	public WebElement getProductByName(String productName)
	{
		WebElement prod = getProductList().stream().filter(product->product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
		return prod;
	
	}
	
	public void addProductToCart(String productName)
	{
		WebElement prod = getProductByName(productName);
		prod.findElement(addtocart).click();	
		waitForElementToAppear(toastMessage);
		//waitForElementToDisappear(spinner);
	
	}


	

	
	
	
}
