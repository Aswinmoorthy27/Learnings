package Faker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Menu {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.leafground.com/menu.xhtml");
		
		driver.findElement(By.xpath("(//a[@role='menuitem'])[1]")).click();
		
		Actions Ax=new Actions(driver);
		 WebElement  Mv= driver.findElement(By.xpath("(//a[@role='menuitem'])/span[text()='New']"));
		Ax.moveToElement(Mv).click().perform();
	}
}
