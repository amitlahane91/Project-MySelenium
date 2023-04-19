package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Practiceall {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.instagram.com/accounts/login/");
	Thread.sleep(3000);
	
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	System.out.println(links.size());
	
	for(int i=0; i<links.size(); i++) {
		System.out.println(links.get(i).getText()+" => "+links.get(i).getAttribute("href"));
	}
	
	Thread.sleep(3000);
	FileInputStream file = new FileInputStream("C:\\Users\\lahan\\OneDrive\\Documents\\Parameter\\FB login credintials\\FB.xlsx\\");
	String un = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	FileInputStream file1 = new FileInputStream("C:\\Users\\lahan\\OneDrive\\Documents\\Parameter\\FB login credintials\\FB.xlsx\\");
	String pswd = WorkbookFactory.create(file1).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pswd);
	driver.findElement(By.xpath("//div[text()='Log In']")).click();
	
	Thread.sleep(3000);
	 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 
	 File dest = new File("C:\\Users\\lahan\\OneDrive\\Documents\\Parameter\\FB login Screenshot\\instaerror.jpg");

	FileHandler.copy(src, dest);
}
}