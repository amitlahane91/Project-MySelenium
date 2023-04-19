package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragndrop {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
       
        WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
        
		 WebElement des=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		 
		 Actions a = new Actions(driver);
		 
		 a.moveToElement(src).clickAndHold().moveToElement(des).release().build().perform();
		 a.dragAndDrop(src, des).build().perform();
	
	
	
	
	}	
}