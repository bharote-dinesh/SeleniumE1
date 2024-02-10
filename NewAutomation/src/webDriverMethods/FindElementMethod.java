package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {
	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/viewcart?exploreMode=true&preference=FLIPKART");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("shoes");
		
	}

}
