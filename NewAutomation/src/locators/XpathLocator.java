package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();// To launch Chrome Browser
		
		driver.manage().window().maximize();// To Maximize Browser
		
		driver.get("https://www.instagram.com/");// To launch web application
		Thread.sleep(2000);
		WebElement tb = driver.findElement(By.xpath("//input[@name='username']"));
		tb.sendKeys("Rahul");
		Thread.sleep(2000);
		WebElement tp = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		tp.sendKeys("manoj");
		Thread.sleep(2000);

		
		
	}

}
