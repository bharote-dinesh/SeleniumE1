package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		WebElement usnTextBox = driver.findElement(By.name("email"));
		Thread.sleep(2000);
		usnTextBox.sendKeys("Ajay@123");
		
		WebElement passTextBox = driver.findElement(By.name("pass"));
		Thread.sleep(2000);
		passTextBox.sendKeys("Ajay");
		
		WebElement loginbutton = driver.findElement(By.name("login"));
		Thread.sleep(2000);
		loginbutton.click();
		
		

	}

}
