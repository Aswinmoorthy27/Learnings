import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SalesforceTC002 extends Base {

	@Test(dataProvider = "Excelsenddata")
	public void Salesforce(String Question, String details) throws InterruptedException {
		Thread.sleep(5000);
		WebElement Dotfield = driver.findElement(By.xpath("(//button[@type='button'])[7]"));
		waitmethod(Dotfield);
		Dotfield.click();

		WebElement viewall = driver.findElement(By.xpath("//button[text()='View All']"));
		Action(viewall);

		WebElement SalesforceChatter = driver.findElement(By.xpath("(//input[@type='search'])[3]"));
		SalesforceChatter.click();
		SalesforceChatter.sendKeys("Salesforce Chatter");
		
		WebElement Performance= driver.findElement(By.xpath("//div[@data-id='02u5g000003Lax4AAC']"));
		Performance.click();
		String Text=Performance.getText();
		
	    if(Text .contentEquals(Text)) 
	    {
	    	System.out.println("Verified");
	    	Thread.sleep(5000);
			driver.close();
	    }
	}
}
