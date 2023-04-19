package POPUP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddenpopup {
	
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		//driver.findElement(By.xpath("//a[@class='_1_3w1N']")).click();
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		//driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8793350494");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("8793350494");
		//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
         // driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	
	
}

}
