package Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.eia.gov/petroleum/gasdiesel/");

		driver.findElement(By.xpath("(//div[@class='basic-table']//table)[1]")).click();

		List<WebElement> element = driver.findElements(By.tagName("tr"));
		System.out.println(element);
		
		

	}
}
