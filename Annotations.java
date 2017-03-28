package testngFiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeTest
	public void method1(){
		System.out.println("Beforetest");
	}
	
	
	@BeforeMethod
	public void UseridGeneration()
	{
		System.out.println("This block executes before each Test");
	}
	
	
	@AfterTest
	public void Cookiesclose()
	{
		System.out.println("This block executes after all  Testcases");
	
	}
	
	@AfterMethod
	public void Reportadding()
	{
		System.out.println("This block executes after each Test");
	}
	
		
	@Test
	public void OpeningBrowser()
	{
	//this opens the browser
	System.out.println("test");
	
	}

	@Test
	public void FlightBooking()
	{
		System.out.println("FLight Booking");
		
	}
	
}
