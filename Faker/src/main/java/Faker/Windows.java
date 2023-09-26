package Faker;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.leafground.com/window.xhtml");

		driver.findElement(By.xpath("//span[text()='Open']")).click();
		String Parent = driver.getTitle();
		System.out.println(Parent);

		Set<String> window = driver.getWindowHandles();
		int len = window.size();
		System.out.println(len);

		List<String> wind = new ArrayList<String>(window);
		System.out.println(wind);

		driver.switchTo().window(wind.get(1));
		String Child = driver.getTitle();

		if (!Parent.equals(Child)) {
			System.out.println("Switched to next wind");
		} else {
			System.out.println("Not switched");
		}

		File screenshotFile = driver.getScreenshotAs(OutputType.FILE);

		// Define the destination location for the screenshot
		File destinationFile = new File("target/screenshot.png");

		// Copy the screenshot to the destination location
		FileUtils.copyFile(screenshotFile, destinationFile);
	}
}