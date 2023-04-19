package Elearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.khanacademy.org/login");
		driver.findElement(By.xpath("//input[@id='uid-login-form-0-wb-id-identifier-field']")).sendKeys("lahaneamit91@gmail.com");
		driver.findElement(By.xpath("//input[@id='uid-labeled-text-field-1-wb-id-field']")).sendKeys("amitA@49484");
		driver.findElement(By.xpath("//button[@role='button']")).submit();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@data-learn-menu-trigger='true']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Class 1']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@class='_acvy8y9']")).click();
		driver.findElement(By.xpath("//h3[normalize-space()='Numbers from 1 to 9']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='_1lrvdlvw']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_1gz49uis']")).click();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		
		for(int i=0; i<6 ; i++) {
		WebElement src = driver.findElement(By.xpath("//img[contains(@src,'ka-perseus-graphie')]"));
		WebElement dest = driver.findElement(By.xpath("//div[@class='perseus-clearfix draggable-box']"));
		act.dragAndDrop(src, dest).build().perform();
		}

}
}