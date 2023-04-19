package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SBI {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		
	/*	WebElement logbutton = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		/*boolean logbutton = driver.findElement(By.xpath("//button[@type='submit'])[1]")).isEnabled();
		if(logbutton==true)*/ //another way to find isEnabled */
		
		/*if(logbutton.isEnabled()) {
			System.out.println("LOGIN BUTTON IS ENABLED");
		}
		else {
			System.out.println("LOGIN BUTTON IS DISABLED");
		}*/
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("testing tools");
		
		
	
	
	
	}

}
