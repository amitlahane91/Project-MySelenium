package Calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Map {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://petdiseasealerts.org/forecast-map#/heartworm-canine/dog/united-states");
		//int id;
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='map-instance-17258']"));
		driver.switchTo().frame(iframe);
		String state = driver.findElement(By.xpath("(//*[@id='1'])[5]")).getText();
		System.out.println(state);
	}

}
