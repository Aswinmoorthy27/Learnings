package Faker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker {
	public static void main(String[] args) throws InterruptedException, ParseException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://jqueryui.com/datepicker/");

		driver.switchTo().frame(0);

		// click on date
		driver.findElement(By.id("datepicker")).click();

		// Need to pass date
		String Expecteddate = "17/09/2023";

		// Retrieve month and date
		String[] dateval = Expecteddate.split("/");
		int monthtoselect = Integer.parseInt(dateval[1]);
		System.out.println(monthtoselect);

		String Selectedmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		System.out.println(Selectedmonth);

		// set the format calendar to the month
		SimpleDateFormat input = new SimpleDateFormat("MMMM");
		Calendar cal = Calendar.getInstance();
		cal.setTime(input.parse(Selectedmonth));

		// Convert month name to number
		SimpleDateFormat output = new SimpleDateFormat("MM");
		System.out.println(output.format(cal.getTime()));
		int presentmonth = Integer.parseInt(output.format(cal.getTime()));

		// Logic
		if (monthtoselect > presentmonth) {
			for (int i = 0; i < monthtoselect - presentmonth; i++) {
				driver.findElement(By.xpath("//span[text()='Next']")).click();

			}
		} else if (monthtoselect < presentmonth) {
			for (int i = 0; i < monthtoselect - presentmonth; i++) {
				driver.findElement(By.xpath("//span[text()='Prev']")).click();

			}
		}
		
		driver.findElement(By.linkText(dateval[0])).click();

	}

}
