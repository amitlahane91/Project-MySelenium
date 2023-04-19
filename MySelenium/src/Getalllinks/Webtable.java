package Getalllinks;

  
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lahan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(2000);
		
		List<WebElement> NoofRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		// no of rows present webtable
		
		System.out.println(NoofRows.size());
		
		for(int i =1;i<NoofRows.size();i++) {
			List<WebElement> noofcell = driver.findElements(By.xpath("//table[@id='customers']//tr["+(i+1)+"]//td"));
			System.out.println("Row NO :" +i+ "No of Cell " + noofcell.size());
			for(int j=0;j<noofcell.size();j++) {
				System.out.print(noofcell.get(j).getText()+ ", ");
				
			}
			System.out.println();
		}
	
}//["+(i+1)+"]

}
