package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinktextLocator {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();//To launch Chrome Browser
		driver.manage().window().maximize();//To maximize Browser
		driver.get("https://www.facebook.com/login/");//To Launch The Web Application
		
		WebElement partialLink = driver.findElement(By.partialLinkText("?"));// To Locate Forgotten Password? link
		partialLink.click();// To click on forgotten Password? link


	}

}
