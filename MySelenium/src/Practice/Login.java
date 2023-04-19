package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Login {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.facebook.com/login/");
		driver.get("https://trade.angelbroking.com/login/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		FileInputStream file = new FileInputStream("C:\\Users\\lahan\\OneDrive\\Documents\\Parameter\\FB login credintials\\FB.xlsx");
		String us = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		FileInputStream file1 = new FileInputStream("C:\\Users\\lahan\\OneDrive\\Documents\\Parameter\\FB login credintials\\FB.xlsx");
		String ps = WorkbookFactory.create(file1).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		
		/*driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys(us);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(ps);
		driver.findElement(By.xpath("//button[@value='1']")).click();*/
		
		 driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(us);
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys(ps);
		 driver.findElement(By.xpath("//a[@href='javascript:void(0)']")).click();
		 Thread.sleep(2000);
		
		//if(driver.findElement(By.xpath("//div[@class='_9ay7']")).isDisplayed())
		 if(driver.findElement(By.xpath("//div[@id='dvSignInError']")).isDisplayed())
		
		{ File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String fb = RandomString.make();
		File dest = new File("C:\\Users\\lahan\\OneDrive\\Documents\\Parameter\\FB login Screenshot\\TestCase"+fb+".jpg");
		
		FileHandler.copy(source, dest); }
	}

}
