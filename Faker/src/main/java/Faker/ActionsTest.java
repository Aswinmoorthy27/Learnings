package Faker;

import java.io.IOException;
import java.text.ParseException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsTest {

	public static void main(String[] args) throws InterruptedException, ParseException, IOException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		String Cnfverify = "";
		driver.get("https://www.leafground.com/dashboard.xhtml");

		driver.findElement(By.xpath("(//li[@id='menuform:j_idt39']//a)[1]")).click();

		Actions Ac = new Actions(driver);
		WebElement Actionsfield = driver.findElement(By.xpath("//a[.='Alert']"));
		Ac.moveToElement(Actionsfield).click().perform();

		Thread.sleep(1000);
		WebElement Show = driver.findElement(By.xpath("(//span[text()='Show'])"));
		Ac.moveToElement(Show).click().perform();

		driver.switchTo().alert().accept();

		WebElement verify = driver.findElement(By.id("simple_result"));
		String popupverify = verify.getText();

		if (popupverify.equals("You have successfully clicked an alert")) {

			System.out.println("Alert Verified Successfully");
		} else {
			System.out.println("Not Verified");
		}

		// Confirm Alert
		Thread.sleep(1000);
		WebElement Show1 = driver.findElement(By.xpath("(//span[text()='Show'])[2]"));
		Ac.moveToElement(Show1).click().perform();

		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();

		WebElement verifyCanel = driver.findElement(By.id("result"));
		String Cancelverify = verifyCanel.getText();

		if (Cancelverify.equals("User Clicked : Cancel")) {

			Thread.sleep(1000);
			WebElement ReClick = driver.findElement(By.xpath("(//span[text()='Show'])[2]"));
			Ac.moveToElement(ReClick).click().perform();

			Thread.sleep(1000);
			driver.switchTo().alert().accept();
			WebElement ConfirmVerify = driver.findElement(By.id("result"));
			Cnfverify = ConfirmVerify.getText();
			System.out.println(Cnfverify);

		} else {
			System.out.println("not clicked");
		}

		// simple alert
		Thread.sleep(1000);
		WebElement SimpleAlert = driver.findElement(By.xpath("(//span[text()='Show'])[3]"));
		Ac.moveToElement(SimpleAlert).click().perform();

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@role='dialog'])[1]")).click();

		WebElement click = driver.findElement(By.xpath("//span[text()='Dismiss']"));
		click.click();
		while (click.isDisplayed()) {
			String tx = click.getText();
			System.out.println(tx);

		}
		// Simple prompt
		Thread.sleep(1000);
		WebElement SimpleAlertPrompt = driver.findElement(By.xpath("(//span[text()='Show'])[4]"));
		Ac.moveToElement(SimpleAlertPrompt).click().perform();

		Thread.sleep(1000);
		WebElement Tex = driver.findElement(By.xpath("(//div[@role='dialog'])[2]"));
		Tex.click();

		WebElement Content = driver.findElement(By.xpath("//div[@id='j_idt88:j_idt101_content']"));
		Content.click();
		String verifText = Content.getText();
		System.out.println(verifText);

		driver.findElement(By.xpath("(//a[@role='button']//span)[2]")).click();

		// Alert dialouge
		Thread.sleep(1000);
		WebElement Alertdialouge = driver.findElement(By.xpath("(//span[text()='Show'])[5]"));
		Ac.moveToElement(Alertdialouge).click().perform();

		String verifyText = "TESTING";
		driver.switchTo().alert().sendKeys(verifyText);
		Thread.sleep(1000);
		driver.switchTo().alert().accept();

		WebElement Dialougeverify = driver.findElement(By.id("confirm_result"));
		String Dgtext = Dialougeverify.getText();

		if (Dgtext.equals(Dgtext)) {
			System.out.println("COntent Verified");
		} else {
			System.out.println("Not verified");
		}
		Thread.sleep(1000);
		Ac.moveToElement(Alertdialouge).click().perform();
		driver.switchTo().alert().dismiss();

		// Delete dialouge
		WebElement Delete = driver.findElement(By.xpath("(//span[text()='Delete'])"));
		Ac.moveToElement(Delete).click().perform();

		Thread.sleep(1000);
		WebElement button = driver.findElement(By.xpath("(//span[text()='Yes'])"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);

		// Maximazie/Minimize dialouge
		Thread.sleep(1000);
		WebElement MaxMin = driver.findElement(By.xpath("(//span[text()='Show'])[6]"));
		Ac.moveToElement(MaxMin).click().perform();

		driver.findElement(By.xpath("(//a[@aria-label='Close'])[3]")).click();

	}
}