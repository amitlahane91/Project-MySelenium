package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class movetoele {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://www.flipkart.com/");
    Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	Thread.sleep(2000);
	
	WebElement more = driver.findElement(By.xpath("//div[@class='exehdJ']"));
	
	Actions a = new Actions(driver);
	
	a.moveToElement(more).contextClick().build().perform();// Right click used
	
	
	
	
	
	
	//driver.findElement(By.xpath("(//a[@class='_2kxeIr _1pY_1Z'])[3]"))
	

}
}