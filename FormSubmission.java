package Seljava0;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormSubmission {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\spicejet.com");
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        driver.findElement(By.cssSelector("a[value='GOI']")).click();
        
        
        Select dropdown=new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));
        dropdown.selectByIndex(4);

        dropdown.selectByVisibleText("9 Adults");

        dropdown.selectByValue("8"); 
        System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

        driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();

        System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

        driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();

        System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
	}

}

