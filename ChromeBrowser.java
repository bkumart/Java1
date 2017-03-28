package SelJava3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/chromedriver.exe"); 
		
		WebDriver selenium = new ChromeDriver();
		
        selenium.get("http:/google.com");
		selenium.findElement(By.id("lst-ib")).sendKeys("Sachin");
		selenium.findElement(By.name("btnK")).submit();
		System.out.println(selenium.getPageSource());
		System.out.println(selenium.getTitle());
		selenium.findElement(By.xpath("//*[@id='hdtb-msb']/div[1]/div[2]/a")).click();
		
	}
}
