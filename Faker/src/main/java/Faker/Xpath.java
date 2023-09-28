package Faker;

import java.io.IOException;
import java.text.ParseException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {
	public static void main(String[] args) throws InterruptedException, ParseException, IOException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		String Cnfverify = "";
		driver.get("https://www.leafground.com/button.xhtml");

		Actions Ac = new Actions(driver);

		WebElement Click = driver.findElement(By.xpath("//span[text()='Click']"));
		Click.click();

		WebElement ReclickSideelement = driver.findElement(By.xpath("(//a[contains(@href,'#')])[6]"));
		ReclickSideelement.click();

		Thread.sleep(1000);
		WebElement Button = driver.findElement(By.xpath("//a[@class='rotated-icon']"));
		Ac.moveToElement(Button).click().perform();

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).click();

		/// 3

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='Save'])")).click();

		// 4
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).click();

		// 5
		Thread.sleep(1400);
		driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();

		// 6 logo verify
		Thread.sleep(1400);
		driver.findElement(By.xpath("//span[text()='Image']")).click();

		WebElement Verifyimage = driver.findElement(By.xpath("//img[@id='j_idt88:j_idt102:j_idt104']"));
		Boolean p = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete "
				+ "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0",
				Verifyimage);

		// verify if status is true
		if (p) {
			System.out.println("Logo present");
		} else {
			System.out.println("Logo not present");
		}

		// 7 primary button verify
		WebElement Primary = driver.findElement(By.xpath("//span[text()='Primary']"));

		boolean isButtonPresent = Primary.isDisplayed();
		if (isButtonPresent) {
			System.out.println("Primary Button is present on the page.");
		} else {
			System.out.println("Primary Button is not present on the page.");
		}

		// 8 primary button verify
		WebElement Secondary = driver.findElement(By.xpath("//span[text()='Secondary']"));

		boolean isButtonSecondaryPresent = Primary.isDisplayed();
		if (isButtonSecondaryPresent) {
			System.out.println("Secondary Button is present on the page.");
		} else {
			System.out.println("Secondary Button is not present on the page.");
		}

	}

}
