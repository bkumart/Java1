package SelJava1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelJava1 {


		public static void main(String [] args) {
			
			System.setProperty("webdriver.gecko.driver", "C:/Users/geckodriver.exe");
			
			WebDriver auto = new FirefoxDriver();
		
			
			auto.get("http://www.seleniumhq.org/projects/webdriver/");
			
			List<WebElement> chey = auto.findElements(By.xpath(".//*[@id='header']"));
			
			System.out.println(chey.size());
			
			for(int i=0; i < chey.size(); i++){
				
				System.out.println(chey.get(i).getAttribute("href"));
			}
			
		}

	}

