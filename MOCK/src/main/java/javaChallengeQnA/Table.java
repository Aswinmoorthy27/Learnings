package Faker;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.leafground.com/table.xhtml");

		driver.findElement(By.xpath("(//div[@class='col-12']//div)[1]")).click();

		WebElement Table = driver.findElement(By.xpath("(//table[@role='grid'])[1]"));
		Table.click();

		//get Header value
		List<WebElement> Listvalue = driver.findElements(By.tagName("th"));
		
		List<WebElement> Addvalue=new ArrayList<WebElement>(Listvalue);
		
		for(WebElement Value:Listvalue) 
		{
		     String Currentvalue=Value.getText();
		     System.out.println(Currentvalue);
		}
		
		//sort
		driver.findElement(By.xpath("(//th[@scope='col'])[2]")).click();
		
		//get row value
		List<WebElement> rowvalue = driver.findElements(By.tagName("tr"));
		List<WebElement> rowAddvalue=new ArrayList<WebElement>(rowvalue);

		for(WebElement RValue:rowAddvalue) 
		{
		     String RCurrentvalue=RValue.getText();
		     System.out.println(RCurrentvalue);
		}
		
		
		List<WebElement> Singlevalue = 	driver.findElements(By.tagName("td"));
		 WebElement Text=driver.findElement(By.xpath("//*[text()='Argentina']"));
		 Text.click();
		String tx= Text.getText();		
		if(tx.equals("Argentina")) 
		{
			Assert.isTrue(true, tx, "Argentina");
			System.out.println("Argentina");
			
		}else 
		{
			Assert.isTrue(false, tx, "Argentina");
			System.out.println("Not Argentina");
		}
		
		// column  status
		
				 WebElement StatusText=driver.findElement(By.xpath("(//span[text()='NEW'])[1]"));
				 StatusText.click();
				String Status= StatusText.getText();		
				if(Status.equals("NEW")) 
				{
					Assert.isTrue(true, Status, "NEW");
					System.out.println("NEW");
					
				}else 
				{
					Assert.isTrue(false, Status, "NEW");
					System.out.println("Not NEW");
				}
			
				//pagination
				driver.findElement(By.linkText("2")).click();
	}
}
