package POPUP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childpopup {
	
      public static void main(String[] args) {
		
    	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe");
  		WebDriver driver = new ChromeDriver();
  		
  		driver.get("https://www.w3schools.com/js/default.asp");
  		
  		for(int i=0; i<3; i++) {
  		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_myfirst']")).click();
  		}
  		
  		
	}

}
