package Faker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();

		Thread.sleep(2000);
		WebElement Text = driver.findElement(By.xpath("//div[@class='post-header']"));
		String value = Text.getText();
		if (value.contentEquals("Logged In Successfully")) {
			System.out.println("Verified - Successfull");
		} else {
			System.out.println("Verified - Not Successfull");

		}

		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		
		driver.close();
	}

}
