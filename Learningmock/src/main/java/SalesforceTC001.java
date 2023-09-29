
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SalesforceTC001 extends Base {

	@Test(dataProvider = "Excelsenddata")
	public void Salesforce(String Question, String details) throws InterruptedException {

		WebElement Dotfield = driver.findElement(By.xpath("(//button[@type='button'])[7]"));
		waitmethod(Dotfield);
		Dotfield.click();

		WebElement viewall = driver.findElement(By.xpath("//button[text()='View All']"));
		Action(viewall);

		WebElement Contentsearch = driver.findElement(By.xpath("(//input[@type='search'])[3]"));
		Contentsearch.click();
		Contentsearch.sendKeys("Content");

		WebElement Contentclick = driver.findElement(By.xpath("(//*[text()='Content'])[2]"));
		Contentclick.click();

		verify(driver.getTitle());

		WebElement Chatterfield = driver.findElement(By.xpath("//*[text()='Chatter']"));
		waitmethod(Chatterfield);
		Action(Chatterfield);

		WebElement Questions = driver.findElement(By.xpath("(//div[@class='uiTabBar']//following::li[2])[1]"));
		waitmethod(Questions);
		Action(Questions);

		WebElement EnterQuestions = driver.findElement(By.xpath("//*[@class='cuf-questionTitleField textarea']"));
		waitmethod(EnterQuestions);
		Action(EnterQuestions).sendKeys(Question);

		WebElement Details = driver.findElement(By.xpath("(//*[@role='textbox'])[2]"));
		waitmethod(Details);
		Action(Details).sendKeys(details);

		WebElement Ask = driver.findElement(By.xpath("//button[text()='Ask']"));
		Action(Ask).click();

		Thread.sleep(5000);
		WebElement VerifyQuestionappears = driver.findElement(By.xpath("(//*[@data-type='QuestionPost'])[1]"));
		String Verify = Action(VerifyQuestionappears).getText();
		System.out.println(Verify);
		Thread.sleep(5000);
		driver.close();
	}
}
