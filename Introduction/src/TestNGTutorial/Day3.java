package TestNGTutorial;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	@Parameters({"URL","APIKey/Username"})
	@Test
	public void webloginCarLoan(String urlname, String key)
	{
		//selenium code
		System.out.println("web login car");
		System.out.println(urlname);
		System.out.println(key);
		
	}
	@Test
	public void MobileloginCarloan()
	{
		System.out.println("Mobile login car");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("I will execute before every test method in day 3 class");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("I will execute after every test method in day 3 class");
	}
	
	@Test(dependsOnMethods={"webloginCarLoan", "MobileSigninCarloan"})
	public void LoginAPICarloan()
	{
		System.out.println("API login car");
	}
	
	@Test(dataProvider="getData")
	public void MobileSigninCarloan(String username, String Password)
	{
		System.out.println("Mobile sign out car");
		System.out.println(username);
		System.out.println(Password);
	}
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("I am a no 1");
	}
	@Test(groups= {"smoke"})
	public void MobileSignoutCarloan()
	{
		System.out.println("Mobile login car");
	}
	
	
	
	@DataProvider
	public Object[][] getData()
	{
		//1st : username password - good credit history
		//2nd : username password - No credit history
		//3rd : fraudelent credit history
		
		Object[][] data = new Object[3][2];
		//1st combination
		data [0][0] = "firstsetusername";
		data [0][1] = "password";
		
		//2nd combination
		data[1][0] = "secondusername";
		data [1][1] = "secondpassword";
		
		//3rd combination
		data [2][0] = "thirdusername";
		data [2][1] = "thirdpassword";
		
		return data;
		
	}
	
	
	
	}


