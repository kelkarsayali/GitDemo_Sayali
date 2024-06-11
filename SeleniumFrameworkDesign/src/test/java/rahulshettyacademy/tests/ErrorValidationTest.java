package rahulshettyacademy.tests;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import rahulshettyacademy.TestComponents.BaseTest;
import rahulshettyacademy.TestComponents.Retry;
import rahulshettyacademy.pageobjects.CartPage;
import rahulshettyacademy.pageobjects.CheckoutPage;
import rahulshettyacademy.pageobjects.LandingPage;
import rahulshettyacademy.pageobjects.ProductCataloague;
import rahulshettyacademy.pageobjects.confirmationPage;

public class ErrorValidationTest extends BaseTest {

	@Test(groups = {"ErrorHandling"} , retryAnalyzer =Retry.class ) 
	public void LoginErrorValidation() throws IOException, InterruptedException
	{	
		
		landingPage.loginApplication("test2212@gmail.com", "Test@000");
		
		//String productName = "ZARA COAT 3";		
		//ProductCataloague productCataloague = landingPage.loginApplication("test2212@gmail.com", "Test@000");
		Assert.assertEquals("Incorrect email password.", landingPage.getErrorMessage());
		
	
	}
	
	@Test
	public void ProductErrorValidation() throws InterruptedException
	
	{
		String productName = "ZARA COAT 3";
		ProductCataloague productCataloague = landingPage.loginApplication("test2212@gmail.com", "Test@123");
		Thread.sleep(4000);
		List<WebElement>products = productCataloague.getProductList();
		Thread.sleep(4000);
		productCataloague.addProductToCart(productName);
		CartPage cartPage = productCataloague.goToCartPage();
		Boolean Match = cartPage.verifyProductDisplay("ZARA COAT 33");
		Assert.assertFalse(Match);
	}
	
	
	}

