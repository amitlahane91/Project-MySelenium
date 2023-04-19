package Iframe;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst"); // url where iframe is present
		// url where iframe is present
		
		WebElement iframe1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		// iframe xpath iframe location
		
		
		driver.switchTo().frame(iframe1);
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//driver.switchTo().parentFrame();
		
		// selenium focus diverted to main page 
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		
		ArrayList<String> addr = new ArrayList<String> (driver.getWindowHandles());
		 
		 driver.switchTo().window(addr.get(1));
		
		String z = driver.getTitle();
		System.out.println(z);
		
		driver.findElement(By.xpath("(//a[@title='Video Tutorials'])[1]")).click();
		
		
		
	}
}
