package Faker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.leafground.com/select.xhtml");

		// 1 selected
		WebElement Drop = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select sel = new Select(Drop);
		sel.selectByVisibleText("Selenium");

		// 2 selected
		WebElement Drop1 = driver.findElement(By.xpath("//label[text()='Select Country']"));
		Drop1.click();

		driver.findElement(By.xpath("//li[text()='Brazil']")).click();

	

	}

}
