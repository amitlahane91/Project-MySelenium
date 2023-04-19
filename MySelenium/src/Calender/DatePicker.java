package Calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) {

		String expectedDay = "13";
		String expectedMonth = "May";
		String expectedYear = "2024";

		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/datepicker/");

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

		driver.switchTo().frame(frame);

		driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();

		while(true) {
			String calenderMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String calenderYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

			if(calenderMonth.equals(expectedMonth)&&calenderYear.equals(expectedYear)) {

				List <WebElement> daysList = driver.findElements(By.xpath("//table/tbody/tr/td"));

				for(WebElement e:daysList) {
					String calenderDay = e.getText();
					if(calenderDay.equals(expectedDay)) {
						e.click();
						break;
					}
				}
				break;
			}
			else {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
		}


	}

}
