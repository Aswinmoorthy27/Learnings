package Faker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.leafground.com/waits.xhtml");

		// implicity wait
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		// 10sec wait
		driver.findElement(By.xpath("(//span[text()='Click'])[1]")).click();

		// 10sec invisible wait
		WebElement Click = driver.findElement(By.xpath("(//span[text()='Click'])[2]"));
		Click.click();

		 if(Click.isEnabled()) 
		 {
			 System.out.println("Clicked");
		 }else 
		 {
			 System.out.println("Not Clicked");
		 }
		 
		 //Explicitly wait
		// WebDriverWait wait = new WebDriverWait(driver, 90);
	    WebElement elementToClick = driver.findElement(By.xpath("//span[text()='Click First Button']"));
	    elementToClick.click();
	    
	    WebElement Verify =  driver.findElement(By.xpath("//div[@role='alert']"));
	    Verify.click();

	    
	     if(Verify.isDisplayed()) 
	     {
	    	 System.out.println("Appeared");
	     }else 
	     {
	    	 System.out.println("Not- Appeared");

	     }
          	
	}

}
