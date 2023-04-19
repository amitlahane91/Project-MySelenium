package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Grow {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		WebElement mon = driver.findElement(By.xpath("//select[@title='Month']"));
		Select m = new Select(mon);
		boolean multi = m.isMultiple();
		if(multi==true) {
			System.out.println("LIST BOX IS MULTISELECTABLE");
		}
		else {
			System.out.println("LIST BOX IS NOT MULTISELECTABLE");}
	}

}
