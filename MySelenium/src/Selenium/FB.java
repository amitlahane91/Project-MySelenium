package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath("//h2[@class='vvzhL ']"));
		String get = text.getText();
		System.out.println(get);
		
		driver.findElement(By.xpath("//input[@aria-label='Mobile Number or Email']")).sendKeys("97303433");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@aria-label='Full Name']")).sendKeys("amit c lahane");
		driver.findElement(By.xpath("//input[@aria-label='Username']")).sendKeys("amitlahane91");
		//driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("amitlahane@123");
	WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	//boolean button = login.isEnabled();
	
	if(login.isEnabled()) {
		System.out.println("SIGN UP BUTTON IS ENABLED");
	}
	else {
		System.out.println("SIGN UP BUTTON IS DISABLED");
		System.out.println("CREATE PASSWORD TO SIGN UP");
	}
	Thread.sleep(3000);

	WebElement correct = driver.findElement(By.xpath("//span[@class='coreSpriteInputError gBp1f']"));
	boolean displ = correct.isDisplayed();
	if(displ=true) {
		System.out.println("ENTER CORRECT MOBILE NUMBER");}
	else {System.out.println("CONTINUE");}
		
		
		
	}

}
