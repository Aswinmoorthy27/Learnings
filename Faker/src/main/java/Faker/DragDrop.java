package Faker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDrop {
	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.leafground.com/drag.xhtml");

		WebElement Drag = driver.findElement(By.xpath("(//div[@class='card'])[2]"));
		WebElement Drop = driver.findElement(By.xpath("(//div[@class='card'])[6]"));
		Actions Ac = new Actions(driver);
		Ac.dragAndDropBy(Drop, 120, 120).click().perform();
		
		
		/*
		 * WebElement DgDrop=driver.findElement(By.xpath("//div[@id='form:drop']"));
		 * WebElement
		 * DgTarget=driver.findElement(By.xpath("//div[@id='form:drag_content']"));
		 * Ac.dragAndDrop(DgDrop, DgTarget).click().perform();
		 */
	}

}
