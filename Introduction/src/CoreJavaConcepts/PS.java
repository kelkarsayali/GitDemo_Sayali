package CoreJavaConcepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS {

	public void doThis()
	{
		System.out.println("I am here");

	}

	@AfterMethod
	public void afterRun()
	{
	System.out.println("I will run last");
	}
	
	@BeforeMethod
	public void beforeRun()
	{
	System.out.println("I will run first");
	}

}
