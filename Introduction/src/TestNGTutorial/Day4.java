package TestNGTutorial;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
 
	
	
	@Test
	public void webloginHomeLoan()
	{
		//selenium code
		System.out.println("web login Home");
	}
	@Test(groups= {"smoke"})
	public void MobileloginHomeloan()
	{
		System.out.println("Mobile login Home");
	}
	
	
	@Test
	@Parameters({"URL"})
	public void LoginAPIHomeloan(String urlname1)
	{
		System.out.println("API login Home");
		System.out.println(urlname1);
	}
	
	}


