package POPUP;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
//---------------------accept method---------------------------------------------	
	//	driver.findElement(By.xpath("//button[@name='alertbox']")).click();
		//driver.switchTo().alert().accept();
		
//---------------------dismiss method--------------------------------------------------	
		
	//	driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
	//	driver.switchTo().alert().dismiss();
		
//---------------------getText method---------------------------------------------
		
	//	driver.findElement(By.xpath("//button[@name='alertbox']")).click();
	//	String poptext = driver.switchTo().alert().getText();
	//	System.out.println(poptext);
		
//---------------------sendkeys method----------------------------------------------
		
		driver.get("http://cookbook.seleniumacademy.com/Alerts.html");
		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		driver.switchTo().alert().sendKeys("i am ready");
	    driver.switchTo().alert().accept();
		driver.close();
		
		

	
	
}

}
