package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class FBsignup {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		   WebDriver driver = new ChromeDriver();
		   
		   driver.get("https://www.facebook.com/reg/");
		  // driver.manage().window().maximize();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("anna");
		   driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("lahane");
		   driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("lahaneamit91@gmail.com");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("lahaneamit91@gmail.com");
		   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("lananeA@123");
		  
		   System.out.println("---------isSelected method--------");
		   
		   WebElement male = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		  // male.click();
		   boolean select = male.isSelected(); //isSelected method
		   if(select==true) {
			   System.out.println("YOU SELECT MALE");
		   }
		   else {
			   System.out.println("GENDER IS NOT SELECTED");}
			   
			  System.out.println(); 
		   
		   System.out.println("----------isDisplayed method---------");
		   
		   driver.findElement(By.xpath("//input[@value='-1']")).click();
		  WebElement custom = driver.findElement(By.xpath("//input[@name='custom_gender']"));
		  boolean display = custom.isDisplayed();  //isDisplayed method
		  System.out.println(display); //we can apply for loop for printing is display or not
		   
		  System.out.println();
		 
		  System.out.println("--------getText method--------");
		  
		  WebElement text = driver.findElement(By.xpath("//div[@class='mbs _52lq _9bp_ fsl fwb fcb']"));
		  String gettext = text.getText();
		  System.out.println(gettext);
		  
		  System.out.println();
		 
		  System.out.println("--------getAttribute method--------");
		  
		  WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		  String result = pass.getAttribute("name");
		  System.out.println(result);
		  
		   System.out.println();
			
			System.out.println("--------drop list handeling--------");
			
			System.out.println("--------Day-------");
			WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
			 Select d = new Select(day);
			 d.selectByIndex(23);
			// d.selectByVisibleText("24");
			 //d.selectByValue("24");
			 System.out.println("YOU SELECT DAY 6");
			
			System.out.println("--------month--------");
			WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
			Select s = new Select(month);
			//s.selectByIndex(5);
			//s.selectByVisibleText("Jun");
			s.selectByValue("6");
			System.out.println("YOU SELECT JUNE MONTH");
			
			System.out.println("--------year--------");
			WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
			Select y = new Select(year);
			y.selectByVisibleText("1991");
			System.out.println("you select 1991 year");
			
			System.out.println();
			
			System.out.println("--------getOptions method--------");
			
			List<WebElement> option = s.getOptions();
			int size = option.size();
			for(int i=0; i<=size-1; i++) {
				System.out.print(option.get(i).getText()+" ");
			}
			
			System.out.println();
			System.out.println();
			
			System.out.println("--------list box multiselectable or not -------");
			
			WebElement mon = driver.findElement(By.xpath("//select[@title='Month']"));
			Select m = new Select(mon);
			boolean multi = m.isMultiple();
			if(multi==true) {
				System.out.println("LIST BOX IS MULTISELECTABLE");
			}
			else {
				System.out.println("LIST BOX IS NOT MULTISELECTABLE");}
			
			System.out.println();
			
			System.out.println("--------isEnabled method-------");
			
			WebElement signup = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
			/*boolean signup = driver.findElement(By.xpath("//button[@type='submit'])[1]")).isEnabled();
			if(signup==true)*/ //another way to find isEnabled 
			
			if(signup.isEnabled()) {
				System.out.println("SIGNUP BUTTON IS ENABLED");
			}
			else {
				System.out.println("SIGNUP BUTTON IS DISABLED");
			}
		
		   
		   
		   /*  driver.findElement(By.xpath("//select[@title='Day']")).sendKeys("24");
		   driver.findElement(By.xpath("//select[@title='Month']")).sendKeys("june");
		   driver.findElement(By.xpath("//select[@title='Year']")).sendKeys("1991");
		   driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();*/
		   
		   
	}

}
