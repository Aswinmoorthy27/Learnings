package Faker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		String Cnfverify = "";
		driver.get("https://www.leafground.com/dashboard.xhtml");

		driver.findElement(By.xpath("(//li[@id='menuform:j_idt39']//a)[1]")).click();

		Actions Ac = new Actions(driver);
		WebElement Actionsfield = driver.findElement(By.xpath("//a[.='Frame']"));
		Ac.moveToElement(Actionsfield).click().perform();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='card']")).click();

		driver.switchTo().frame(0);
		WebElement Text = driver.findElement(By.xpath("//button[text()='Click Me']"));
		Text.click();
		String VerifyText = Text.getText();
		if (VerifyText.equals(VerifyText)) {
			System.out.println("Frame0 Clicked");
		} else {
			System.out.println("Frame0 Not Clicked");
		}

		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@frameborder='0'])[3]")));
		// Frame 2 switch
		driver.switchTo().frame("frame2");
		WebElement Text1 = driver.findElement(By.id("Click"));
		Text1.click();
		String VerifyText1 = Text1.getText();
		if (VerifyText1.equals(VerifyText1)) {
			System.out.println("Frame1 One Clicked");
		} else {
			System.out.println("Frame1 Not Clicked");
		}

	}
}
