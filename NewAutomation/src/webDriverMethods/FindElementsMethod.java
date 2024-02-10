package webDriverMethods;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	 driver.switchTo().activeElement().sendKeys("Bikes");
     Thread.sleep(2000);
	List<WebElement> bikeOption = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
	/*for (int i =0;i<bikeOption.size();i++)
	{
		String option = bikeOption.get(i).getText();
		System.out.println(option);
		Thread.sleep(1000);
		
	}*/
	 for(WebElement we : bikeOption)
	 {
		 String option = we.getText();
		 System.out.println(option);
		 Thread.sleep(1000);
	 }
		
	}
	
	
	
	}
	


