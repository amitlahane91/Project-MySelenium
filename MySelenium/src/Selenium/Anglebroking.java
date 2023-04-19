package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Anglebroking {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\lahan\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		   WebDriver driver = new FirefoxDriver();
		   ////button[@id='tabclose']
		   driver.get("https://trade.angelbroking.com/login/");
		   driver.manage().window().maximize();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("A249093");
		   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abA@92");
		   driver.findElement(By.xpath("//a[@href='javascript:void(0)']")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//button[@id='tabclose']")).click();
	}

}