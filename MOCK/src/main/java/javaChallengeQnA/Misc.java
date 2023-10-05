package Faker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Misc {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.leafground.com/messages.xhtml");

		WebElement Info = driver.findElement(By.xpath("//span[text()='Info']"));
		Info.click();

		String Value = Info.getText();
		System.out.println(Value);
		if (Info.isEnabled()) {
			driver.findElement(By.xpath("//li[@role='alert']")).click();
			System.out.println("Message verified");
		} else {
			System.out.println("Message Not verified");
		}

		// 2element
		Thread.sleep(5000);
		WebElement Info2 = driver.findElement(By.xpath("(//span[text()='Info'])[2]"));
		Info2.click();

		String Value2 = Info2.getText();
		System.out.println(Value2);
		if (Info2.isEnabled()) {
			Thread.sleep(5000);
			// driver.findElement(By.xpath("//div[@class='ui-growl-message']")).click();
			System.out.println("Toaster verified");
		} else {
			System.out.println("Toaster Not verified");
		}

		// 3
		WebElement Submit = driver.findElement(By.xpath("//span[text()='Submit']"));
		Submit.click();

		if (Submit.isEnabled()) {
			driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Test");
			driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Demo");
			driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("test@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[text()='Submit']")).click();
		} else {
			System.out.println("Re-Check");
		}
	}

}
