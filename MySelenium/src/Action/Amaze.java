package Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amaze {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
		   // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    driver.manage().window().maximize();
			driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwibyazQ9sn6AhV6mGYCHUPaBosYABAAGgJzbQ&ohost=www.google.com&cid=CAESa-D2tXtWo4dHdmTV9huvEd9vYJYoqj8CZfvJJxWCDPm4NdcWigoF94jjjOtRTbTIJhTbJ6l5klBxlJeBoIm_YW-DR7c3tFPb7TU6Gi5hOBYRs3F9Z3L7rF-qaJxyAbsUKGL01j0nPpLYF5da&sig=AOD64_2imCw3t_XLdk0n-9eU5DklcMQIRg&q&adurl&ved=2ahUKEwjxjaXQ9sn6AhV8_XMBHTRFAWUQ0Qx6BAgIEAE");
            driver.findElement(By.xpath("//span[@class='nav-line-2 ']")).click();
            driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9730343325");
            driver.findElement(By.xpath("//input[@id='continue']")).click();
            driver.findElement(By.xpath("//input[@type='password']")).sendKeys("amitA@49484");
            driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
            Thread.sleep(1000);
            WebElement x =driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
            Actions w = new Actions(driver);
            w.moveToElement(x).build().perform();
            driver.findElement(By.xpath("//span[text()='Sign Out']")).click();
            
		    
		
		
		
	}

}
