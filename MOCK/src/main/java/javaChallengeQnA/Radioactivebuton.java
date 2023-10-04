package Faker;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radioactivebuton {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");

		WebElement Click = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", Click);

		if (Click.isEnabled()) {
			Actions Ax=new Actions(driver);
			Ax.click(Click);
			System.out.println("Clicked");
		} else {
			System.out.println("Not Clicked");
		}
		
		WebElement Click1 = driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[1]"));
		js.executeScript("arguments[0].click();", Click1);

		if (Click1.isEnabled()) {
			Actions Ax=new Actions(driver);
			Ax.click(Click1);
			System.out.println("Clicked1");
		} else {
			System.out.println("Not Clicked1");
		}
		
		
		WebElement Click2 = driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']//div[1]"));
	//	js.executeScript("arguments[0].click();", Click2);
		Click2.click();
		if (Click2.isEnabled()) {
			//Actions Ax=new Actions(driver);
			//Ax.click(Click2);
			System.out.println("Clicked2");
		} else {
			System.out.println("Not Clicked2");
		}
	}

}
