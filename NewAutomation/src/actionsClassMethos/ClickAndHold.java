package actionsClassMethos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");

		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
		//WebElement circle = driver.findElement(By.xpath("//div[@id='circle']"));
		WebElement circle = driver.findElement(By.xpath("//div[@id='circle']"));
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
	    act.clickAndHold(circle).perform();
	    
	    Thread.sleep(1000);
	    act.release(circle).perform();
	     

	}

}
