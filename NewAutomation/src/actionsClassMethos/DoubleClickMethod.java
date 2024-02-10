package actionsClassMethos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {

	public static void main(String[] args) {
		
		 WebDriver	 driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		  
		  Actions act = new Actions(driver);
		   driver.findElement(By.xpath("//section[text()='Button']")).click();	
		  driver.findElement(By.partialLinkText("Double Click")).click();
		  
		  WebElement yesButton = driver.findElement(By.id("btn20"));
		  act.doubleClick(yesButton).perform();
		  WebElement noButton = driver.findElement(By.id("btn23"));
		  act.doubleClick(noButton).perform();
		  WebElement ratinButton = driver.findElement(By.id("btn26"));
		  act.doubleClick(ratinButton).perform();	}

}
