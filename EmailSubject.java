package SelJava3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/chromedriver.exe"); 
		
		WebDriver selenium = new ChromeDriver();
		
		selenium.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
        selenium.get("http:/gmail.com");
        System.out.println(selenium.getTitle());
        selenium.findElement(By.id("Email")).sendKeys("bharathktqa@gmail.com");
        selenium.findElement(By.id("next")).click();
        selenium.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("bharath_123");
		selenium.findElement(By.xpath("//*[@id='signIn']")).submit();
		
		selenium.findElement(By.xpath("//*[@id=':3c']")).click();;
		System.out.println(selenium.findElement(By.xpath("//*[@id=':ja']")));
		
		//System.out.println(selenium.getPageSource());
		//System.out.println(selenium.getTitle());
		
		
	}
}
