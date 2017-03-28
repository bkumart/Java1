package testngFiles;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Annotations2 {

	
	@BeforeSuite
	public void isntallsoftware()
	{
		
		System.out.println("I am the First");
	}
	
	@AfterSuite
	public void deisntallsoftware()
	{
		
		System.out.println("I am the Last");
	}
}
