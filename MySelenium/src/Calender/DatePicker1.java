package Calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker1 {
	public static void main(String[] args) throws InterruptedException {

		String expectedDay = "24";
		String expectedMonthYear = "Jun 2024";

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.redbus.in/");

		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();

		while(true) {
			String calenderMonthYear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();

			if(calenderMonthYear.equals(expectedMonthYear)) {
				Thread.sleep(2000);
				driver.findElement(By.xpath("//td[text()='" + expectedDay+ "']")).click();

				break;
			}
			else {
				driver.findElement(By.xpath("//td[@class='next']")).click();
			}
			Thread.sleep(1000);
		}	
	}
}
