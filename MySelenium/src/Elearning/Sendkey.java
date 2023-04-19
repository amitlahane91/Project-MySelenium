package Elearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkey {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.khanacademy.org/login");
		driver.findElement(By.xpath("//input[@id='uid-login-form-0-wb-id-identifier-field']")).sendKeys("lahaneamit91@gmail.com");
		driver.findElement(By.xpath("//input[@id='uid-labeled-text-field-1-wb-id-field']")).sendKeys("amitA@49484");
		driver.findElement(By.xpath("//button[@role='button']")).submit();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='user-deets editable']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='username']")).clear();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Ajit1234");
		driver.findElement(By.xpath("//textarea[@id='bio-picker']")).clear();
		driver.findElement(By.xpath("//textarea[@id='bio-picker']")).sendKeys("I am an Engineer. I am here to learn something new about career.");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='_dxjxyv7']")).click();
		driver.findElement(By.xpath("//span[@class='_wozql4 _13hnk7qk']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Log out']")).click();
		
	}

}
