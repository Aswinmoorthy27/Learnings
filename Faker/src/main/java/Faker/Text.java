package Faker;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Text {
	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.leafground.com/input.xhtml");

		driver.findElement(By.xpath("//input[@id='j_idt88:name']")).sendKeys("Aswin");
		driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']")).sendKeys("26");
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//input[@id='j_idt106:float-input']")).sendKeys("Test");
		
		driver.findElement(By.xpath("//input[@disabled='disabled']"));
		
		driver.findElement(By.xpath("//div[@id='j_idt106:auto-complete']")).sendKeys("TEST");

	}

}
