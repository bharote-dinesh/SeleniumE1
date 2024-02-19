package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSlectorLoctor {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement tb = driver.findElement(By.cssSelector("input[aria-label^='Phone number']"));
		tb.sendKeys("Rahul");
		Thread.sleep(2000);
		WebElement tp = driver.findElement(By.cssSelector("input[type^='pass']"));
		tp.sendKeys("manoj");
		Thread.sleep(2000);

	}

}
