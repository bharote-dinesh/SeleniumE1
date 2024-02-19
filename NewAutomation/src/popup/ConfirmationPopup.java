package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(1000);
		
		//find/create the alert popup
          driver.findElement(By.id("confirm")).click();
          Thread.sleep(1000);
          
          //switch the control to the alert popup
          Alert confirmation = driver.switchTo().alert();
          Thread.sleep(5000);
          //to accept alert popup
          //confirmation.accept();
          
          //dismiss the alert popup
          
          confirmation.dismiss();
	}

}
