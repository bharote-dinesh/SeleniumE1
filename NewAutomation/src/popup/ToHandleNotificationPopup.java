package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleNotificationPopup {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(3000);
		
		Robot rt=new Robot();
		rt.keyPress(KeyEvent.VK_TAB);
		rt.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		
		rt.keyPress(KeyEvent.VK_TAB);
		rt.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		
		rt.keyPress(KeyEvent.VK_TAB);
		rt.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);


	}

}
