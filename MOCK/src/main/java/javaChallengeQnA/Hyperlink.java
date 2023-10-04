package Faker;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hyperlink {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		
		driver.findElement(By.xpath("(//a[@class='ui-link ui-widget'])[1]")).click();
		
	}

}
