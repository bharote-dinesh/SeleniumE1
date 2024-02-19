package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleProptAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(1000);
		
		//find/create the alert popup
          driver.findElement(By.id("prompt")).click();
          Thread.sleep(1000);
          Alert proptAlert = driver.switchTo().alert();
          String proptText = proptAlert.getText();
          System.out.println(proptText);
          Thread.sleep(1000);
          
          proptAlert.sendKeys("My Name Is Dinesh");
          Thread.sleep(1000);
          proptAlert.accept();

	}

}
