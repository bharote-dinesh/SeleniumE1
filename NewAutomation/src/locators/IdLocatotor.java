package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocatotor {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/login/");
	Thread.sleep(2000);
	WebElement usntextBox = driver.findElement(By.id("email"));
	usntextBox.sendKeys("Suresh@123");
	
	WebElement passTextBox = driver.findElement(By.id("pass"));
	passTextBox.sendKeys("Suresh");
	Thread.sleep(2000);
	
	WebElement loginButton = driver.findElement(By.id("loginbutton"));
	
	loginButton.click();
	
	
	

	}

}
