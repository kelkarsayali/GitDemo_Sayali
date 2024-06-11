package TestNGTutorial;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
public class Day1 {
	
	
	@AfterTest
	public void lasttest()
	{
		System.out.println("I will run last");
	}
	
	@Test(groups= {"smoke"})
		public  void demo()
		{
			System.out.println("sayali");
		}
		
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("I am the last");
	}
	@Test(enabled = false)
	public void secondclass()
	{
		System.out.println("sanket");
	}
			

		




	}


