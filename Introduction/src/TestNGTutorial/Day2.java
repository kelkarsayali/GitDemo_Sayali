package TestNGTutorial;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

	@Test(groups= {"smoke"})
	public void thirdclass()
	{
		System.out.println("hi");
	}
	
	@BeforeTest
	public void firsttest()
	{
		System.out.println("I will run first");
	}
			
	}


