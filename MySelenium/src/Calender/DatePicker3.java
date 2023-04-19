package Calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker3 {
	public static void main(String[] args) throws InterruptedException {

		String expectedDay = "24";
		String expectedMonthYear = "June 2023";

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.goibibo.com/");
		//driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();


		driver.findElement(By.xpath("(//div[@class='sc-hGPBjI bYQHSX fswFld '])[3]")).click();

		while(true) {
			String calenderMonthYear = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();

			if(calenderMonthYear.equals(expectedMonthYear)) {
				Thread.sleep(2000);
				List<WebElement> daysList = driver.findElements(By.xpath("//p[@class='fsw__date']"));

				for(WebElement e:daysList) {
					String calenderDay = e.getText();
					if(calenderDay.equals(expectedDay)) {
						e.click();
						driver.findElement(By.xpath("//span[@class='fswTrvl__done']")).click();
						break;
					}

				}
				break;
			}
			else {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
			Thread.sleep(1000);
		}
	}

}
