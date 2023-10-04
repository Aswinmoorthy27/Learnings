package Faker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicitywait {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.leafground.com/waits.xhtml");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		WebElement Ele = driver.findElement(By.xpath("(//span[text()='Click'])[3]"));
		wait.until(ExpectedConditions.elementToBeClickable(Ele)).click();

		if (Ele.isEnabled()) {
			System.out.println("Clicked");
		}

	}

}
