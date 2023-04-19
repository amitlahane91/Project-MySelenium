package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/"); // url where iframe is present
		
		driver.findElement(By.xpath("//a[@title='Tutorials']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@href='/js/default.asp'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Try it Yourself »']")).click();
		Thread.sleep(2000);*/
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		WebElement x = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(x);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		String y = driver.getTitle();
		System.out.println(y);
		driver.switchTo().parentFrame();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='w3loginbtn']")).click();
		
	
	
	
	
	
	}

}
