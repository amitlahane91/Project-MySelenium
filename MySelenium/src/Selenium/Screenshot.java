package Selenium;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();

		driver.get("https://kite.zerodha.com/");
		//driver.manage().window().maximize();
		Thread.sleep(2000);

		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String dateFormat = new SimpleDateFormat("dd_MM_yyyy HH_mm_ss").format(new Date());
		Date date = new Date();
		String date1 = dateFormat.formatted(date);
		//String functions = RandomString.make();
		File dest = new File("C:\\Users\\lahan\\OneDrive\\Pictures\\Screenshots\\Homepage"+date1+".jpg");
		FileHandler.copy(source, dest);


		/*  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		  File dest = new File("C:\\Users\\lahan\\OneDrive\\Pictures\\Screenshots\\amaz.jpg");

		  FileHandler.copy(src, dest);

		 // TakesScreenshot x = new ChromeDriver(); */

	}

}
