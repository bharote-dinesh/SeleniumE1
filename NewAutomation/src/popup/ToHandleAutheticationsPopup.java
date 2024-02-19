package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAutheticationsPopup {

	public static void main(String[] args) throws InterruptedException, AWTException {
      
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		Thread.sleep(2000);
		
		Robot rt =new Robot();
		rt.keyPress(KeyEvent.VK_A);
		rt.keyRelease(KeyEvent.VK_A);
		rt.keyPress(KeyEvent.VK_D);
		rt.keyRelease(KeyEvent.VK_D);
		rt.keyPress(KeyEvent.VK_M);
		rt.keyRelease(KeyEvent.VK_M);
		rt.keyPress(KeyEvent.VK_I);
		rt.keyRelease(KeyEvent.VK_I);
		rt.keyPress(KeyEvent.VK_N);
		rt.keyRelease(KeyEvent.VK_N);
		
		rt.keyPress(KeyEvent.VK_TAB);
		rt.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(1000);
		
		rt.keyPress(KeyEvent.VK_A);
		rt.keyRelease(KeyEvent.VK_A);
		rt.keyPress(KeyEvent.VK_D);
		rt.keyRelease(KeyEvent.VK_D);
		rt.keyPress(KeyEvent.VK_M);
		rt.keyRelease(KeyEvent.VK_M);
		rt.keyPress(KeyEvent.VK_I);
		rt.keyRelease(KeyEvent.VK_I);
		rt.keyPress(KeyEvent.VK_N);
		rt.keyRelease(KeyEvent.VK_N);
		
		rt.keyPress(KeyEvent.VK_TAB);
		rt.keyRelease(KeyEvent.VK_TAB);
        
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);

	}

}
