package rahulshettyacademy.tests;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import rahulshettyacademy.TestComponents.BaseTest;
import rahulshettyacademy.pageobjects.CartPage;
import rahulshettyacademy.pageobjects.CheckoutPage;
import rahulshettyacademy.pageobjects.LandingPage;
import rahulshettyacademy.pageobjects.OrderPage;
import rahulshettyacademy.pageobjects.ProductCataloague;
import rahulshettyacademy.pageobjects.confirmationPage;

public class SubmitOrderTest extends BaseTest {
	String productName = "ZARA COAT 3";	
	@Test(dataProvider ="getData", groups = {"Purchase"})
	public void submitOrder(HashMap<String,String> input) throws IOException
	{	
		
			
		ProductCataloague productCataloague = landingPage.loginApplication(input.get("email"), input.get("password"));
	   // Assert.assertEquals("Incorrect email or password.", landingPage.getErrorMessage());
	    List<WebElement>products = productCataloague.getProductList();
		productCataloague.addProductToCart(input.get("product"));
		CartPage cartPage = productCataloague.goToCartPage();
		Boolean Match = cartPage.verifyProductDisplay(input.get("product"));
		//Assert.assertFalse(Match);
		Assert.assertTrue(Match);
		CheckoutPage checkoutPage = cartPage.goToCheckout();
		checkoutPage.selectCountry("india");
		confirmationPage ConfirmationPage = checkoutPage.submitOrder();
		String confirmPage = ConfirmationPage.getConfirmationMessage();
		Assert.assertTrue(confirmPage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));	
		//BaseTest baseTest = baseTest.landingPage();
		
		
	
	}
	
	@Test(dependsOnMethods = "submitOrder")	
	public void OrderHistoryTest()
	{
		//To verify ZARA COAT 3 is displaying in order list
		ProductCataloague productCataloague = landingPage.loginApplication("test2212@gmail.com", "Test@123");
		OrderPage orderPage = productCataloague.goToOrderPage();
		Assert.assertTrue(orderPage.verifyOrderDisplay(productName));
		
		
	}

	
	
	
	
	//Data parameterization
	@DataProvider
	public Object[][] getData() throws IOException 
	
	{
		
		List<HashMap<String , String>> data = getJsonDataToMap(System.getProperty("user.dir")+"//src//test//java//rahulshettyacademy//data//PurchaseOrder.json");
	   return new Object [] [] { {data.get(0)} , {data.get(1)} };
		
		
	}
	
	
	
	
	
	//public Object[][] getData()
//	{
//		return new Object [] [] { {"test2212@gmail.com", "Test@123" , "ZARA COAT 3" } , {"sayali@yahoo.com" ,  "Test@000", "ADIDAS ORIGINAL" } };
//	}
	
	}
//HashMap<String , String> map = new HashMap<String , String>();
//	map.put("email", "test2212@gmail.com");
//	map.put("password", "Test@123");
	//map.put("product", "ZARA COAT 3");
	
//	HashMap<String , String> map1 = new HashMap<String , String>();
	//map1.put("email", "sayali@yahoo.com");
//	map1.put("password", "Test@000");
//	map1.put("product", "ADIDAS ORIGINAL");

