package Faker;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload {
	public static void main(String[] args) throws AWTException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.leafground.com/file.xhtml");

		Actions Ax = new Actions(driver);
		WebElement Submit = driver.findElement(By.xpath("//span[text()='Choose']"));
		Ax.click(Submit).perform();

		// click on ‘Choose file’ to upload the desired file
		Submit.sendKeys("C:\\Users\\Admin\\Desktop\\New folder (2)\\SK (1)\\SK\\Faker\\Screenshot\\dummy.pdf"); // Uploading
																												// the
																												// file
																												// using
																												// sendKeys
		System.out.println("File is Uploaded Successfully");

	}

}
